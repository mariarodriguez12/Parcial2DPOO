package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import logica.Parcial;

public class ParcialTest {
	
	private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void raicesResTest() throws Exception {
		assertEquals("0.0,-4.0", this.parcial.raices(1, 4, 3));
		assertEquals("-1.0,-1.0", this.parcial.raices(1, 2, 1));
		assertEquals("0.0,-0.5", this.parcial.raices(2, 1, 0));
	}
	@Test
	public void raicesExcTest() throws Exception {
		assertThrows(Exception.class, () -> this.parcial.raices(0,2,2));
		assertThrows(Exception.class, () -> this.parcial.raices(2,1,2));
		assertTimeout(Duration.ofSeconds(1), () -> this.parcial.raices(1, 4, 3)); 
	}
	
	@Test
	public void raicesTimeTest() {
		assertTimeout(Duration.ofSeconds(1), () -> this.parcial.raices(1, 4, 3)); 
	}
	
	

}
