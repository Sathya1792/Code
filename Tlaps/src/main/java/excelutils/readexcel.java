package excelutils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {
	
public static Object[][] excel(String filename) throws IOException

{
	XSSFWorkbook wbook= new XSSFWorkbook("./Data/"+filename+".xlsx");
	XSSFSheet Sheet= wbook.getSheetAt(0);
	int rownum= Sheet.getLastRowNum();
	int colnum= Sheet.getRow(0).getLastCellNum();
	String Data[][]= new String[rownum][colnum];
	for(int i=1;i<=rownum;i++)
	{
		XSSFRow row= Sheet.getRow(i);
		for(int j=0;j<colnum;j++)
	
	
	{
		XSSFCell col= row.getCell(j);
		Data[i-1][j]= col.getStringCellValue();
		
		
	}
	}
	
	wbook.close();
	return Data;
	
	
	
}

}
