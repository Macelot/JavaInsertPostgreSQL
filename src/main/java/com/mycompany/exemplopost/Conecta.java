/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplopost;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author marce
 */
public class Conecta {
    
    public Connection fazConexao(){
        Connection c=null;
        
        String user,senha,url,porta,host,driver;
        user = "postgres";
        senha = "123";
        porta = "5432";
        host = "localhost";
        
        try {
            driver = "org.postgresql.Driver";
            url="jdbc:postgresql://"+host+":"+porta+"/teste";
            Class.forName(driver);
            c = DriverManager.getConnection(url,user,senha);
            System.out.println("Sucesso");
        } catch (Exception e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
        
        
        return c;
    }
    
    public void insere(){
        String comando;
        comando = "INSERT INTO instrument_quote (id,simbol,price,date) VALUES "
                + "('1','XXYY','15','2020-01-31'),"
                + "('2','XXYY','9','2020-02-01'),"
                + "('3','XXYY','8','2020-02-02'),"
                + "('4','XXYY','7','2020-03-03'),"
                + "('5','XXYY','10.90','2020-03-04'),"
                + "('6','XXYY','7.55','2020-03-05'),"
                + "('7','XXYY','16','2020-03-06');";
        
        Connection c = fazConexao();
        //PreparedStatement pstmt;
        //pstmt = c.prepareStatement(comando);
        
        try {
            Statement stmt = c.createStatement();
            stmt.execute(comando);
            System.out.println("Inserido com sucesso");
        } catch (Exception e) {
            System.out.println("Erro na inserção");
            e.printStackTrace();
        }
       
        
        
    }
    
    public void insereComprasVendas(){
        String comando;
        comando = "INSERT INTO user_trade (id,data,tipo_operacao,quantidade,preco,valor_total ) VALUES "
                + "('1','2020-02-01','Comprei','50','5','250'),"
                + "('2','2020-02-01','Comprei','50','6','300'),"
                + "('3','2020-02-03','Vendi','25','7.5','187.50'),"
                + "('4','2020-02-06','Vendi','15','8','120'),"
                + "('5','2020-02-04','Vendi','5','7.5','37.5'),"
                + "('6','2020-02-05','Comprei','20','15','300');";
        
        Connection c = fazConexao();
        //PreparedStatement pstmt;
        //pstmt = c.prepareStatement(comando);

        try {
            Statement stmt = c.createStatement();
            stmt.execute(comando);
            System.out.println("Inserido com sucesso");
        } catch (Exception e) {
            System.out.println("Erro na inserção");
            e.printStackTrace();
        }
       
        
        
    }
   
}
