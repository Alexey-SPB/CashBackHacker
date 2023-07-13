package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class CashbackHackServiceTest {
    @Test
    void AmountLess1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void AmountUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected =999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void AmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}