

import java.util.Iterator;
import java.util.Scanner;

import MarsRovers.ControleRover;
import MarsRovers.Planteau;
import MarsRovers.PontoCardeal;
import MarsRovers.Rover;

public class App {
    
    
    
    public static void main(String[] args){
       ControleRover cr = new ControleRover(new Rover(1,1,2,PontoCardeal.N), new Planteau(5,5));
      
       
       /*
       
       Scanner sc = new Scanner(System.in);
        String aux = "S"; 
        while(aux != "SAIR"){
        System.out.println("Digite uma posição: ");
        aux = sc.nextLine();
        cr.moverRover(aux);
        cr.imprimeStatus();
       }
        
        
        
        
        cr.moverRover("L");
        cr.moverRover("M");
        cr.moverRover("L");
        cr.moverRover("M");
        cr.moverRover("L");
        cr.moverRover("M");
        cr.moverRover("L");
        cr.moverRover("M");
        cr.moverRover("M");

        cr.imprimeStatus();

        

        cr.posicionarRover(3,3);
        


        cr.moverRover("M");
        cr.moverRover("M");
        cr.moverRover("R");
        cr.moverRover("M");
        cr.moverRover("M");
        cr.moverRover("R");
        cr.moverRover("M");
        cr.moverRover("R");
        cr.moverRover("R");
        cr.moverRover("M");

        cr.imprimeStatus();
        */

        /*
        public void Read(String Caminho){
          String conteudo = "";
          try {    
              FileReader arq = new FileReader(Caminho);
              BufferedReader lerArq  = new BufferedReader(arq);
              Iterator<String> linha = "";
               try {
                   linha = lerArq.readLine();
                   while(linha != null && linha.hasNext()){
                       cr.moverRover(linha.next());
                   }
               } catch (Exception e) {
                   //TODO: handle exception
               }
          } catch (Exception e) {
              System.out.println("Erro ao ler Arqivo");
          }
        }*/
        
        

       
        
    }
}