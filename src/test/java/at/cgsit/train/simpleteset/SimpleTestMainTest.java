package at.cgsit.train.simpleteset;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTestMainTest {

    private static final Logger logger = LogManager.getLogger(SimpleTestMain.class);

    @BeforeAll
    static void setup() {
        logger.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        logger.debug("@BeforeEach - executes before each test method in this class");
    }

    @Test
    void testSingleSuccessTest() {
        System.out.println("Success");
    }

    @Test
    void testSimpleTestMain() {
        SimpleTestMain.main(null);
    }


    @Test
    void echo() {
        String input = SimpleTestMain.echo("input");
        assertEquals("input", input);
    }
}
