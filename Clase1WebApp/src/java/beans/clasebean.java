/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.PropertyChangeSupport;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author User
 */
@Named(value = "clasebean")
@Dependent
public class clasebean {

    /**
     * Creates a new instance of clasebean
     */
    
    private String nombreUsuario = "Frank";
    public clasebean() {
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        java.lang.String oldNombreUsuario = this.nombreUsuario;
        this.nombreUsuario = nombreUsuario;
        propertyChangeSupport.firePropertyChange(PROP_NOMBREUSUARIO, oldNombreUsuario, nombreUsuario);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_NOMBREUSUARIO = "nombreUsuario";
    
}
