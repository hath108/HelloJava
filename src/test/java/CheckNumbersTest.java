import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class CheckNumbersTest {

    @Test
    void helloJUnit5() {
        assertEquals(10, 5+5);
    }
    @RepeatedTest(value = 4, name = "{displayName} {currentRepetition}/{totalRepetitions}")
  //  @DisplayName("checking for number 7")
    void getLuckyTest() {
        System.out.println("getLuckyTest");
        assertEquals(7, CheckNumbers.getLucky(), "number is different");
    }

    @ParameterizedTest
    @ValueSource(strings = { "cali", "bali", "dani" })
    void endsWithI(String str) {
        assertTrue(str.endsWith("i"));
    }

    @Test
    @DisplayName("Custom test name")
    void testWithDisplayName() {
    }

    @Test
    @DisplayName("Print test name")
    void printDisplayName(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }
    @Test
    @Tag("login")
    void validLoginTest() {
    }

    @Test
    @Tag("search")
    void searchTest() {
    }


    @Disabled
    @Test
    void testWillBeSkipped() {
    }
}