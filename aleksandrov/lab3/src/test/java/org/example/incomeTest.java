package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class incomeTest {

    @Test
    public void taxEarningsTrue() {
        double a = income.taxEarnings(100);
        assertEquals(6,a,0);
    }
    @Test
    public void taxEarnigsFalse(){
        double a = income.taxEarnings(465);
        int c = 6;
        assertEquals(a,c,0);
    }

}
