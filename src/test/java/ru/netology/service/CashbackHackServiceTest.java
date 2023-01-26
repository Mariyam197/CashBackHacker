package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
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