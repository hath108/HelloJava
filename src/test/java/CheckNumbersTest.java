import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumbersTest {

    @Test
    void getLuckyTest() {
        System.out.println("getLuckyTest");
        assertEquals(7, CheckNumbers.getLucky(), "number is different");
    }
}