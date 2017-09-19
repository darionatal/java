package br.senac.rn.dao;

import br.iskisita.Categoria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class categoriaDAO {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public categoriaDAO() {
        factory = Persistence.createEntityManagerFactory("conexao_db");
        manager = factory.createEntityManager();
    }
    public void inserirCategoria(Categoria categoria){
        manager.getTransaction().begin();
        manager.persist(categoria);
        manager.getTransaction().commit();
        manager.close();
    }
    public void atualizaCategoria(Categoria categoria){
        manager.getTransaction().begin();
        manager.merge(categoria);
        manager.getTransaction().commit();
        manager.close();
    }
    public void removeCategoria(Categoria categoria){
        manager.getTransaction().begin();
        manager.remove(categoria);
        manager.getTransaction().commit();
        manager.close();
    }
        public List<Categoria> buscarTodos() {
        TypedQuery<Categoria> consulta = manager.createQuery("select s from Categoria s", Categoria.class);
        return consulta.getResultList();
    }
        public Categoria buscaPorId(int id){
            return manager.find(Categoria.class, id);
        }
}
