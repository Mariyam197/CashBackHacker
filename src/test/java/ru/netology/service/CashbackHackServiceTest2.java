package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public  class CashbackHackServiceTest2 {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testRemainWithCashback() {
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithoutCashback() {
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }
}