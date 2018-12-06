/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.syscenterlife.control.contCuenta;




import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import pe.com.syscenterlife.modelo.ContCuenta;
import pe.com.syscenterlife.servicio.contCuenta.CuentaServicioI;

import org.springframework.web.servlet.view.RedirectView;
import pe.com.syscenterlife.dao.contCuenta.CuentaDaoI;
import pe.com.syscenterlife.modelo.ContCuenta;

import pe.com.syscenterlife.servicio.contCuenta.CuentaServicioI;


/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Controller
public class CuentaControl {
    
    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    CuentaServicioI cuenServicioI;
    
    @Autowired
    CuentaServicioI cuentaServicioI;

//
//    @RequestMapping(value = {"/cuenMain" }, method = RequestMethod.GET)    
//    public ModelAndView inicioCuenta(Locale locale, Map<String,Object> model){
//        String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);
//        List<ContCuenta> lista=cuenServicioI.listarEntidad();
//
//        model.put("ListaCuenta", lista);
//        model.put("message", welcome);
//        model.put("startMeeting", "09:10");        
//        return new ModelAndView("ContCuenta/Cuenta/mainCuenta");
//
//    }   
//    
//@RequestMapping(value = "/formCuenta", method = RequestMethod.GET)
//public ModelAndView irFormulario(@ModelAttribute("modeloCuenta")ContCuenta cuenta,
//        BindingResult result, Model model){
//        List<Cuenta> lista=cuentaServicioI.listarEntidad();
//        model.addAttribute("urlAccion", "guardarCuenta"); 
//        model.addAttribute("ListCuenta", lista); 
//        
//    return new ModelAndView("contCuenta/Cuenta/formCuen");
//}    
//    
//    
//
//    
//    @RequestMapping(value = {"/buscarCuen"}, method = RequestMethod.POST)
//    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
//        String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);
//        String dato=r.getParameter("dato");
//        List<ContCuenta> lista=cuentaServicioI.listarEntidadDato(dato);
//        model.put("ListaCuenta", lista);
//        model.put("message", welcome);
//        model.put("startMeeting", "09:10");    
//    return new ModelAndView("contCuenta/Cuenta/mainCuen");
//    } 
//    
//    @RequestMapping(value = {"/elimCuen" }, method = RequestMethod.GET)
//    public ModelAndView eliminarCuenta(HttpServletRequest r){
//        int idEntidad=Integer.parseInt(r.getParameter("id"));
//        cuentaServicioI.eliminarEntidad(idEntidad);
//    return new ModelAndView(new RedirectView("/cuenMain"));
//    }    
@RequestMapping ( value  = { " /cuenMain " }, method  =  RequestMethod . GET )
    public  ModelAndView  inicioProducto ( Locale  locale , Map < String , Object >  model ) {
        String welcome = messageSource . getMessage ( " welcome.message " , nuevo  objeto [] { " -ANONYMOUS- " }, locale);
        Lista < GloUnidadmedProducto > lista =  UmedidaproductoServicioI . listarEntidad ();

        modelo . put ( " ListaUniMediProducto " , lista);
        modelo . poner ( " mensaje " , bienvenido);
        modelo . put ( " startMeeting " , " 09:10 " );
        devuelve  nuevo  ModelAndView ( " global / unidadmediproducto / mainUniMedProducto " );
    }
    
  
  @RequestMapping ( value  = { " / buscarump " }, method  =  RequestMethod . POST )
    public   ModelAndView  buscarEntidad ( Map < String , Object >  model , HttpServletRequest  r , @ModelAttribute ( " modeloump " ) GloUnidadmedProducto  ump ,
        BindingResult  result ) {
        Cadena dato = r . getParameter ( " dato " );
        Lista < GloUnidadmedProducto > lista = UmedidaproductoServicioI . listarEntidadDato (dato);
        modelo . put ( " ListaUniMediProducto " , lista);
        modelo . put ( " noresults " , " No se encontraron coincidencias. " );
        modelo . put ( " accion " , " Add ... " );
        devuelve  nuevo  ModelAndView ( " global / unidadmediproducto / mainUniMedProducto " );
    } 

    @RequestMapping ( value  = { " / elimump " }, method  =  RequestMethod . GET )
    public  ModelAndView  eliminarPersona ( HttpServletRequest  r ) {
        int idEntidad =  Integer . parseInt (r . getParameter ( " id " ));
        UmedidaproductoServicioI . eliminarEntidad (idEntidad);
        devolver  nuevo  ModelAndView ( nuevo  RedirectView ( " / prodMain " ));
    }

    @RequestMapping ( value  =  " / formump " , method  =  RequestMethod . GET )
    público  ModelAndView  irFormulario ( @ModelAttribute ( " modeloump " ) GloUnidadmedProducto  ump ,
             Resultado de BindingResult , Map < String , Object >  model ) {
        Lista < GloUnidadMedida >  Umedida  = unidadmedidaServicioI . listarEntidad ();
        modelo . put ( " urlAccion " , " guardarUMP " );
        modelo . put ( " ListarUnidadMedida " , Umedida );
//
        Lista < GloProductos > producto = productoServicioI . listarEntidad ();
        modelo . put ( " ListaProducto " , producto);
        devuelve el  nuevo  ModelAndView ( " global / unidadmediproducto / formUnimPro " );
    }
//
 @RequestMapping ( value  =  " / guardarUMP " , method  =  RequestMethod . POST )
    pública  ModelAndView  guardarEntidad ( @ModelAttribute ( " modeloump " ) GloUnidadmedProducto  UMP , BindingResult  resultado , Modelo  modelo ) {        
        
     prueba {
            if (ump . getIdUnidMedProducto () ==  null )
            UmedidaproductoServicioI . guardarEntidad (ump);
	más
            UmedidaproductoServicioI . ModificarEntidad (ump);
        
     } catch ( Exception e) {logger . info ( " ERRROR: " + e . getMessage ());
     }
     devolver  nuevo  ModelAndView ( nuevo  RedirectView ( " / prodMain " ));
    } 

    
      @RequestMapping ( value  = { " / formModifump " }, method  =  RequestMethod . GET )
    pública  ModelAndView  actualizarEntidad ( HttpServletRequest  r , Map < String , Object >  model ) {
        int idEntidad = Integer . parseInt (r . getParameter ( " id " ));       
        Lista < GloUnidadmedProducto > lista =  UmedidaproductoServicioI . listarEntidad ();
        modelo . put ( " ListaUniMediProducto " , lista);
        modelo . put ( " modeloump " , UmedidaproductoServicioI . buscarEntidadId (idEntidad));
        modelo . put ( " accion " , " Edit ... " );
        Lista < GloUnidadMedida >  Umedida  = unidadmedidaServicioI . listarEntidad ();
        modelo . put ( " urlAccion " , " guardarUMP " );
        modelo . put ( " ListarUnidadMedida " , Umedida );
//
        Lista < GloProductos > producto = productoServicioI . listarEntidad ();
        modelo . put ( " ListaProducto " , producto);
        devuelve el  nuevo  ModelAndView ( " global / unidadmediproducto / formUnimPro " );
    }
}

