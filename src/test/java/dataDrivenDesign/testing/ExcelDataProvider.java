package dataDrivenDesign.testing;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	 public static void main(String[] args) {
		 getUserData();
		}
	 
	@DataProvider(name = "ExternalDataSet")
	 public static Object[][] getUserData() {
		 String file = "D:\\Program Files\\Rakhi\\eclipse-workspace\\AutoTesting\\data\\data.xlsx";
			String sheetName = "dataSheet";
			
			ExcelHandler ex = new ExcelHandler(file, sheetName);
			int row =ex.getRowCount();
			int col = ex.getColCount();
			
			Object[][] data = new Object[row -1][col];
	
			for(int r = 1 ; r<row; r++) {
			  for(int c = 0; c<col; c++) {
//				  System.out.print(ex.getCellDataString(r, c)+ "\t\t");
				  data[r - 1][c] = ex.getCellDataString(r, c);
			  }
//			  System.out.println();
			}
			return data;
	 }
}
