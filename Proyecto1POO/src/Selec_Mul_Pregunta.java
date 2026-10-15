/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas Ramírez y Felipe Orengo
 */
import java.util.Scanner;

public class Selec_Mul_Pregunta extends Pregunta{
    private String[] opciones;
    private int indexCorrecto;

    public Selec_Mul_Pregunta(String text, String[] opciones, int indexCorrecto, int peso) {
        super(peso, text);
        this.opciones = opciones;
        this.indexCorrecto = indexCorrecto;
    }
    
    @Override
    public boolean buscar(Scanner teclado){
        System.out.println(text);
        char letra = 'a';
        for (int i = 0; i < opciones.length; i++) {
            System.out.println("  " + (char)(letra + i) + ". " + opciones[i]);
        }
        
        while(true){
        System.out.print("Ingrese la letra de su eleccion: ");
        String respuesta = teclado.nextLine().toLowerCase();
    
        if (respuesta.length() > 0) {
    int opcionElegida = respuesta.charAt(0) - 'a';
    
        if (opcionElegida >= 0 && opcionElegida < opciones.length) {
            
        if (opcionElegida == indexCorrecto) {
            System.out.println("Correcto");
            return true;
        } else {
            char letraCorrecta = (char) ('a' + indexCorrecto);
            System.out.println("Incorrecto, la respuesta es: " + letraCorrecta);
            return false;
        }
      } else {
    System.out.println("Error. Por favor, elige una de las opciones del menu.");
     }
        } else {
                System.out.println("No escribiste nada. Intenta de nuevo.");
      }
    } 
  }  
}
        