
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * mvn test (запускаем все тесты)
 * mvn -Dtest=HelloWorldTest test (запускаем все тесты в классе)
 * mvn -Dtest=HelloWorldTest#printTextTest test (запускаем конкретный тест)
 */
class HelloWorldTest {


    @Test
    void getHelloWorldTest(){
        assertEquals("Hello World", HelloWorld.getHelloWorld(), "text is Different");
    }
    @Test
    void printTextTest() {
        HelloWorld.printText("Hello everybody");
    }
}