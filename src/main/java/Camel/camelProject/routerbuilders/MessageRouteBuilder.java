 package Camel.camelProject.routerbuilders;

import org.apache.camel.builder.RouteBuilder;

import Camel.camelProject.processor.PrintFIleContentProcessor;
import Camel.camelProject.transformer.MessageFileTransFormer;

public class MessageRouteBuilder extends RouteBuilder {
	
	private static int serialNo=0;

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("file:C:\\Users\\kkumari\\input\\Message?move=.read"+(++serialNo))
		.process(new PrintFIleContentProcessor())
		.bean(new MessageFileTransFormer(),"tranformMessgae")
		.bean(new MessageFileTransFormer(),"tranformMsg")
		.bean(new MessageFileTransFormer(),"tranformFile")
		.to("file:C:\\Users\\kkumari\\output\\Message");
		
	}

}
