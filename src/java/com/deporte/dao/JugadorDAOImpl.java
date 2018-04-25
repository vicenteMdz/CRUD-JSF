/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deporte.dao;

import com.deporte.domain.Jugador;
import com.deporte.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Meltsan
 */
public class JugadorDAOImpl implements JugadorDAO{
    
    Session session;

    @Override
    public List<Jugador> findAll() {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            return session.createQuery("FROM Jugador").list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Jugador getJugadorById(Integer idJugador) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            return (Jugador) session.createQuery("SELECT * FROM Jugador J where J.idJugador = " + idJugador).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void saveJugador(Jugador jugador) throws Exception{
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(jugador);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }

    @Override
    public void updateJugador(Jugador jugador) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(jugador);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteJugador(Jugador jugador) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(jugador);
            //session.createQuery("DELETE FROM jugador where idJugador = " + idJugador).executeUpdate();
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
