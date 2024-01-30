import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CounterMonthsOfRest;

public class CounterMonthsOfRestTest {
    @ParameterizedTest
    @CsvSource({
            "2, 60000, 100000, 150000",
            "3, 3000, 10000, 20000"
    })
    public void TestCounterOfMonth(int expected, int expenses, int income, int threshold) {
        CounterMonthsOfRest service = new CounterMonthsOfRest();
        int actual = service.calcRest(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
