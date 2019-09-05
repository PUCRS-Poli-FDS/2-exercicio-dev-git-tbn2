
public class ControleRover {
    private Rover rover;
    private Planteau planteau;
    
    public ControleRover( Rover rover, Planteau planteau){
        this.rover = rover;
        this.planteau = planteau;
    }
    
    
    public void moverRover(String tecla){
        switch(tecla){
            
            case "R": if(rover.getPontoCardeal().equals(PontoCardeal.N)){
                        rover.setPontoCardeal(PontoCardeal.E);} 
                      if(rover.getPontoCardeal().equals(PontoCardeal.S)){
                        rover.setPontoCardeal(PontoCardeal.W);}  
                      if(rover.getPontoCardeal().equals(PontoCardeal.E)){
                        rover.setPontoCardeal(PontoCardeal.S);} 
                      if(rover.getPontoCardeal().equals(PontoCardeal.W)){
                      rover.setPontoCardeal(PontoCardeal.N);}
                      
                      break;
                      
            case "L": if(rover.getPontoCardeal().equals(PontoCardeal.N)){
                        rover.setPontoCardeal(PontoCardeal.W);}                     
                      if(rover.getPontoCardeal().equals(PontoCardeal.S)){
                        rover.setPontoCardeal(PontoCardeal.E);} 
                      if(rover.getPontoCardeal().equals(PontoCardeal.E)){
                        rover.setPontoCardeal(PontoCardeal.N);} 
                      if(rover.getPontoCardeal().equals(PontoCardeal.W)){
                        rover.setPontoCardeal(PontoCardeal.S);}
                      
                        break;
                      
            case "M": if(rover.getPontoCardeal().equals(PontoCardeal.N) &&  rover.getPosY() < planteau.getCordY() - 4){
                        rover.setPosY(rover.getPosY() + 1);} 
                      if(rover.getPontoCardeal().equals(PontoCardeal.E) &&  rover.getPosX() < planteau.getCordX() - 4){
                        rover.setPosY(rover.getPosX() + 1);} 
                      if(rover.getPontoCardeal().equals(PontoCardeal.S) &&  rover.getPosY() > 0){
                        rover.setPosY(rover.getPosY() - 1);} 
                      if(rover.getPontoCardeal().equals(PontoCardeal.W) &&  rover.getPosX() > 0){
                        rover.setPosY(rover.getPosX() - 1);} 
                       
                      break;
                    
                      
        }
    }
    
    public void posicionarRover(int x, int y){
        rover.setPosX(x);
        rover.setPosY(y);
    }
    
     public void imprimeStatus(){
       rover.imprimeStatus();   
    }
    
    public Rover retornaRover(){
        return rover;
    }
    

}
    
        
        
        
    


