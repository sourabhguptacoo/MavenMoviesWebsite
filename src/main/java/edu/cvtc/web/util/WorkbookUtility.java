/**
 * 
 */
package edu.cvtc.web.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import edu.cvtc.web.model.Movie;

/**
 * @author hstockdill
 *
 */
public class WorkbookUtility {
  
  public static final String INPUT_FILE = "/assets/MovieBook.xlsx";
  
  public static List<Movie> retrieveMoviesFromWorkbook(final File inputFile) throws InvalidFormatException, IOException{
    
    final List<Movie> movies = new ArrayList<>();
    
    //NOTES: create a Workbook from the input file
    final Workbook workbook = WorkbookFactory.create(inputFile);   
    
    final Sheet sheet = workbook.getSheetAt(0);
    
    //NOTES: iterate over each row in the Worksheet from the Workbook
    for(final Row row:sheet) {
      final Cell titleCell = row.getCell(0);
      final Cell directorCell = row.getCell(1);
      final Cell lengthInMinutesCell = row.getCell(2);
      final Cell imageURLCell = row.getCell(3);
      final Cell playURLCell = row.getCell(4);
      
      final Movie movie = new Movie(
                              titleCell.getStringCellValue().trim(),
                              directorCell.getStringCellValue().trim(),
                              (int) lengthInMinutesCell.getNumericCellValue(),
                              imageURLCell.getStringCellValue().trim(),
                              playURLCell.getStringCellValue().trim());
    //(int) lengthInMinutes.getNumericCellValue(),
      //NOTES: add each new Movie to our List of movies
      movies.add(movie);
    }
        
    return movies;
    
  }

}
