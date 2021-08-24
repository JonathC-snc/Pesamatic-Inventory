/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Balanza;



/**
 *
 * @author Julio Laya
 */

public class Balanza {

    public static void removeRow(int FilaSelc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    private int id;
    
    private String codigo;
    
    private String descripcion;
    
    private String modelo;
    
    private String referencia;
    
    private String stockactual;
    
    private String almacen;
    
    private String unidad;
    
    private String observacion;
    
    private String disponibilidad;
    
    
    public String getunidad(){
        return unidad;
    }
    
    public void setunidad(String unidad){
        this.unidad = unidad;
    }
    
    public String getalmacen(){
        return almacen;
    }
    
    public void setalmacen(String almacen){
        this.almacen = almacen;
    }
    
    public String getstockactual() {
        return stockactual;
    }
    
    public void setstockactual(String stockactual){
        this.stockactual = stockactual;
    }

    public String getReferencia() {
        return referencia;
    }
    
    public String getobservacion() {
        return observacion;
    }
    
    public void setobservacion(String observacion) {
        this.observacion = observacion;
    }
    
    

    public Balanza(String codigo, String descripcion, String modelo, String referencia, String almacen, String stockactual, String unidad, String observacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.referencia = referencia;
        this.almacen = almacen;
        this.stockactual = stockactual;       
        this.unidad = unidad;
        this.observacion = observacion;
    }
    
    public Balanza(String codigo, String modelo, String stockactual){
        this.codigo = codigo;
        this.modelo = modelo;
        this.stockactual = stockactual;
    }
    

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*public material(String codigo, String nombre, String modelo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.modelo = modelo;
    }*/

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Balanza() {
    }
    

    public Balanza(String codigo, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
    
    
}
