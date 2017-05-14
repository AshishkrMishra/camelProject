package Camel.camelProject.processor;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrintFIleContentProcessor  implements Processor {

	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		File fileInput=exchange.getIn().getBody(File.class);
		System.out.println(fileInput.getAbsolutePath());
	}

}
