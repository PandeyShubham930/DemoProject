package demo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Main 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		System.out.println("Output is here");
		System.out.println();
		Prog1 p=new Prog1();
		p.takeData();
	}
}
