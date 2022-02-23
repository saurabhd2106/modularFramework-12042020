package test;

import org.testng.annotations.Test;

import commonLibs.utils.ExcelDriver;

public class TestExcelDriverUtil {

	@Test
	public void verifyTestExcelDriverUtil() throws Exception{
		
		ExcelDriver excelDriver = new ExcelDriver();
		
		String excelWorkbook = System.getProperty("user.dir") + "/testData/excelWorkbook1.xlsx";
		String sheetName = "TestData";
		
		excelDriver.createWorkbook(excelWorkbook);
		
		excelDriver.openWorkbook(excelWorkbook);
		
		excelDriver.createSheet(sheetName);
		
		excelDriver.setCellData(sheetName, 0, 0, "Saurabh");
		excelDriver.setCellData(sheetName, 0, 1, "Dhingra");
		
		excelDriver.setCellData(sheetName, 1, 0, "Mirav");
		excelDriver.setCellData(sheetName, 1, 1, "Dhingra");
		
		excelDriver.saveFile();
		
		excelDriver.closeWorkbook();
		
		
	}
}
