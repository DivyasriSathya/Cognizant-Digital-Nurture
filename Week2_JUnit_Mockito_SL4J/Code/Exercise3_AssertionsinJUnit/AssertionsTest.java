package com.example.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {
    
	@Test
	public void testAssertions() {
	    System.out.println("Running assertions test...");

	    assertEquals(5, 2 + 3);
	    assertTrue(5 > 3);
	    assertFalse(5 < 3);
	    assertNull(null);
	    assertNotNull(new Object());

	    System.out.println("All assertions passed!");
	}

}
