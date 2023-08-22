package dataDesign.testing;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {
	
	private XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelHandler(String file, String sheetName) {
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.sheet = workbook.getSheet(sheetName);
	}
	
	public int getRowNum() {
		return sheet.getPhysicalNumberOfRows();
	}
	
}
