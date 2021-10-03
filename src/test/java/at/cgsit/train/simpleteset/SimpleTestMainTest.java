package at.cgsit.train.simpleteset;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTestMainTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - executes before each test method in this class");
    }

    @Test
    void testSingleSuccessTest() {
        System.out.println("Success");
    }

    @Test
    void testSimpleTestMain() {

        SimpleTestMain.main(null);

    }


}
