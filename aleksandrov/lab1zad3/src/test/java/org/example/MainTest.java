package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sum() {
        int sum = Main.sum(2,3,4);
        assertEquals(9, sum);
    }
}