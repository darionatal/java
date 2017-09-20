package br.iskisita.rn.util;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public abstract class genericDAO<T> {

    protected static EntityManager manager;

    public abstract Class<T> getClassType();

    public EntityManager getEm(){
        if (manager == null || !manager.isOpen()){
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    }
    
    public void insert(T t) {
        getEm().getTransaction().begin();
        getEm().persist(t);
        getEm().getTransaction().commit();
    }

    public T delete(T t) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        } catch (Exception error) {
            error.printStackTrace();
            em.getTransaction().rollback();
        }
        return t;
    }

    public T update(T t) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        } catch (Exception error) {
            error.printStackTrace();
            em.getTransaction().rollback();
        }
        return t;
    }

    public T selectById(int id) {
        EntityManager em = getEm();
        return em.find(getClassType(), id);
    }

    public List<T> selectALL() {
        EntityManager em = getEm();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(getClassType());
        TypedQuery<T> typedQuery = em.createQuery(query.select(query.from(getClassType())));
        return typedQuery.getResultList();
    }

}
