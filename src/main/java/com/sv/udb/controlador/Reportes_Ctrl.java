/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Equipos;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author vergo_000
 */
public class Reportes_Ctrl {
        private final Connection conn;


    public Reportes_Ctrl() {
        this.conn = new Conexion().getCon();
    }
    public void reporte1(Equipos equipo) throws JRException
    {
        int codigo=0;
        Map parametro=new HashMap();
        parametro.put("CodigoE",equipo.getCodi_equi());   
        String dir = "C:\\Users\\vergo_000\\Desktop\\POO1\\Periodo 2\\Guia 5\\Investigacion02\\src\\main\\java\\com\\sv\\udb\\reportes\\ReporteJugadores.jrxml";
        JasperReport reporteJasper = JasperCompileManager.compileReport(dir);
        JasperPrint mostrarReporte = JasperFillManager.fillReport(reporteJasper, parametro, conn);
        JasperViewer.viewReport(mostrarReporte,false);        
    }
    
}
