package tut4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for Calc
 */
public class TestCalc{
    @Test
    public void testAdd(){
        assertEquals(2, new Calc().add(1,1));
    }

    @Test
    public void testSubtract(){
        assertEquals(1, new Calc().subtract(2,1));
    }
}