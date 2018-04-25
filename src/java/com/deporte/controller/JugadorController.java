/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deporte.controller;

import com.deporte.domain.Jugador;
import com.deporte.services.JugadorService;
import com.deporte.services.JugadorServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Meltsan
 */
@ViewScoped
@ManagedBean(name = "jugadorController")
public class JugadorController implements Serializable{
    
    private List<Jugador> listaRegistro;
    private Jugador jugador;
    private JugadorService jugadorService;
    private Jugador selectedJugador;
    
    //inicializar objetos
    @PostConstruct
    public void init(){
        this.jugadorService = new JugadorServiceImpl();
        this.jugador = new Jugador();
        this.iniciliazarListaJugador();
    }
    
    private void iniciliazarListaJugador(){
        this.listaRegistro = new ArrayList<Jugador>();
        this.listaRegistro = jugadorService.findAll();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    //método para crear el registro
    public Jugador getJugadorById(Integer idJugador){
        return jugadorService.getJugadorById(idJugador);
    }
    
    //método para crear el registro
    public List<Jugador> finAllJugador(){
        return jugadorService.findAll();
    }
    
    //método para crear el registro
    public String saveJugador(Jugador jugador){
        try {   
            jugadorService.saveJugador(jugador);
            this.jugador = new Jugador();
            return "PlantillaCliente.xhtml";
        } catch (Exception e) {
            return "AltaJugador.xhtml";
        }
    }
    
    //método para crear el registro
    public String goToListJugador(){
        return "PlantillaCliente.xhtml";
    }
    
     //método para crear el registro
    public void updateJugador(Jugador jugador){
        jugadorService.updateJugador(jugador);
    }
    
     //método para crear el registro
    public void deleteJugador(Jugador jugador){
        jugadorService.deleteJugador(jugador);
    }
    
    public void onRowSelect(SelectEvent event){
    }
    
    public void onRowEdit(RowEditEvent event){
        jugadorService.updateJugador(selectedJugador);
        FacesMessage mensaje = new FacesMessage("Jugador Actualizado", "");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
    
    public void onRowCancel(RowEditEvent event){
        FacesMessage mensaje = new FacesMessage("Edicion cancelada");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public List<Jugador> getListaRegistro() {
        return listaRegistro;
    }

    public void setListaRegistro(List<Jugador> listaRegistro) {
        this.listaRegistro = listaRegistro;
    }

    /**
     * @return the selectedJugador
     */
    public Jugador getSelectedJugador() {
        return selectedJugador;
    }

    /**
     * @param selectedJugador the selectedJugador to set
     */
    public void setSelectedJugador(Jugador selectedJugador) {
        this.selectedJugador = selectedJugador;
    }
    
}
