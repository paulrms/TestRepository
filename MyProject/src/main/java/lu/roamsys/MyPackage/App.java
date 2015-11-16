package lu.roamsys.MyPackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static final Logger logger = Logger.getLogger(App.class);
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        BasicConfigurator.configure();
        logger.debug("Hello World!");
        logger.debug("Hello Franz!");
        
    }
}
