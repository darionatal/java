package br.senac.rn.dao;

import br.iskisita.Sexo;
import br.iskisita.rn.util.genericDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class sexoDAO extends genericDAO<Sexo>{

    private EntityManager manager;
    private EntityManagerFactory factory;

    public sexoDAO() {
        factory = Persistence.createEntityManagerFactory("conexao_db");
        manager = factory.createEntityManager();
    }

//    public void inserir(Sexo sexo) {
//        manager.getTransaction().begin();
//        manager.persist(sexo);
//        manager.getTransaction().commit();
//        manager.close();
//    }

    public void excluir(Sexo sexo) {
        manager.getTransaction().begin();
        manager.remove(sexo);
        manager.getTransaction().commit();
        manager.close();
    }

    public void atualizar(Sexo sexo) {
        manager.getTransaction().begin();
        manager.merge(sexo);
        manager.getTransaction().commit();
        manager.close();
    }

    public List<Sexo> buscarTodos() {
        TypedQuery<Sexo> consulta = manager.createQuery("select s from Sexo s", Sexo.class);
        return consulta.getResultList();
    }
    public Sexo buscarPorId(int id){
        
        return manager.find(Sexo.class, id);
    }

    @Override
    public Class<Sexo> getClassType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
