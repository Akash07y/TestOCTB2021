package utils;

import org.openqa.selenium.WebDriver;

public class Utility {

	public static String getDataFromExcel(String sheet, int row, int col) {
		
		String data = "";

		try {
			data = cell.getStringCellValue();
		}
		catch(InvalidStateException e)
		{
			double value = cell.getNumericCellValue();
			// convert double to String
			data = value will be com=nvrted to String;
		}
		catch(NullPonter e)
		{
			System.out.println("cell is blank");
		}

		return data;
	}
	
	public static void getScrrenshot(WebDriver driver, int testID) {
		
		// screenshot code
		
		name =>   Test-101 11-02-2022 08 03 26 
	}
}
