package Camel.camelProject;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import Camel.camelProject.routerbuilders.StudentRouterBuilder;
import Camle.camelProject.DataFeeder;

/**
 * Hello world!
 *
 */
public class StudentPresentTesterApp 
{
	
	public static StudentRouterBuilder studentRouterBuilder= new StudentRouterBuilder() ;
		
	//private static final Logger LOGGER= Logger.getAnonymousLogger();
    public static void main( String[] args )
    {
    	new DataFeeder().start();
        CamelContext camelContext= new DefaultCamelContext();
        boolean isNeedtoTerminate=false;
        try
        {
        	while(!isNeedtoTerminate)
        	{
        		   camelContext.addRoutes(studentRouterBuilder);
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
