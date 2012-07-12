/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author VAERON
 */
public class Carrera implements Bean {    
    public Carrera(){
        this.clave=" ";
        this.Nombre=" ";
    }
    public Carrera(String clave,String Nombre){
        setclave(clave);
        setNombre(Nombre);
    }
    
    
    private String clave;
    private String Nombre;
    
    public String getclave(){
        return this.clave;
    }
    public void setclave(String clave){        
        this.clave=clave.toUpperCase();
    }
    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String Name){
        this.Nombre=Name.toUpperCase();
    }

}
