
public class Rover {
    private int idRover;
    private int posX;
    private int posY;
    private PontoCardeal pCardeal;
    
    public Rover(int idRover, int posX, int posY, PontoCardeal pCardeal){
        this.idRover = idRover;
        this.posX = posY;
        this.posY = posX;
        this.pCardeal = pCardeal;
    }
    
    public Rover(int idRover){
         this.idRover = idRover;
        posX = 0;
        posY = 0;
        pCardeal = PontoCardeal.N;
    }
    
    public void setPosX(int X){
        posX = X;
    }
    
    public void setPosY(int Y){
        posY = Y;
    }
    
    public void setPontoCardeal(PontoCardeal p){
        pCardeal = p;
    }
    
    public int getPosX(){
        return posX;
    }
    
    public int getPosY(){
        return posY;
    }
    
    public PontoCardeal getPontoCardeal(){
        return pCardeal;
    }
    
    public void imprimeStatus(){
       System.out.println("PosX: " + getPosX());
       System.out.println("PosY: " + getPosY());
       System.out.println("Direção: " + getPontoCardeal());
       System.out.println("");
       
    }
    
    }
    
    
    
        
        
        
    


