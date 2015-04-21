package net.iq.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static EntityManagerFactory entityManagerFactory;
    
    static{
        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("jpaStart");
        }catch(Throwable t){
            t.printStackTrace();
            new ExceptionInInitializerError(t);
        }
    }
    
    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }
    
    public void shutDown(){
        getEntityManagerFactory().close();
    }
}
