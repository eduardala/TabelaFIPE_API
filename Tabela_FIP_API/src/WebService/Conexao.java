/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 
 * @author Eduarda de Lima dos Anjos
 */
public class Conexao {
 

    public boolean verifica(){
        try{
        URL url = new URL("http://fipeapi.appspot.com/api/1/carros.json");
        URLConnection conn = url.openConnection();
        conn.connect();
        return true;
        }catch(IOException e){
            return false;
        }
    }
}