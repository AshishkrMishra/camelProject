package Camel.camelProject.transformer;

import java.io.File;

public class MessageFileTransFormer 
{
	public void tranformMessgae(String body)
	{
		System.out.println(Thread.currentThread()+" start");
		String upperCase=body.toUpperCase();
		System.out.println(upperCase);
		System.out.println(Thread.currentThread()+" ends");
	}
	public void tranformMsg(String content)
	{
		System.out.println(Thread.currentThread()+" start");
		String lowerCase=content.toLowerCase();
		System.out.println(lowerCase);
		System.out.println(Thread.currentThread()+" ends");
	}
	
	public void tranformFile(File content)
	{
		System.out.println(Thread.currentThread()+" start");
		System.out.println(content.getAbsolutePath());
		System.out.println(Thread.currentThread()+" ends");
	}
}
