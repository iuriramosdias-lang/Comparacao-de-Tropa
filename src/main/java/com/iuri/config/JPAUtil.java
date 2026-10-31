package com.iuri.config;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory FACTORY =
            Persistence.createEntityManagerFactory("devforce-jpa");

    private JPAUtil() {}

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }

    public void close() {
        FACTORY.close();
    }
}
