package at.cgsit.train.simpleteset;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Kommentar von chris für die Klasse
 */
public class SimpleTestMain {

    private static final Logger logger = LogManager.getLogger(SimpleTestMain.class);

    /**
     *     update in feature branch 4712
     *     update 2
     *     update 3
     */
    public static void main(String[] args) {
        logger.debug("Hello from Log4j 2 DEBUG branch feature/TICKET-25-Bugfix1");
        logger.error("Hello form Log4J 2 - ERROR Log feature/TICKET-25-Bugfix1");
    }

    public static String echo(String input ) {
        logger.debug("Hello from Log4j 2");
        return input;

    }

}