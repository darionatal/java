package br.senac.rn.dao;

import br.iskisita.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class produtoDAO {
        private EntityManager manager;
    private EntityManagerFactory factory;

    public produtoDAO() {
        factory = Persistence.createEntityManagerFactory("conexao_db");
        manager = factory.createEntityManager();
    }
    public void inserirProduto(Produto produto){
        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();
        manager.close();
    }
    public void alterarProduto(Produto produto){
        manager.getTransaction().begin();
        manager.merge(produto);
        manager.getTransaction().commit();
        manager.close();
    }
    public void apagarProduto(Produto produto){
        manager.getTransaction().begin();
        manager.remove(produto);
        manager.getTransaction().commit();
        manager.close();
    }
        public List<Produto> buscarTodos() {
        TypedQuery<Produto> consulta = manager.createQuery("select s from tb_produtos s", Produto.class);
        return consulta.getResultList();
    }
    public Produto buscarPorId(int id){
        
        return manager.find(Produto.class, id);
        
    }
}
