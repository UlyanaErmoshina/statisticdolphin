package ru.netology.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    @Test
    void findMax() {
        StatisticService service = new StatisticService();
        long[] incomesinBillions = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 20;

        long actual = service.findMax(incomesinBillions);

        assertEquals(expected, actual);

    }
}