import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoverTest {
	private ControleRover cr;
	
	@BeforeEach
	public void setUp() throws Exception {
		cr = new ControleRover(new Rover(1,0,0,PontoCardeal.N), new Planteau(5,5));		
	}

	@Test
	public void testaCodigo1() {
		cr.posicionarRover(1,2,PontoCardeal.N);  
		cr.moverRoverArquivo("arquivo");
		assertEquals(1, cr.retornaRover().getPosX());
		assertEquals(3, cr.retornaRover().getPosY());
		assertEquals(PontoCardeal.N, cr.retornaRover().getPontoCardeal());
		
	}
	
	@Test
	public void testaCodigo2() {
		cr.posicionarRover(3,3,PontoCardeal.E);  
		cr.moverRoverArquivo("arquivo2");
		assertEquals(5, cr.retornaRover().getPosX());
		assertEquals(1, cr.retornaRover().getPosY());
		assertEquals(PontoCardeal.E, cr.retornaRover().getPontoCardeal());
		
	}
	
	@Test
	public void testaDireção() {
		cr.moverRover('R');
		cr.moverRover('R');
		cr.moverRover('R');
		cr.moverRover('R');
		cr.moverRover('L');
		cr.moverRover('L');
		cr.moverRover('L');
		cr.moverRover('L');
		assertEquals(0, cr.retornaRover().getPosX());
		assertEquals(0, cr.retornaRover().getPosY());
		assertEquals(PontoCardeal.N, cr.retornaRover().getPontoCardeal());
		
	}
	
	@Test
	public void testaLimiteMaxY() {
		cr.moverRover('M');
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		assertEquals(0, cr.retornaRover().getPosX());
		assertEquals(5, cr.retornaRover().getPosY());
		assertEquals(PontoCardeal.N, cr.retornaRover().getPontoCardeal());
		
	}
	@Test
	public void testaLimiteMaxX() {
		cr.moverRover('R');
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');
		assertEquals(5, cr.retornaRover().getPosX());
		assertEquals(0, cr.retornaRover().getPosY());
		assertEquals(PontoCardeal.E, cr.retornaRover().getPontoCardeal());
		
	}
	
	@Test
	public void testaLimiteMinY() {
		cr.moverRover('L');
		cr.moverRover('L');
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');
		assertEquals(0, cr.retornaRover().getPosX());
		assertEquals(0, cr.retornaRover().getPosY());
		assertEquals(PontoCardeal.S, cr.retornaRover().getPontoCardeal());
		
	}
	
	@Test
	public void testaLimiteMinX() {
		cr.moverRover('L');
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');	
		cr.moverRover('M');
		assertEquals(0, cr.retornaRover().getPosX());
		assertEquals(0, cr.retornaRover().getPosY());
		assertEquals(PontoCardeal.W, cr.retornaRover().getPontoCardeal());
		
	}
	


}
