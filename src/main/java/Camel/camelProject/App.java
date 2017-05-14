package Camel.camelProject;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	//private static final Logger LOGGER= Logger.getAnonymousLogger();
    public static void main( String[] args )
    {
        CamelContext camelContext= new DefaultCamelContext();
        try
        {
           camelContext.addRoutes(createRouterDefault());
           camelContext.start();
           Thread.sleep(10000);
           camelContext.stop();
        }
        catch(Exception camelException)
        {
        	//LOGGER.info(camelException.getMessage());
        	camelException.printStackTrace();
        }
        
    }
    
    public static RouteBuilder createRouterForCopyFile()
    {
    	RouteBuilder routerBuilder= new RouteBuilder()
         {
            public void configure() throws Exception
            {
           	 System.out.println("");
               from("file:C:\\Users\\kkumari\\input?noop=true").to("file:C:\\Users\\kkumari\\output");
            }
         };
         return routerBuilder;
    }
    
    public static  RouteBuilder createRouterForCopyFileAndDelete()
    {
    	RouteBuilder routerBuilder= new RouteBuilder()
         {
            public void configure() throws Exception
            {
           	 System.out.println("");
               from("file:C:\\Users\\kkumari\\input?delete=true").to("file:C:\\Users\\kkumari\\output");
            }
         };
         return routerBuilder;
    }
    
    public static  RouteBuilder createRouterDefault()
    {
    	RouteBuilder routerBuilder= new RouteBuilder()
         {
            public void configure() throws Exception
            {
           	 System.out.println("");
               from("file:C:\\Users\\kkumari\\input").to("file:C:\\Users\\kkumari\\output");
            }
         };
         return routerBuilder;
    }
    
    
}
