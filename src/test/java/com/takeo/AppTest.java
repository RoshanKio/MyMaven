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
	System.out.println("Test Creation Date : "+new Date(124, 0, 27)+", Test Modified Date : "+LocalDate.now());
        assertTrue( true );
    }
}
