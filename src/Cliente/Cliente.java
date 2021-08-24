/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author jonac
 */
public class Cliente {
    
    public static void removeRow(int FilaSelc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int id;
    
    private String nombre_empresa;
    
    private String direccion;
    
    private String prioridad;
    
    private String antiguedad;
    
    private String p_servicios;

    

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getP_servicios() {
        return p_servicios;
    }

    public void setP_servicios(String p_servicios) {
        this.p_servicios = p_servicios;
    }
    
    public Cliente(String nombre_empresa, String direccion, String prioridad, String antiguedad, String p_servicios) {
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.prioridad = prioridad;
        this.antiguedad = antiguedad;
        this.p_servicios = p_servicios;
    }
    
    public Cliente(){
        
    }
}
