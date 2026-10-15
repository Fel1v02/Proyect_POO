/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas Ramírez y Felipe Orengo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    private ArrayList<Pregunta> preguntas;
    
    public Exam(){
        preguntas = new ArrayList<>();
    }
    
    public void agregaPregunta(Pregunta p){
        if (preguntas.size() < 10){
            preguntas.add(p); 
        }else{
            System.out.println("El examen alcanzo el límite de preguntas.");
        }  
    }
    public int darExam(){
        Scanner teclado = new Scanner(System.in);
        int puntajeObtenido = 0;
        int puntajeTotal = 0;
        
        for (Pregunta p : preguntas){
            puntajeTotal += p.getPeso();
            
            boolean acierto = p.buscar(teclado);
            
            if(acierto){
                puntajeObtenido += p.getPeso();
            }
        }
        System.out.println("--------------------------------");
        System.out.println("RESULTADOS DEL EXAMEN");
        System.out.println("Puntaje: " + puntajeObtenido + "/" + puntajeTotal);
        
    if (puntajeTotal == 0) return 0;
    return (int) Math.round(((double) puntajeObtenido / puntajeTotal) * 100);
          
    }
    
}
