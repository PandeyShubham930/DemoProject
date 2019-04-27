package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog1
{

	public void takeData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new  FileInputStream("./src/test/resources/input.xls");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int rn = sh.getLastRowNum();
		
		
		for(int x=0;x<=rn;x++)
		{
			short cc = sh.getRow(x).getLastCellNum();
			
			for(int y=0;y<cc;y++)
			{
			String data = sh.getRow(x).getCell(y).toString();
				System.out.print("\t"+data);
			}
			
			System.out.println();
			
			
		}	
	}
	
}
