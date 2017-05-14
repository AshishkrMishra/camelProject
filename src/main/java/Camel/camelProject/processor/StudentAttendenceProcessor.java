package Camel.camelProject.processor;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.helpers.MessageFormatter;

public class StudentAttendenceProcessor  implements Processor {
	
	public static String AttendenceMergerFile="C:\\Users\\kkumari\\output\\StudentAttendance\\AttendenceTest.txt";
	

	public void process(Exchange exchange) throws Exception {
		String fileInput=exchange.getIn().getBody(String.class);
		String [] content=fileInput.split("\\s+");
		if(content!=null && content.length>0)
		{
			String studentName=content[content.length-1];
			FileOutputStream fos= new FileOutputStream(new File(AttendenceMergerFile),true);
			fos.write((MessageFormatter.format("Student {0} is Present",studentName)).getMessage().getBytes());
			fos.close();
		}
		
		
	}

}
