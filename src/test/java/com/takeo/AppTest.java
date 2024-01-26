package com.takeo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;

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
	System.out.println("Date of creation of the AppTest class : "+new Date(124, 0, 26)+"\n===============================================\nDate of modification of AppTest class : "+LocalDate.now()+"\n====================================================\n\n\n\n");
        assertTrue( true );
    }
}
