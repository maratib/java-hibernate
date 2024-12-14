package com.mak;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Unit test for simple App.
 */
class HibernateTest {

    private SessionFactory sessionFactory;

    @BeforeEach
    void setUp() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @AfterEach
    protected void tearDown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {

        User user = new User();
        user.setName("John Doe");
        // user.setEmail("john.doe@example.com");
        // user.setPassword("123456");

        System.out.println(user);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

        assertEquals(1, 1);
    }
}
