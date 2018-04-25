/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deporte.dao;

import com.deporte.domain.Jugador;
import java.util.List;

/**
 *
 * @author Meltsan
 */
public interface JugadorDAO {
    
    public List<Jugador> findAll();
    public Jugador getJugadorById(Integer idJugador);
    public void saveJugador(Jugador jugador) throws Exception;
    public void updateJugador(Jugador jugador);
    public void deleteJugador(Jugador jugador);
}
