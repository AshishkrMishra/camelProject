package Camel.camelProject.routerbuilders;

import org.apache.camel.builder.RouteBuilder;

import Camel.camelProject.processor.PrintFIleContentProcessor;
import Camel.camelProject.processor.StudentAttendenceProcessor;

public class StudentRouterBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("file:C:\\Users\\kkumari\\input\\StudentData?delay=1000&move=.completed")
		.process(new PrintFIleContentProcessor())
		.process(new StudentAttendenceProcessor())
		.to("file:C:\\Users\\kkumari\\output\\StudentFeeds");
		
	}

}
