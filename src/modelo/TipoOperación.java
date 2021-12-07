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
public class TipoOperación {
    private String nombre;
    private int codigo;
    
    public int getTipo(int codigo){
        this.codigo=codigo;
        System.out.println("Indique tipo de operación:");
        System.err.println("1 Transferir");
        System.err.println("2 Depositar");
        System.out.println("3 retirar");
        System.out.println("4 consultar");
        
        return codigo;
    }
}
