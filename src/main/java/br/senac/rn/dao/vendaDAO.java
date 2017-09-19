package br.senac.rn.dao;

import br.iskisita.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class vendaDAO {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public vendaDAO() {
        factory = Persistence.createEntityManagerFactory("conexao_db");
        manager = factory.createEntityManager();
    }

    public void insereVenda(Venda venda) {
        manager.getTransaction().begin();
        manager.persist(venda);
        manager.getTransaction().commit();
        manager.close();
    }

    public void alteraVenda() {
        manager.getTransaction().begin();
        //manager.merge(venda);
        manager.getTransaction().commit();

    }

    public List<Venda> buscarTodos() {
        TypedQuery<Venda> consulta = manager.createQuery("select s from tb_venda s", Venda.class);
        return consulta.getResultList();
    }

    public Venda buscarPorId(int id) {

        return manager.find(Venda.class, id);
    }

}
