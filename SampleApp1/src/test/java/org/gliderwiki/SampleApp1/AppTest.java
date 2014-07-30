package org.gliderwiki.SampleApp1;
 
 
import static org.junit.Assert.*;
 
import org.junit.Test;
 
/**
 * Unit test for simple App.
 */
public class AppTest  {
     
    @Test
    public void sumTest() { 
        int a = 1;
        int b = 2;
        int expected = 3;
        int result = App.sum(a, b);
         
        assertEquals(expected , result);
    }
     
}