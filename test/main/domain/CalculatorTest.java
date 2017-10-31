package main.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void deotsaem(){
        Calculator calc = new Calculator();
        assertEquals(3, calc.calculate("1 + 2"));

    }

    @Test
    public void bbaelsaem(){
        Calculator calc = new Calculator();
        assertEquals(-1, calc.calculate("1 - 2"));

    }

    @Test
    public void gopsaem(){
        Calculator calc = new Calculator();
        assertEquals(2, calc.calculate("1 * 2"));

    }

}