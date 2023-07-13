package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {
    @Test
    void AmountLess1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    void AmountUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected =999;

        assertEquals(actual, expected);
    }

    @Test
    void AmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}