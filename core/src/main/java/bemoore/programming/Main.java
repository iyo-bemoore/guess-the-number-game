package bemoore.programming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "beans.xml";
    public static void main(String[] args) {
        log.debug("Guess the number game");
        log.info("This is an info log");

        // Context container
        ConfigurableApplicationContext context  = new ClassPathXmlApplicationContext((CONFIG_LOCATION));

        // get numberGenerator bean from context //
        NumberGenerator numberGenerator = context.getBean("numberGenerator",NumberGenerator.class);

        // call method next

        int number = numberGenerator.next();
        log.info("The number from Main is = {}", number);

        // get game bean from context

        Game game = context.getBean("game", Game.class);
        game.reset();

        // close context

        context.close();
    }
}
