package com.bridgelabz.selenium.utility;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class ReadData {

    public static String getCellValue(String EXCEL_PATH ,String sheet, int row ,int column)
    {
        String value = "";
        try
        {
            Workbook wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
            value = wb.getSheet(sheet).getRow(row).getCell(column).toString();
            System.out.println("getRownumber:-"+wb.getSheet(sheet).getRow(row).getCell(column));

        }
        catch (Exception e)
        {e.printStackTrace();}
        return value;
    }
}
