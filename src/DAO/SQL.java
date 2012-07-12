/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Pussy
 */
public class SQL {
    public static String insertarAlumno     = "INSERT INTO alumnos (matricula, nombre, apaterno, amaterno, telefono,fecha_nac, idcarrera) VALUES (?,?,?,?,?,?,?)";
    public static String insertarCarrera    = "INSERT INTO carreras (clave, carrera) VALUES (?,?)";
    public static String findCarrera        = "SELECT idCarrera FROM carreras WHERE clave = ?";
}
