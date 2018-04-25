/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deporte.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Meltsan
 */
@Entity
@Table(name="jugador")
public class Jugador implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJugador;
    
    @Column(name="nombre", nullable=false, length=50)
    private String nombreJugador;
    
    @Column(name="primer_apellido", nullable=false, length=50)
    private String primerApellido;
    
    @Column(name="segundo_apellido", nullable=false, length=50)
    private String segundoApellido;
    
    @Column(name="nick_name", nullable=false, length=50)
    private String nickName;
    
    @Column(name="numero", nullable=false, length=3)
    private String numero;
    
    @Column(name="posicion", nullable=false, length=50)
    private String posicion;
    
    public Jugador() { }
    
    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    
    public Long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }

    /**
     * @return the nombreJugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * @param nombreJugador the nombreJugador to set
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
}
