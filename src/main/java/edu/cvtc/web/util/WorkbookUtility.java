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
  
  public static final String INPUT_FILE = "/assets/MovieList.xlsx";
  
  public static List<Movie> retrieveMoviesFromWorkbook(final File inputFile) throws InvalidFormatException, IOException{
    
    final List<Movie> movies = new ArrayList<>();
    
    //NOTES: create a Workbook from the input file
    final Workbook workbook = WorkbookFactory.create(inputFile);   
    
    final Sheet sheet = workbook.getSheetAt(0);
    
    //NOTES: iterate over each row in the Worksheet from the Workbook
    for(final Row row:sheet) {
      final Cell title = row.getCell(0);
      final Cell director = row.getCell(1);
      final Cell lengthInMinutes = row.getCell(2);
      final Cell imageURL = row.getCell(3);
      final Cell playURL = row.getCell(4);
      
      final Movie movie = new Movie(
                              title.getStringCellValue().trim(),
                              director.getStringCellValue().trim(),
                              (int) lengthInMinutes.getNumericCellValue(),
                              imageURL.getStringCellValue().trim(),
                              playURL.getStringCellValue().trim());
      
      //NOTES: add each new Movie to our List of movies
      movies.add(movie);
    }
        
    return movies;
    
  }

}
