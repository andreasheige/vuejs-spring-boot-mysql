package com.taskagile.infrastrucure.repository;

import org.hibernate.Session;
import javax.persistence.EntityManager;

abstract class HibernateSupport {

    EntityManager entityManager;

    HibernateSupport(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    Session getSessions(){
        return entityManager.unwrap(Session.class);
    }
}