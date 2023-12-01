package com.uexcel;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.uexcel.connection.DatabaseConnection;
import com.uexcel.entity.Song;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Session session = DatabaseConnection.getSession();
        Transaction trns = session.beginTransaction();
        session.persist(new Song("Ever green", "Green world"));
        trns.commit();
        session.close();
    }
}
