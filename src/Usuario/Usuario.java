/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author jonac
 */
public class Usuario {
    
    private int id;
    
    private String usuario;
    
    private String nombre;
    
    private String correo;
    
    private String password;
    
    private byte cargo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getCargo() {
        return cargo;
    }

    public void setCargo(byte cargo) {
        this.cargo = cargo;
    }
    
    public Usuario(String usuario, String nombre, String correo, String password, byte cargo){
        this.usuario= usuario;
        this.nombre= nombre;
        this.correo= correo;
        this.password= password;
        this.cargo= cargo;
    }
}
