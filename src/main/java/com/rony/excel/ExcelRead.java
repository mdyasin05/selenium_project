package com.rony.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/**
 * A dirty simple program that reads an Excel file.
 *
 *
 */
public class ExcelRead {
     
    public static void main(String[] args) throws IOException {
    	
    	File file= new File(System.getProperty("user.dir")+"/ExcelFile/Employee.xlsx");
    	//File file2= new File(System.getProperty("user.dir")+"/ExcelFile/Test.xlsx");
       
        FileInputStream inputStream = new FileInputStream(file);
         
        Workbook workbook = new XSSFWorkbook(inputStream);
//       Workbook workbook1= new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/ExcelFile/Employee.xlsx")));
        
        Sheet firstSheet = workbook.getSheet("Sheet1");
        
        Iterator<Row> rowIterator = firstSheet.iterator();
         
        while (rowIterator.hasNext()) {
            Row nextRow = rowIterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
             
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                 
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    default:
					break;

                }
                System.out.print(" | ");
            }
            System.out.println();
        }
         
        workbook.close();
        inputStream.close();
    }
 
}
 
