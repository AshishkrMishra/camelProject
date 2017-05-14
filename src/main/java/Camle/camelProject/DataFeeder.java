package Camle.camelProject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFeeder  extends Thread {
	public static int NoOfStudent=20;
	public static final File inputFeedDirectory=new File ("C:\\Users\\kkumari\\input\\StudentData");
	public static final String DEFAULT_FILENAME="Student";
	private static String dateFormat="ddmmyyssmm";
	public void run()
	{
		File resultFile=null;
		String currentStudentName=null;
		String newFile=null;
		int currentStudentSeq=0;
		String inputStr="I am ";
		FileOutputStream studentFile=null;
		SimpleDateFormat sdf= new SimpleDateFormat(dateFormat);
		
		while(true)
		{
			if(currentStudentSeq>NoOfStudent)
				break;
			currentStudentName=DEFAULT_FILENAME+(++currentStudentSeq);
			newFile=inputFeedDirectory+"\\"+currentStudentName+sdf.format(new Date())+".txt";
			resultFile= new File(newFile);
			try {
					studentFile= new FileOutputStream(resultFile);
					studentFile.write((inputStr+currentStudentName).getBytes());
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
	}
	
	public static void main(String[] args) {
		
		new DataFeeder().start();
	}

}
