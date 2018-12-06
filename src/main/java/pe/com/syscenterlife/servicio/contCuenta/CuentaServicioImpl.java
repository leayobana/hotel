/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.syscenterlife.servicio.contCuenta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.syscenterlife.dao.contCuenta.CuentaDaoI;
import pe.com.syscenterlife.modelo.ContCuenta;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Service
@Transactional
public class CuentaServicioImpl implements CuentaServicioI{

    @Autowired
    public CuentaDaoI daoI;    
    @Override
    public List<ContCuenta> listarEntidad(){return daoI.listarEntidad();}
    @Override
    public List<ContCuenta> listarEntidadDato(String dato){return daoI.listarEntidadDato(dato);}
    @Override
    public ContCuenta buscarEntidadId(int id){return daoI.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(ContCuenta cuentas){daoI.guardarEntidad(cuentas);}
    @Override
    public void eliminarEntidad(int id){daoI.eliminarEntidad(id);}
    @Override
    public void modificarEntidad(ContCuenta cuentas){daoI.modificarEntidad(cuentas);}     
}
