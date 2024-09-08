import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibLogicTest {
    @Test
    public void testFibonacci0() {
        System.out.println("Running test: fibonacci(0)");
        assertEquals(0, FibLogic.fibonacci(0));
        System.out.println("Test passed: fibonacci(0)");
    }

    @Test
    public void testFibonacci1() {
        System.out.println("Running test: fibonacci(1)");
        assertEquals(1, FibLogic.fibonacci(1));
        System.out.println("Test passed: fibonacci(1)");
    }

    @Test
    public void testFibonacci2() {
        System.out.println("Running test: fibonacci(2)");
        assertEquals(1, FibLogic.fibonacci(2));
        System.out.println("Test passed: fibonacci(2)");
    }

    @Test
    public void testFibonacci3() {
        System.out.println("Running test: fibonacci(3)");
        assertEquals(2, FibLogic.fibonacci(3));
        System.out.println("Test passed: fibonacci(3)");
    }

    @Test
    public void testFibonacci4() {
        System.out.println("Running test: fibonacci(4)");
        assertEquals(3, FibLogic.fibonacci(4));
        System.out.println("Test passed: fibonacci(4)");
    }

    @Test
    public void testFibonacci5() {
        System.out.println("Running test: fibonacci(5)");
        assertEquals(5, FibLogic.fibonacci(5));
        System.out.println("Test passed: fibonacci(5)");
    }

    @Test
    public void testFibonacci6() {
        System.out.println("Running test: fibonacci(6)");
        assertEquals(8, FibLogic.fibonacci(6));
        System.out.println("Test passed: fibonacci(6)");
    }

    @Test
    public void testFibonacci7() {
        System.out.println("Running test: fibonacci(7)");
        assertEquals(13, FibLogic.fibonacci(7));
        System.out.println("Test passed: fibonacci(7)");
    }

    @Test
    public void testFibonacci8() {
        System.out.println("Running test: fibonacci(8)");
        assertEquals(21, FibLogic.fibonacci(8));
        System.out.println("Test passed: fibonacci(8)");
    }

    @Test
    public void testFibonacci9() {
        System.out.println("Running test: fibonacci(9)");
        assertEquals(34, FibLogic.fibonacci(9));
        System.out.println("Test passed: fibonacci(9)");
    }
}