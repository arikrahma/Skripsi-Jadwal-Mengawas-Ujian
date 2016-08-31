/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icalendarconverter;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Ariq
 */
public class ReadExcel {
    
    public static void main(String[] args) throws Exception {
		File src = new File("D:\\Skripsi\\Data Baru\\Daftar Dosen.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data="";
		int data2 = 0;
		for (int i = 0; i <= sheet1.getLastRowNum(); i++) {
			for (int j = 0; j <= sheet1.getRow(i).getPhysicalNumberOfCells(); j++) {
				if (j % 10 != 0 || j == 0)
				{
					if (sheet1.getRow(i).getCell(j).getCellType() == 1)
					{
						data = sheet1.getRow(i).getCell(j).getStringCellValue();
						System.out.print(data+" ");
					}
					else
					{
						data2 = (int)sheet1.getRow(i).getCell(j).getNumericCellValue();
						System.out.print(data2+" ");
					}
				}
			}
			System.out.println();
		}
		
	}
}
