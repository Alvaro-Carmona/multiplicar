/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author EL PANADERO
 */
@Named(value = "multiplica")
@RequestScoped
public class Multiplica {
        private String tabla;

    /**
     * Creates a new instance of Multiplica
     */
    public Multiplica() {
    }
    
    
        public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
    
    
        public void mostrarTabla(){
        int numero = Integer.parseInt(getTabla());
        int res ;
        for (int i = 1; i <= 10; i++) {
           res = numero* i;
        
        
        FacesContext.getCurrentInstance()
        .addMessage(null, new FacesMessage(numero+" x "+i +" = "+res));
        
    }
    }
    
}
