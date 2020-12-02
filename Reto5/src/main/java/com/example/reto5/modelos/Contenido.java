/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author norma
 */
@Entity
@Table(name="contenido")
public class Contenido {
    
    @Id
    @Column(name="con_id")
    int con_id;
    
    @Column(name="con_nombre")
    String con_nombre;
    
    @OneToOne(mappedBy = "contenido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    Serie serie;
/*
    public Contenido() {
    }

    public Contenido(int id){
        setCon_id(id);
    }
*/
    public int getCon_id() {
        return con_id;
    }

    public void setCon_id(int con_id) {
        this.con_id = con_id;
    }

    public String getCon_nombre() {
        return con_nombre;
    }

    public void setCon_nombre(String con_nombre) {
        this.con_nombre = con_nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Contenido{" + "con_id=" + con_id + ", con_nombre=" + con_nombre + ", serie=" + serie + '}';
    }
}
