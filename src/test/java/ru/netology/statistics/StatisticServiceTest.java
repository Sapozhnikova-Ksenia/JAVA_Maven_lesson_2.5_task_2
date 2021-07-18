package ru.netology.statistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticServise service = new StatisticServise();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 250};
        long expected = 250;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}