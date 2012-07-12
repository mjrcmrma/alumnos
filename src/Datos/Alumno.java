/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author VAERON
 */
public class Alumno extends Persona{
    private String Matricula;
    private Carrera micarrera;
    
    public Alumno(String Matri,String nom,String apat, String amat, String tel,String fechas, Carrera miCarrera){
        setMatricula(Matri);
        setnombre(nom);
        setape_pat(apat);
        setape_mat(amat);
        settel(tel);
        setfecha(fechas);
        this.micarrera = miCarrera;
    }

    public void setMatricula(String Matricula) {
        this.Matricula=Matricula.toUpperCase();
    }
    public String getMatricula() {
        return this.Matricula;
    }
    public void setCarreranom(String carrera) {
        this.micarrera.setNombre(carrera.toUpperCase());
    }
    public String getCarreranom() {
        return this.micarrera.getNombre();
    }
    public void setCarreraClave(String clave) {
        this.micarrera.setclave(clave);
    }
    public String getCarreraClave() {
        return this.micarrera.getclave();
    }

}
