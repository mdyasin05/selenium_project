package com.rony.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	

    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

    File file =    new File(filePath+"\\"+fileName);
    FileInputStream inputStream = new FileInputStream(file);
    Workbook workbook = null;

    //Find the file extension by splitting file name in substring  and getting only extension name
    String fileExtension = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx/xls file
    if(fileExtension.equals(".xlsx")){
    	workbook = new XSSFWorkbook(inputStream);

    }
    else if(fileExtension.equals(".xls")){
        	workbook = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name
    Sheet sheet = workbook.getSheet(sheetName);

    //Find number of rows in excel file
    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it
    for (int i = 0; i < rowCount+1; i++) {

        Row row = sheet.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

        }

        System.out.println();
    } 

    }  

    //Main function is calling readExcel function to read data from excel file

    public static void main(String...strings) throws IOException{

    //Create an object of ReadGuru99ExcelFile class

    ExcelRead objExcelFile = new ExcelRead();

    //Prepare the path of excel file

    String filePath = System.getProperty("user.dir")+"\\files";

    //Call read file method of the class to read data

    objExcelFile.readExcel(filePath,"Md_Test.xlsx","Sheet1");

    }

}
