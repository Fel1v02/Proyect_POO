/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas Ramírez y Felipe Orengo
 */
import java.util.Scanner;

public abstract class Pregunta {
    protected int peso;
    protected String text;
    
    public Pregunta(int peso, String text){
        this.peso = peso;
        this.text = text;
    }
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public String getText(){
        return text;
    }
    
    public abstract boolean buscar(Scanner teclado);
    
}
