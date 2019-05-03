/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DTO.*;

/**
 *
 * @author Eduarda de Lima dos Anjos
 */
public class VeiculoCompleto {
    int id;
    int ano_modelo;
    String marca;
    String name;
    String veiculo;
    String preco;
    String gasolina;
    String referencia;
    String fipe_codigo;
    String key;

    public VeiculoCompleto(int id, int ano_modelo, String marca, String name, String veiculo, String preco, String gasolina, String referencia, String fipe_codigo, String key) {
        this.id = id;
        this.ano_modelo = ano_modelo;
        this.marca = marca;
        this.name = name;
        this.veiculo = veiculo;
        this.preco = preco;
        this.gasolina = gasolina;
        this.referencia = referencia;
        this.fipe_codigo = fipe_codigo;
        this.key = key;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFipe_codigo() {
        return fipe_codigo;
    }

    public void setFipe_codigo(String fipe_codigo) {
        this.fipe_codigo = fipe_codigo;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "VeiculoCompleto{" + "id=" + id + ", ano_modelo=" + ano_modelo + ", marca=" + marca + ", name=" + name + ", veiculo=" + veiculo + ", preco=" + preco + ", gasolina=" + gasolina + ", referencia=" + referencia + ", fipe_codigo=" + fipe_codigo + ", key=" + key + '}';
    }

  
}
