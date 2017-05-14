package Camel.camelProject;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import Camel.camelProject.routerbuilders.MessageRouteBuilder;

/**
 * Hello world!
 *
 */
public class MyApp 
{
		
	//private static final Logger LOGGER= Logger.getAnonymousLogger();
    public static void main( String[] args )
    {
        CamelContext camelContext= new DefaultCamelContext();
        boolean isNeedtoTerminate=false;
        try
        {
           
           while(!isNeedtoTerminate)
           {
        	   camelContext.addRoutes(new MessageRouteBuilder());
        	   camelContext.start();
        	   Thread.sleep(10000);
           }
           camelContext.stop();
           
        }
        catch(Exception camelException)
        {
        	//LOGGER.info(camelException.getMessage());
        	camelException.printStackTrace();
        }
        
    }
    
    
    
}
