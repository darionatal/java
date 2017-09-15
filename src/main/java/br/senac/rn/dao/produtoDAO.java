package br.senac.rn.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class produtoDAO {
        private EntityManager manager;
    private EntityManagerFactory factory;

    public produtoDAO() {
        factory = Persistence.createEntityManagerFactory("conexao_db");
        manager = factory.createEntityManager();
    }
    
}
