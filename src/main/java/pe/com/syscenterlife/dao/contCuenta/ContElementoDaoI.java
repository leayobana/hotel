/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.syscenterlife.dao.contCuenta;

import java.util.List;
import pe.com.syscenterlife.modelo.ContElemento;

/**
 *
 * @author ALEXIS
 */
public interface ContElementoDaoI {
     public List<ContElemento> listarEntidad();
    public List<ContElemento> listarEntidadDato(String dato);
    public ContElemento buscarEntidadId(int id);
    public void guardarEntidad(ContElemento contElemento);
    public void eliminarEntidad(int id);
    public void modificarEntidad(ContElemento contElemento);
}
