/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceFabricas;

import DTO.Marca;
import DTO.Modelo;
import java.util.List;

/**
 *
 * @author Eduarda de Lima dos Anjos
 */
public interface IFactory {
    public List<?> criarLista (String url);
}
