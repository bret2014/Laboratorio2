/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.principal;

import com.mycompany.entidades.Producto;
import com.mycompany.session.ProductoJpaController;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

/**
 *
 * @author Aplicaciones D
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("laboratorio");
        ProductoJpaController pjc = new ProductoJpaController(emf);
        Producto p = new Producto();
        p.setNombre("mantequilla");
        p.setPrecio(BigDecimal.valueOf(13.87));
        pjc.create(p);
    }
    
}
