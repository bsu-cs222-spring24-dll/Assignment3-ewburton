package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SillyMethodsTests {
    @Test
    public void testDidGuess33Correctly() {
        SillyMethods sillyMethods = new SillyMethods();
        boolean answer = sillyMethods.didGuess33(33);
        Assertions.assertTrue(answer);
    }
    @Test
    public void testDidGuess33InCorrectly() {
        SillyMethods sillyMethods = new SillyMethods();
        boolean answer = sillyMethods.didGuess33(23);
        Assertions.assertFalse(answer);
    }
    @Test
    public void testCountTo9() {
        SillyMethods sillyMethods = new SillyMethods();
        String answer = sillyMethods.countTo(9);
        Assertions.assertEquals("0 1 2 3 4 5 6 7 8 9", answer);
    }
    @Test
    public void testCountTo11() {
        SillyMethods sillyMethods = new SillyMethods();
        String answer = sillyMethods.countTo(11);
        Assertions.assertEquals("0 1 2 3 4 5 6 7 8 9 10 11", answer);
    }






}
