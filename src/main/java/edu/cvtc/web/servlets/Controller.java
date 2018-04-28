package edu.cvtc.web.servlets;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import edu.cvtc.web.comparators.*;
import edu.cvtc.web.model.Movie;
import edu.cvtc.web.util.WorkbookUtility;

/**
 * Servlet implementation class ViewAllController
 */
@WebServlet("/ViewAll")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  //final String fileName = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
	  //final File inputFile = new File(fileName);
	  
	  String target = null;
	  
	  try {
	    
	    final String fileName = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
	    final File inputFile = new File(fileName);
      final List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);
      
      final String sortType = request.getParameter("sortType");
      
      if (sortType != null) {
        sortPeople(movies, sortType);
      }
      
      request.setAttribute("movies", movies);
      
      target = "view-all.jsp";
      
    } catch (InvalidFormatException e) {
      e.printStackTrace();
      throw new IOException("The workbook file has an invalid format.");
    }
	  
	  request.getRequestDispatcher(target).forward(request, response);
	  
	}
	
	private void sortPeople(final List<Movie> people, final String sortType) {
    switch (sortType) {
    case "director":
      Collections.sort(people, new DirectorComparator());
      break;
    case "playTime":
      Collections.sort(people, new LengthInMinutesComparator());
      break;
    case "title":
      Collections.sort(people, new TitleComparator());
      break;
    default:
      break;
    }
  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
