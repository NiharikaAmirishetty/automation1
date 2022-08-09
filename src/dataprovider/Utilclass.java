package dataprovider;

import java.io.IOException;

public class Utilclass {
	
	public  String[][] gettestdata() throws IOException {
		
		XLUtility reader=new  XLUtility("C:\\Users\\amahe\\Desktop\\mahi\\Selenium\\src\\dataprovider\\XLUtility.java");
		
		int rowcount=reader.getRowCount("TestData");
		int colcount=reader.getCellCount("TestData",1);
		
		String exceldata[][]=new String [rowcount-1][colcount];
		for (int i = 0; i <rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				exceldata[i-2][j]=reader.getCellData("TestData", i, j);
				
				
			}
		}
		return exceldata;
	}
	

}
