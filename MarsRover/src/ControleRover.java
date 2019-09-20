import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;






public class ControleRover {
    private Rover rover;
    private Planteau planteau;
    
    public ControleRover( Rover rover, Planteau planteau){
        this.rover = rover;
        this.planteau = planteau;
    }
    
    
    public void moverRover(char tecla){
        switch(tecla){
            
            case 'R': if(rover.getPontoCardeal().equals(PontoCardeal.N)){
                        rover.setPontoCardeal(PontoCardeal.E);} else 
                      if(rover.getPontoCardeal().equals(PontoCardeal.S)){
                        rover.setPontoCardeal(PontoCardeal.W);} else 
                      if(rover.getPontoCardeal().equals(PontoCardeal.E)){
                        rover.setPontoCardeal(PontoCardeal.S);} else
                      if(rover.getPontoCardeal().equals(PontoCardeal.W)){
                      rover.setPontoCardeal(PontoCardeal.N);} 
                      
                      break;
                      
            case 'L': if(rover.getPontoCardeal().equals(PontoCardeal.N)){
                        rover.setPontoCardeal(PontoCardeal.W);} else                     
                      if(rover.getPontoCardeal().equals(PontoCardeal.S)){
                        rover.setPontoCardeal(PontoCardeal.E);} else
                      if(rover.getPontoCardeal().equals(PontoCardeal.E)){
                        rover.setPontoCardeal(PontoCardeal.N);} else
                      if(rover.getPontoCardeal().equals(PontoCardeal.W)){
                        rover.setPontoCardeal(PontoCardeal.S);} 
                      
                        break;
                      
            case 'M': if(rover.getPontoCardeal().equals(PontoCardeal.N) &&  rover.getPosY() < planteau.getCordY() ){
                        rover.setPosY(rover.getPosY() + 1);} else
                      if(rover.getPontoCardeal().equals(PontoCardeal.E) &&  rover.getPosX() < planteau.getCordX()){
                        rover.setPosX(rover.getPosX() + 1);} else
                      if(rover.getPontoCardeal().equals(PontoCardeal.S) &&  rover.getPosY() > 0){
                        rover.setPosY(rover.getPosY() - 1);} else
                      if(rover.getPontoCardeal().equals(PontoCardeal.W) &&  rover.getPosX() > 0){
                        rover.setPosX(rover.getPosX() - 1);} 
                       
                      break;
                    
                      
        }
    }
    
    public void posicionarRover(int x, int y, PontoCardeal p){
        rover.setPosX(x);
        rover.setPosY(y);
        rover.setPontoCardeal(p);
    }
    
     public void imprimeStatus(){
       rover.imprimeStatus();   
    }
    
    public Rover retornaRover(){
        return rover;
    }
    
    public void moverRoverArquivo(String nomeArquivo) {
    	
    	Path caminho = Paths.get("C:\\Users\\nicol\\Desktop\\2-exercicio-dev-git-tbn2\\MarsRovers\\"+nomeArquivo+".txt");
    	try {
    		byte[] texto = Files.readAllBytes(caminho);
    		String leitura = new String(texto);   		    		
    		for (int i=0; i<leitura.length(); i++) {    			
    		    moverRover(leitura.charAt(i));
    		}
    		
    	} catch(Exception erro) {
    		
    	}
    	
    	
		
    }
    

}
    
        
        
        
    


