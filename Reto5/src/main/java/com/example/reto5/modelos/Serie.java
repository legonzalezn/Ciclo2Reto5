/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5.modelos;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author norma
 */
@Entity
@Table(name = "serie")
public class Serie{
    
    @Id
    @Column(name="ser_id")
    int ser_id;
    
    @Column(name="ser_episodios")
    int ser_episodios;
    
    @Column(name="ser_temporadas")
    int ser_temporadas;
    
    @JoinColumn(name = "ser_id", referencedColumnName = "con_id")
    @OneToOne(fetch = FetchType.EAGER)
    Contenido contenido;
    
    @Override
    public String toString() {
        return "Serie{" + "ser_id=" + ser_id + ", ser_episodios=" + ser_episodios + ", ser_temporadas=" + ser_temporadas + ", contenido=" + contenido + '}';
    }

    public int getSer_id() {
        return ser_id;
    }

    public void setSer_id(int ser_id) {
        this.ser_id = ser_id;
    }

    public int getSer_episodios() {
        return ser_episodios;
    }

    public void setSer_episodios(int ser_episodios) {
        this.ser_episodios = ser_episodios;
    }

    public int getSer_temporadas() {
        return ser_temporadas;
    }

    public void setSer_temporadas(int ser_temporadas) {
        this.ser_temporadas = ser_temporadas;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}
