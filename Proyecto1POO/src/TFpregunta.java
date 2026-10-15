/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas Ramírez y Felipe Orengo
 */
import java.util.Scanner;
        
public class TFpregunta extends Pregunta {
    private boolean respuestaCorrecta;

    public TFpregunta(String text, boolean respuestaCorrecta, int peso) {
        super(peso, text);
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    @Override
    public boolean buscar(Scanner teclado){
        System.out.print(text + "Ingrese T o F(verdadero o falso): ");
        while(true){
            String respuesta = teclado.nextLine().toUpperCase();
            
            if(respuesta.equals("T") || respuesta.equals("F")){
                boolean esVerdadero = respuesta.equals("T");
                if (esVerdadero == respuestaCorrecta){
                    System.out.println("Respuesta correcta");
                    return true;
                }else{
                    System.out.println("Respuesta incorrecta, la respuesta es: " + respuestaCorrecta);
                    return false;
                }
            }else{
                System.out.println("Entrada invalida, ingresa T o F: ");
                System.out.print(text + "Ingrese T o F(verdadero o falso): ");
            }
            
        }
       
    }
    
    
}
