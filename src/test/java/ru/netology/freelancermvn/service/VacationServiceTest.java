package ru.netology.freelancermvn.service;
import org.junit.jupiter.api.Test;
//import ru.netology.freelancermvn.service.VacationService;

public class VacationServiceTest {
    @Test
    void test1() {
        VacationService service = new VacationService();
        int result = service.calculateVacationService(10_000, 3_000, 20_000);
        System.out.println(result);
    }

    @Test
    void test2() {
        VacationService service = new VacationService();
        int result = service.calculateVacationService(100_000, 60_000, 150_000);
        System.out.println(result);
    }
}
