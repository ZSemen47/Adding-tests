import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class BonusServiceTest {

    @Test
    void calculate() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registred = true;
        long expected = 30;
        long actual = service.calculate(amount, registred);
        assertEquals(expected, actual);
    }
}