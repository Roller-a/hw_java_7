import ru.netology.services.CounterMonthsOfRest;

public class Main {
    public static void main(String[] args) {
        CounterMonthsOfRest service = new CounterMonthsOfRest();
        System.out.println(service.calcRest(10000, 3000, 20000));
    }
}