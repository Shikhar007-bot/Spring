package com.example.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            // Create Address
            Address address = new Address();
            address.setStreet("123 MG Road");
            address.setCity("Bangalore");

            // Create Person
            Person person = new Person();
            person.setName("Ajay");
            person.setAddress(address);

            // Save Person (and associated Address due to cascade)
            session.save(person);

            transaction.commit();

            // Retrieve Person with associated Address
            Person retrievedPerson = session.get(Person.class, person.getId());
            System.out.println("Retrieved Person: " + retrievedPerson);

            session.close();
            factory.close();
        } catch (Exception e) {
            // Handle the exception
            System.out.println("error");;
        }
    }
}
