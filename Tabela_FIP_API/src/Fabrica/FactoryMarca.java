/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import DTO.Marca;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import InterfaceFabricas.IFactory;

/**
 *
 * @author Eduarda de Lima dos Anjos
 */
public class FactoryMarca implements IFactory {

    @Override
    public List<Marca> criarLista(String url) {
        InputStream is=null;
        try {
            is = new URL(url).openStream();
        } catch (MalformedURLException ex) {
            Logger.getLogger(FactoryMarca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FactoryMarca.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
        
        Type listType = new TypeToken<ArrayList<Marca>>() {
        }.getType();
        List<Marca> lista;

        lista = new Gson().fromJson(bufferedReader, listType);
        return lista;
    }

    
}
