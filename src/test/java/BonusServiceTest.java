import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registred = true;
        long expected = 30;
        long actual = service.calculate(amount, registred);
        assertEquals(expected, actual);
    }
}