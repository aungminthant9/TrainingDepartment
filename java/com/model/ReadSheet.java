package com.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class ReadSheet {
  public List<String> getCourses() throws IOException{
	  List<String> courseList = new ArrayList<String>();
	  FileInputStream fileurl = new FileInputStream(new File("D:\\Module5\\Servlet Project\\TrainingDepartmentCourse\\src\\main\\webapp\\CourseList.xlsx"));
	  XSSFWorkbook workbook = new XSSFWorkbook(fileurl);
	  XSSFSheet spreadsheet = workbook.getSheetAt(0);
	  Iterator<Row> rowIterator = spreadsheet.iterator();
	  while (rowIterator.hasNext()) {
		  XSSFRow row  = (XSSFRow) rowIterator.next();
		  Iterator < Cell > cellIterator = row.cellIterator();
		  if (cellIterator.hasNext()) {
			    Cell firstCell = cellIterator.next();
			    
			    // Get the value of the first cell
			    String value = firstCell.getStringCellValue(); // Assuming the cell contains a string value
			    courseList.add(value);
			    // Do something with the value
//			    System.out.println("Value of the first cell: " + value);
			    
			}
	  }
	  fileurl.close();
	  return courseList;
	  
  }
//  public static void main(String[]args) throws IOException {
//	  ReadSheet excel = new ReadSheet();
//	  List<String> cl = excel.getCourses();
//	  for(String each:cl) {
//		  System.out.println(each);
//	  }
//	  
//  }
}
