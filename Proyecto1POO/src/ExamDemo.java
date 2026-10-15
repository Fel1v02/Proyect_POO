/*para Tfpregunta: (texto, T o F, int peso))

  para Resp_Cortas_Pregunta: (texto, respuesta en texto, int peso)

  para Selec_Mul_Pregunta:
  EJ: String[] OpcionesAPoner = {"texto","texto","texto","texto","texto",};
  (texto, String[] OpcionesAPoner, indice correcto 0=a, 1=b, 2=c 3=d ,int peso)
      
 * @author Lucas Ramírez y Felipe Orengo
 */
public class ExamDemo {
  public static void main(String[] args){
      Exam miExam = new Exam();
      
      System.out.println("_____*EXAMEN PROYECTO 1 POO*_____");
      
      //preguntas TF
      miExam.agregaPregunta(new TFpregunta("El perro que visita la UCEN se llama Trigo? ", true, 1));
      
      miExam.agregaPregunta(new TFpregunta("Visual Studio Code es un lenguaje de programacion? ", false, 2));
      
      miExam.agregaPregunta(new TFpregunta("Yoscar Daza es Erling Haaland? ", true, 1));
      
      //preguntas respcortas
      miExam.agregaPregunta(new Resp_Cortas_Pregunta("Que campeon de lol es el favorito del Yoscar? ", "DR mundo", 1));
      
      miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cual es el apodo de Fabian Perez? ", "Shadow", 1));
      
      miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuales son las siglas de Programacion Orientada a Objetos? ", "POO", 1));
      
      //preguntas selecMul
      String[] opcionesCarrera = {"Jonatan Vignatti", "Gonzalo Honores", "Fabian Perez", "Yoscar Daza"};
      miExam.agregaPregunta(new Selec_Mul_Pregunta( "Quien es el director de carrera de ICCI?: ", opcionesCarrera, 1, 1)); 
      
      String[] opcionIA = {"IOscar Daza", "Ingenieria computacional", "Inteligencia Artificial", "Computadores", "fabIAn Perez"};
      miExam.agregaPregunta(new Selec_Mul_Pregunta("Que es IA?", opcionIA, 2, 1));
      
      String[] opcionHardware = {"Un grupo musical", "Una aplicacion", "Un algoritmo", "Recursos de un pc"};
      miExam.agregaPregunta(new Selec_Mul_Pregunta("Que es hardware?", opcionHardware, 3, 1));

      int puntaje = miExam.darExam();
      
      System.out.println("Su porcentaje es: " + puntaje + "%");
  }  
}
