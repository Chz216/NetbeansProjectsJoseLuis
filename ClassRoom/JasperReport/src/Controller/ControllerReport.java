/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;//Trabajar objetos dentro de java
import net.sf.jasperreports.engine.util.JRLoader;//Localizra la ruta del archivo
import net.sf.jasperreports.view.JasperDesignViewer;//Cargar visualizador 
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author NAMAN
 */
public class ControllerReport {

    public void executeReport() {
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(ControllerReport.class.getResource("/reports/MyReportOne.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, new JREmptyDataSource());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            Logger.getLogger(ControllerReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excuteReportWhitParameters(String title) {

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(ControllerReport.class.getResource("/reports/MyReportOne.jasper"));
            Map parameters = new HashMap<String, Object>();
            parameters.put("title", title);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, new JREmptyDataSource());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "JRException" + ex.getMessage());
        }
    }

    public void executeReportWithSql() {

        Conexion conexion = new Conexion();
        
        try {

            JasperReport jr = (JasperReport) JRLoader.loadObject(ControllerReport.class.getResource("/reports/MyReportWhitSql.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion.getConnection());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "JRException" + ex.getMessage());
        }
    }

    public void excuteReportWhitParametersSql(String person_dni) {
            
        Conexion conexion = new Conexion();
        
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(ControllerReport.class.getResource("/reports/ReportWhitSQLandParameters.jasper"));
            Map parameters = new HashMap<String, Object>();
            parameters.put("Dni", person_dni);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, conexion.getConnection());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "JRException" + ex.getMessage());
        }
    }
    
    public void excuteReportBarChartReport(){
        Conexion conexion = new Conexion();
        
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(ControllerReport.class.getResource("/reports/BarChartReport.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion.getConnection());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null , "JREXception" + ex.getMessage());
        }
    }
}
