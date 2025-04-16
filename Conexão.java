/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola;

/**
 *
 * @author daniel
 */
import java.sql.*;
public class Conexão {
    private String url;
    private String username;
    private String password;
    
    public Conexão() {
        url = "jdbc:postgresql://localhost:5432/escola";
        username = "postgres";
        password = "123";
    }
    
     public void setUrl(String u) {
        url = u;
    }
     
    public String getUrl() {
        return url;
    }
    
     public void setUsername(String user) {
        username = user;
    }
     
    public String getUsername() {
        return username;
    }
    
    public void setPassword(String p) {
        password = p;
    }
    public String getPassword() {
        return password;
    }
    
    
    
}
