/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kenneth
 */
public class Cliente {
    private String DNI;
    private String nombre;
    private String dirección;

    public Cliente(String DNI, String nombre, String dirección) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.dirección = dirección;
    }

    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    @Override
    public String toString() {
        return  nombre + " \t " + DNI + " \t " + dirección;
    }
}
