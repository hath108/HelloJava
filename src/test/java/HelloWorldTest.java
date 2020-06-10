

class HelloWorldTest {

    @Test(groups = { "include-test-one" })
    void testPrintText() {
        HelloWorld.printText("Hello some text");

    }
}