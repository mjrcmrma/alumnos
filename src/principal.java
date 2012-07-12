
import DAO.AlumnoDAO;
import Datos.Alumno;
import DAO.CarreraDAO;
import Datos.Carrera;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VAERON
 */
public class principal {
    private String clave;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarreraDAO carreraDAO = new CarreraDAO();
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        CarreraDAO carreraById = new CarreraDAO();
        Carrera carrera = new Carrera("ISEI", "Sistemas");
        carreraDAO.insert(carrera);
        Alumno alumno = new Alumno("UP100649","Manuel","Rodriguez","Vazquez","9942102","2012-04-05",carrera);
        alumnoDAO.insert(alumno);
        Object clave = null;
        JOptionPane.showInputDialog(clave);
        carreraById.getCarreraByClave(carrera);
        
        JOptionPane.showMessageDialog(null, carreraById.getCarreraByClave(carrera));
        
        
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
}
