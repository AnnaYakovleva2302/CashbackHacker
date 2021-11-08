package ru.netology.service;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {
    @Test
    public void shouldRemain100From900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain100From1900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0From1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}
