/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jvarrobjetos;

import java.util.Scanner;

/**
 *
 * @author lcarl
 */
public class JvArrObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("cuantas personas quieres registrar");
        int numPersonas = lector.nextInt();
        
         Persona[] personas= new Persona[numPersonas];

        for(int i=0; i < numPersonas; i++) {
            
            System.out.println("Captura el nombre de la Persona: ");
            String nombre = lector.next();
            System.out.println("Captura el edad de la Persona: ");
            int edad = lector.nextInt();
            System.out.println("Captura el estatura de la Persona: ");
            double estatura = lector.nextDouble();
            System.out.println("Captura el peso de la Persona: ");
            double peso = lector.nextDouble();
            System.out.println("Persona creada correctamente");

            personas[i] = new Persona(nombre, edad, estatura, peso);
            /*Asignacion estatica: incializar a vacio
             * Insertar : insertar uno  solo
             * borrar 
             * modificar 
             * recorrer (mostrar todos los elementos del arreglo)
             * buscar (por caracteristica)
             */
        }
    }
    
}
