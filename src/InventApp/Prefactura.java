package InventApp;

import java.util.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author master
 */
public class Prefactura {
    Date fechaInicio;
    Date fechaFin;
    Connection connection = DB_INFO.getConnection();
    
    public Prefactura(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    /*public ArrayList<Venta> obtenerVentasPeriodo(){
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String inicioFechaSQL = sdf.format(this.fechaInicio);
        String finalFechaSQL = sdf.format(this.fechaFin);
        connection = DB_INFO.getConnection();
        Statement st;
        ResultSet rs;
        PreparedStatement ps;
        String query = "SELECT * FROM `order_detail` JOIN `order_tbl` JOIN `product` WHERE order_tbl.order_date BETWEEN ? AND ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, inicioFechaSQL);
            ps.setString(2, finalFechaSQL);
            rs = ps.executeQuery();
           
            Venta ventaTemp;
            while(rs.next()){
                ventaTemp = new Venta(rs.getString("name"));
                
                ventas.add(ventaTemp);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ventas;
    }*/
    
}
