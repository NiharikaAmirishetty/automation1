package dataprovider;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datacopy {

	public static void main(String[] args) throws IOException {


		FileInputStream file=new FileInputStream("C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\datasheet\\Epic by product owner -Swhizz portal (1) - Copy.xlsx") ;
		XSSFWorkbook workbook=  new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		System.err.println(row);
		System.err.println(col);
		for (int i = 5; i <=row; i++) {
			XSSFRow rowdata=sheet.getRow(i);
			for (int j = 1; j<col; j++) {
				XSSFCell coldata=rowdata.getCell(j);
				System.out.print("  "+coldata);
				
			}
			System.err.println();
		
		}

	}
}