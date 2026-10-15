/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas Ramírez y Felipe Orengo
 */
import java.util.Scanner;

public class Resp_Cortas_Pregunta extends Pregunta{
    private String respuestaCorrecta;
    
    public Resp_Cortas_Pregunta(String text, String respuestaCorrecta, int peso){
        super(peso, text);
        this.respuestaCorrecta = respuestaCorrecta;    
    }
    @Override
     public boolean buscar(Scanner teclado){
         System.out.print(text + ": ");
         String respuesta = teclado.nextLine();
         
         if(respuesta.equalsIgnoreCase(respuestaCorrecta)){
             System.out.println("Correcta");
             return true;
         }else{
             System.out.println("equivoado, la respuesta correcta es: " + respuestaCorrecta);
             return false;
         }
     }
}
