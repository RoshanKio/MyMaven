package com.takeo;

import static org.junit.Assert.assertTrue;
import java.sql.Date;
import java.time.LocalDate;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
	System.out.println("Test created on "+new Date(124, 0, 24));
	System.out.println("Testing on "+LocalDate.now());
	System.out.println("path = "+System.getenv("path"));
        assertTrue( true );
    }
}
