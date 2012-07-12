/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Datos.Bean;
import Datos.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pussy
 */
public class CarreraDAO implements OperacionesDAO {

    
    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
//        throw new UnsupportedOperationException("Not supported yet.");
        Carrera carrera =  (Carrera) bean;
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement(SQL.insertarCarrera);
            ps.setString(1, carrera.getclave());
            ps.setString(2, carrera.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCarreraByClave(Bean bean){
        Carrera carrerita = (Carrera) bean;
        Connection conexion1 = DAOFactory.getConexion();
        PreparedStatement pst = null;
        ResultSet rs = null;
        int r = 0;
        try{
            pst = conexion1.prepareStatement(SQL.findCarrera);
            pst.setString(1, carrerita.getclave());
            rs = pst.executeQuery();
            rs.next();
            r = rs.getInt("idCarrera");
        } catch (SQLException et){
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, et);
        }
        return r;
    }
    
}
