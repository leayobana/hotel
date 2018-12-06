/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.syscenterlife.dao.contCuenta;

import java.util.List;
import pe.com.syscenterlife.modelo.ContCuenta;
import pe.com.syscenterlife.modelo.ContSubCuenta;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
public interface CuentaDaoI {
    public List<ContCuenta> listarEntidad();
    public List<ContCuenta> listarEntidadDato(String dato);
    public ContCuenta buscarEntidadId(int id);
    public void guardarEntidad(ContCuenta cuentas);
    public void eliminarEntidad(int id);
    public void modificarEntidad(ContCuenta cuentas);    
}
