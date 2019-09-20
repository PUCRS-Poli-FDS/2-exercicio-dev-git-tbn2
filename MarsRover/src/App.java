

public class App {
    
    
    
    public static void main(String[] args){
       ControleRover cr = new ControleRover(new Rover(1,2,1,PontoCardeal.N), new Planteau(5,5));
       cr.moverRoverArquivo("arquivo");
       cr.imprimeStatus();
       
       cr.posicionarRover(3,3,PontoCardeal.E);       
       cr.moverRoverArquivo("arquivo2");
       cr.imprimeStatus();
       
        
    }
}