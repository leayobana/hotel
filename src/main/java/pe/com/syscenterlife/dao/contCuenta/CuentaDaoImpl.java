/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.syscenterlife.dao.contCuenta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.syscenterlife.SysDataAccess;

import pe.com.syscenterlife.modelo.ContCuenta;


/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Service
@Transactional
public class CuentaDaoImpl extends SysDataAccess<Integer, ContCuenta> implements CuentaDaoI{

    @Override
    public List<ContCuenta> listarEntidad() {
      return getListAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContCuenta> listarEntidadDato(String dato) {
       return (List<ContCuenta>)sessionFactory.getCurrentSession()
                .createQuery("SELECT p from ContCuenta p WHERE p.cuenta LIKE ?1 ")
                .setParameter(1, "%"+dato+"%")
                .list();   //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContCuenta buscarEntidadId(int id) {
    return getById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarEntidad(ContCuenta cuentas) {
        savev(cuentas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarEntidad(int id) {
        delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarEntidad(ContCuenta cuentas) {
        update(cuentas); //To change body of generated methods, choose Tools | Templates.
    }
    
}
