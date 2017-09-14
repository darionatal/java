package br.senac.rn.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class CategoriaDAO {

    private EntityManager manager;
    private EntityManagerFactory factory;

    public CategoriaDAO() {
        factory = Persistence.createEntityManagerFactory("conexao_db");
        manager = factory.createEntityManager();
    }
}
