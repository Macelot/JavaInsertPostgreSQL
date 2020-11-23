/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplopost;

import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conecta conecta;
        conecta = new Conecta();
        //conecta.fazConexao();
        
        conecta.insere();
        conecta.insereComprasVendas();
    }
    
}
