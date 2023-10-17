package dataDrivenDesign.testing;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {
	
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	
	public ExcelHandler(String file, String sheetName) {
		
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetName);
	}
	
    public int getRowCount() {
    	return sheet.getPhysicalNumberOfRows();
    }
    
    public int getColCount() {
    	return sheet.getRow(0).getPhysicalNumberOfCells();
    }
    public String getCellDataString(int row, int col) {
    	return sheet.getRow(row).getCell(col).getStringCellValue();
    }
	
}
