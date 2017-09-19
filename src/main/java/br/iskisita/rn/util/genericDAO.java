
package br.iskisita.rn.util;

import javax.persistence.EntityManager;


public abstract class genericDAO<T> {
    protected static EntityManager manager;
    public abstract Class<T> getClassType();
    public EntityManager getEm(){
        if (manager == null){
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    }
    public void insert(T t){
        getEm().getTransaction().begin();
        getEm().persist(t);
        getEm().getTransaction().commit();
    }
}
