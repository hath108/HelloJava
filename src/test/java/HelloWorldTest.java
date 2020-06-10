import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void printText() {
        HelloWorld.printText("Привет тестировщикам");
    }

    @Test
    void printLines() {
        HelloWorld.printLines();;
    }
}