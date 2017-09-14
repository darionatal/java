/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.rn.dao;

import br.iskisita.Sexo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author a9166375
 */
public class sexoDAO {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public sexoDAO() {
        factory = Persistence.createEntityManagerFactory("conexao_db");
        manager = factory.createEntityManager();
    }

    public void inserir(Sexo sexo) {
        manager.getTransaction().begin();
        manager.persist(sexo);
        manager.getTransaction().commit();
    }

    public void excluir(Sexo sexo) {
        manager.getTransaction().begin();
        manager.remove(sexo);
        manager.getTransaction().commit();
    }

    public void atualizar(Sexo sexo) {
        manager.getTransaction().begin();
        manager.merge(sexo);
        manager.getTransaction().commit();
    }

    public List<Sexo> buscarTodos() {
        TypedQuery<Sexo> consulta = manager.createQuery("select s from Sexo s", Sexo.class);
        return consulta.getResultList();
    }
    public Sexo buscarPorId(int id){
        
        return manager.find(Sexo.class, id);
    }

}
