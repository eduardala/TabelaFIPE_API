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
public class Modelo {
    String fipe_marca;
    String key;
    String name;
    int id;
    String fipe_name;

    public String getFipe_marca() {
        return fipe_marca;
    }

    public void setFipe_marca(String fipe_marca) {
        this.fipe_marca = fipe_marca;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFipe_name() {
        return fipe_name;
    }

    public void setFipe_name(String fipe_name) {
        this.fipe_name = fipe_name;
    }

    @Override
    public String toString() {
        return "Modelo {key=" + key + ", name=" + name + ", id=" + id + ", fipe_name=" + fipe_name + '}';
    }    
}
