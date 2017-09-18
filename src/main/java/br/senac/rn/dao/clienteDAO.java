package br.senac.rn.dao;

import br.iskisita.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class clienteDAO {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public clienteDAO() {
        factory = Persistence.createEntityManagerFactory("conexao_db");
        manager = factory.createEntityManager();
    }

    public void inserirCliente(Cliente cliente) {
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    }

    public void alterarCliente(Cliente cliente) {
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }

    public void excluirCliente(Cliente cliente) {
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
    }

    public List<Cliente> buscaTodosCliente() {
        TypedQuery<Cliente> consulta = manager.createQuery("select s from tb_cliente s", Cliente.class);
        return consulta.getResultList();
    }
    public Cliente  buscaPorId(int id){
        return manager.find(Cliente.class, id);
    }
}
