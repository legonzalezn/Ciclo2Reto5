/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5;


import com.example.reto5.modelos.Contenido;
import com.example.reto5.modelos.Serie;
import com.example.reto5.repositorios.ContenidoRepositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.reto5.repositorios.SerieRepositorio;
import javax.persistence.EntityManager;

/**
 *
 * @author norma
 */
@Component
public class MyRunner implements CommandLineRunner{
    static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
    
    @Autowired
    ContenidoRepositorio contenidoRepositorio;
    @Autowired
    SerieRepositorio serieRepositorio;

    @Override
    public void run(String... args) throws Exception {
        
        seguimiento(0, "Contenido", contenidoRepositorio.count());
        seguimiento(0, "Serie", serieRepositorio.count());
        
        int id = 4000;
        Contenido new_contenido = new Contenido();
        new_contenido.setCon_id(id);
        new_contenido.setCon_nombre("La Odisea");
        
        Serie new_serie = new Serie();
        new_serie.setSer_id(id);
        new_serie.setSer_episodios(400);
        new_serie.setSer_temporadas(1);
        new_serie.setContenido(new_contenido);
        
        new_contenido.setSerie(new_serie);
        
        contenidoRepositorio.save(new_contenido);
        serieRepositorio.save(new_serie);
        //1_35_31
        
        seguimiento(0, "Contenido", contenidoRepositorio.count());
        seguimiento(0, "Serie", serieRepositorio.count());
        seguimiento();
    }
    
    private void seguimiento(int stage, String table, long total){
        logger.info("{} de la inserción en la tabla {}: {}", stage == 0?"Antes":"Después", table, total);
    }
    
    private void seguimiento(){
        logger.info("----------------------------------------------------------------------------");
    }
}
