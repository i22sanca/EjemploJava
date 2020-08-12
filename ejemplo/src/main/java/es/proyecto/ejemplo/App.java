package es.proyecto.ejemplo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger log = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	log.info( "Hello World!" );
    }
}
