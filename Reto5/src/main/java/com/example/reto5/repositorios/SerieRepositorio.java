/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5.repositorios;

import com.example.reto5.modelos.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author norma
 */
@Repository
public interface SerieRepositorio extends JpaRepository<Serie, Integer>{
    
}
