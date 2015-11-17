package lu.roamsys.MyPackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello World!
 *
 */
public class App 
{
	static final Logger logger = Logger.getLogger(App.class);
	
	
    public static void main( String[] args )
    {
    	// print greetings to the console
        System.out.println( "Hello World!" );
        
        BasicConfigurator.configure();
        logger.debug("Hello World!");
        logger.debug("Hello Franz-Peter!");
        logger.debug("Hello, I'm Daniel!");
        logger.debug("Test123");
    }
}
