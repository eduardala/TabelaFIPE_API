/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIPE;

import DTO.AnoModelo;
import DTO.Marca;
import DTO.Modelo;
import DTO.VeiculoCompleto;
import Fabrica.FactoryAnoModelo;
import Fabrica.FactoryMarca;
import Fabrica.FactoryVeiculoCompleto;
import Fabrica.FactoryModelo;
import WebService.Conexao;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para realizar a chamada dos métodos de criação de listas.
 * @author Eduarda de Lima dos Anjos
 */
public class Fipe {
    private static Object f;

    Conexao con = new Conexao();
    
/**
 * Método para realizar a criação da lista de marcas.
 * @param tipoLista tipo da lista a ser recebida
 * @return Lista Marca
 */
    public List<Marca> criarListaMarca(String tipoLista){
        String url = "http://fipeapi.appspot.com/api/1/carros/marcas.json";
        if (con.verifica()) {
            return (List<Marca>) factoryLista(tipoLista, url);
        }
        return new ArrayList<Marca>();
    }
    
/**
 * Método para realizar a criação da lista de modelos.
 * @param tipoLista tipo da lista a ser recebida
 * @param id id da marca
 * @return Lista Modelo
 */
    public List<Modelo> criarListaModelo(String tipoLista, int id) {
        String url = "http://fipeapi.appspot.com/api/1/carros/veiculos/" + id + ".json";
        if (con.verifica()){
        return (List<Modelo>) factoryLista(tipoLista, url);
        }
        return new ArrayList<Modelo>();
    }
    
/**
 *  Método para realizar a criação da lista de referente ao ano modelo.
 * @param tipoLista tipo da lista a ser recebida
 * @param idMarca id da marca
 * @param idModelo id do modelo
 * @return Lista Ano Modelo
 */
    public List<AnoModelo> criarListaAnoModelo(String tipoLista, int idMarca, int idModelo) {
        String url = "http://fipeapi.appspot.com/api/1/carros/veiculo/" + idMarca + "/" + idModelo + ".json";
        if (con.verifica()){
            return (List<AnoModelo>) factoryLista(tipoLista, url);
        } 
        return new ArrayList<AnoModelo>();
    }

/**
 * Método para realizar a criação da lista de referente ao resultado do veículo com base nas buscas anteriores.
 * @param tipoLista tipo da lista a ser recebida
 * @param idMarca id da marca
 * @param idModelo id do modelo
 * @param idAnoModelo ano modelo
 * @return Lista veículo
 */
    public List<VeiculoCompleto> criarListaVeiculoCompleto(String tipoLista, int idMarca, int idModelo, String idAnoModelo) {
        String url = "http://fipeapi.appspot.com/api/1/carros/veiculo/" + idMarca + "/" + idModelo + "/" + idModelo + ".json";
        if (con.verifica()){
            return (List<VeiculoCompleto>) factoryLista(tipoLista, url);
        } 
            return new ArrayList<VeiculoCompleto>();
    }

/**
 * Irá realizar a busca da fábrica da lista com base na palavra passada como parâmetro.
 * @param tipo tipo da lista a ser recebida
 * @param url url que receberá
 * @return Lista
 */   
    
    public List<?> factoryLista(String tipo, String url) {
        if ("MARCA".equalsIgnoreCase(tipo)) {
            FactoryMarca fac = new FactoryMarca();
            return fac.criarLista(url);
        } else if ("MODELO".equalsIgnoreCase(tipo)) {
            FactoryModelo fac = new FactoryModelo();
            return fac.criarLista(url);
        } else if ("ANOMODELO".equalsIgnoreCase(tipo)) {
            FactoryAnoModelo fac = new FactoryAnoModelo();
            return fac.criarLista(url);
        } else if ("VEICULOCOMPLETO".equalsIgnoreCase(tipo)) {
            FactoryVeiculoCompleto fac = new FactoryVeiculoCompleto();
            return fac.criarLista(url);
        }
        return null;
    }
}
