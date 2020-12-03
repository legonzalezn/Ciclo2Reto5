/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author norma
 */
@Entity
@Table(name = "pelicula")
public class Pelicula {
    
    @Id
    @Column(name="pel_id")
    int ser_id;
    
    @Column(name="ser_episodios")
    int ser_episodios;
    
    @Column(name="ser_temporadas")
    int ser_temporadas;
    
    @JoinColumn(name = "ser_id", referencedColumnName = "con_id")
    @OneToOne(fetch = FetchType.EAGER)
    Contenido contenido;
}
