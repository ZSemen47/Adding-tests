import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class BonusServiceTest {

    @Test
    void shouldCalculateForRegistredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registred = true;
        long expected = 30;
        long actual = service.calculate(amount, registred);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegistredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registred = true;
        long expected = 500;
        long actual = service.calculate(amount, registred);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNonregistredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registred = false;
        long expected = 10;
        long actual = service.calculate(amount, registred);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNonRegistredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registred = false;
        long expected = 500;
        long actual = service.calculate(amount, registred);
        assertEquals(expected, actual);
    }
}