import java.util.Scanner;

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
        
        
         */
        ///*
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
        //*/
    }
}