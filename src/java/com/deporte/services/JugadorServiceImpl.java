/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deporte.services;

import com.deporte.dao.JugadorDAO;
import com.deporte.dao.JugadorDAOImpl;
import com.deporte.domain.Jugador;
import java.util.List;

/**
 *
 * @author Meltsan
 */
public class JugadorServiceImpl implements JugadorService{
    
    private JugadorDAO jugadorDao = new JugadorDAOImpl();
    
    @Override
    public List<Jugador> findAll() {
        return jugadorDao.findAll();
    }

    @Override
    public Jugador getJugadorById(Integer idJugador) {
        return jugadorDao.getJugadorById(idJugador);
    }

    @Override
    public void saveJugador(Jugador jugador) throws Exception{
        jugadorDao.saveJugador(jugador);
    }

    @Override
    public void updateJugador(Jugador jugador) {
        jugadorDao.updateJugador(jugador);
    }

    @Override
    public void deleteJugador(Jugador jugador) {
        jugadorDao.deleteJugador(jugador);
    }
    
}
