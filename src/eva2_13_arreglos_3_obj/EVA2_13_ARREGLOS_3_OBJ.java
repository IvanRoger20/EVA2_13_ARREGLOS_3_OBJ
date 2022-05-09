/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_arreglos_3_obj;

import java.util.Scanner;

/**
 *
 * @author IvanTron
 */
public class EVA2_13_ARREGLOS_3_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] arregloPer = new Persona[32];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 32; i++) {
            arregloPer[i] = new Persona();
            System.out.println("Cual es tu edad?");
            arregloPer[i].setNombre(input.nextLine());
        }
        
        for (int i = 0; i < 32; i++) {
            System.out.print("Nombre: " + arregloPer[i].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}