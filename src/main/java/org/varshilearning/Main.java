package org.varshilearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//        Alien a1 = new Alien();
//        a1.setAid(102);
//        a1.setName("Varsha");
//        a1.setTech("Spring"); this are no need while fetching the data bcz they are already present in the database
        Configuration config = new Configuration();
        config.addAnnotatedClass(org.varshilearning.Alien.class);
        config.configure();
// SessionFactory factory = new Configuration().addAnnotatedClass().configure().buildSessionFactory(); u can write in one line
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        transaction is needed when you saving,updating,and deleting not when fetching
//        session.persist(a1); to fetch the data we need to remove this , to create the data
//        Alien a1 =session.buId(Alien.class).getReference(102); lazy fetching
        Alien a1 =session.get(Alien.class,102);// eager fetching
        // session.merge(a1); this is to update the data (if obj is there it updates,if not there is will create/insert )
        //Alien a1 = session.find(Alien.class,104);
        //session.remove(a1);
        System.out.println(a1);
//        tx.commit();
        session.close();
        factory.close();
        }
     }
