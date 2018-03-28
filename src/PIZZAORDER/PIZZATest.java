package PIZZAORDER;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PIZZATest{ 
PIZZA p1;
@Before
public void setUp() throws Exception {
	p1=new PIZZA("Panner Pizza",2,200);
}

@Test
public void testPizzaOrder() {
	//fail("Not yet implemented");
}

@Test
public void testGetName() {
	//fail("Not yet implemented");
	
	assertEquals(p1.getName(),"Panner Pizza");
}


@Test
public void testGetQuantity() {
	//fail("Not yet implemented");
	
	assertEquals(p1.getQuantity(),2);
}


@Test
public void testGetPrice() {
	//fail("Not yet implemented");
	
	extracted(p1);
	}

private void extracted(PIZZA p1) {
		assertEquals(200,p1.getPrice());
	}


}
