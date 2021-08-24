/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author jonac
 */
public class Empleado {
    
    private int id;
    
    private String nombre;
    
    private String edad;
    
    private String cargo;
    
    private String direccion;
    
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Empleado(String nombre, String edad, String cargo, String direccion, String telefono) {
        this.nombre= nombre;
        this.edad= edad;
        this.cargo= cargo;
        this.direccion= direccion;
        this.telefono= telefono;
    }
    
    public Empleado(){
        
    }
}
