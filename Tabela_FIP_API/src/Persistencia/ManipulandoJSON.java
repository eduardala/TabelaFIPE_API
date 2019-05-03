/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import DTO.AnoModelo;
import DTO.Marca;
import DTO.Modelo;
import DTO.VeiculoCompleto;
import WebService.Conexao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Classe para popular e limpar as listas salvas em JSON
 * @author Eduarda de Lima dos Anjos
 */
public class ManipulandoJSON {
    
    Conexao con = new Conexao();

/**
* O método exportaMarca irá popular a lista em JSON
* @param destino destino a ser salvo
* @param marcas lista de marcas
* @return boolean
* @throws IOException 
*/
    public boolean exportaMarca(String destino, List<Marca> marcas) throws IOException {
        if (con.verifica()) {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            FileWriter writer = new FileWriter(destino + "/ListaMarca.json");
            writer.write(gson.toJson(marcas));
            writer.close();
            return true;
        } else {
            System.out.println("SEM CONEXAO");
            return false;
        }
        
    }
    
/**
 * O método limparMarcas irá limpar a lista de marcas já populada
 * @param destino destino que se encontra o arquivo já populado
 * @return boolean
 */
    
    public boolean limparMarcas(String destino) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter(destino + "/ListaMarca.json");
        writer.write(gson.toJson("{}"));
        writer.close();
        return true;
    }

/**
 * O método exportaModelo irá popular a lista em JSON
 * @param destino destino a ser salvo
 * @param modelos lista de modelos
 * @param marca id da marca com base na lista de marcas populada
 * @return boolean
 */
   public boolean exportaModelo(String destino,List<Modelo> modelos, String marca) throws IOException{
       if (con.verifica()) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter(destino + "/ListaModelo.json");
        writer.write(gson.toJson(modelos));
        writer.close();
        return true;
       } else {
           System.out.println("SEM CONEXÃO");
           return false;
       } 
    }

/**
 * O método limparModelo irá limpar a lista de marcas já populada
 * @param destino destino que se encontra o arquivo já populado
 * @return boolean
 */
    public boolean limparModelo(String destino) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter(destino + "/ListaModelo.json");
        writer.write(gson.toJson("{}"));
        writer.close();
        return true;
    }

/**
 * O método exportaAnoModelo irá popular a lista em JSON
 * @param destino destino a ser salvo
 * @param anoModelo lista de ano modelo
 * @param marca id da marca
 * @param modelo id do modelo
 * @return boolean
 */
   public boolean exportaAnoModelo(String destino,List<AnoModelo> anoModelo, String marca, String modelo) throws IOException{
       if (con.verifica()) {
            GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter(destino + "/ListAnoModelo.json");
        writer.write(gson.toJson(anoModelo));
        writer.close();
        return true;
       } else {
           System.out.println("SEM CONEXAO");
           return false;
       }
    }
   
/**
 * O método limparModelo irá limpar a lista de marcas já populada
 * @param destino destino que se encontra o arquivo já populado
 * @return boolean
 */
    public boolean limparAnoModelo(String destino) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter(destino + "/ListAnoModelo.json");
        writer.write(gson.toJson("{}"));
        writer.close();
        return true;
    }

/**
 * O método exportaVeiculoCompleto irá popular a lista em JSON
 * @param destino destino a ser salvo 
 * @param veiculo lista de veiculo
 * @param marca id da marca
 * @param modelo id do modelo
 * @param ano id do ano
 * @return boolean
 */
    public boolean exportaVeiculoCompleto(String destino,List<VeiculoCompleto> veiculo, String marca, String modelo, String ano) throws IOException{
        if (con.verifica()) {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            FileWriter writer = new FileWriter(destino + "/ListaVeiculo.json");
            writer.write(gson.toJson(veiculo));
            writer.close();
            return true;
        } else {
            System.out.println("SEM CONEXÃO");
            return false;
        }  
    } 
    
/**
 * O método limparModelo irá limpar a lista de marcas já populada
 * @param destino destino que se encontra o arquivo já populado
 * @return boolean
 */
    public boolean limparVeiculoCompleto(String destino) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter(destino + "/ListaVeiculo.json");
        writer.write(gson.toJson("{}"));
        writer.close();
        return true;
    }
}
