package ru.netology.freelancermvn.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.freelancermvn.service.VacationService;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000",
            "100000, 60000, 150000"
    })
    public void testVacationService(int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        int result = service.calculateVacationService(income, expenses, threshold);
        System.out.println(" месяцев отпуска в году " + result);
    }

//    @Test
//    void test2() {
//        VacationService service = new VacationService();
//        int result = service.calculateVacationService(100_000, 60_000, 150_000);
//        System.out.println(result);
//    }
}
