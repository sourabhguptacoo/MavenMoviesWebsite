package edu.cvtc.web.servlets;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.dao.impl.MovieDaoException;
import edu.cvtc.web.dao.impl.MovieDaoImpl;
import edu.cvtc.web.model.Movie;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/Search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String target = null;
    
    try {
      
      final MovieDao movieDao = new MovieDaoImpl();
      final List<Movie> movies = movieDao.retrieveMovies();
            
      final String searchQuery = request.getParameter("query");
      
      // Filter that allows partial titles/names to be entered while still ignoring case
      final List<Movie> filteredMovies = movies
          .stream()
          .filter((movie) -> {
            if (movie.getTitle().toLowerCase().contains(searchQuery.toLowerCase())) {
              return true;
            }else if(movie.getDirector().toLowerCase().contains(searchQuery.toLowerCase())) {
              return true;
            }
            return false;
          })
          .collect(Collectors.toList());
      
      request.setAttribute("movies", filteredMovies);
      
      target = "view-all.jsp";
      
    } catch (MovieDaoException e) {
      e.printStackTrace();
      request.setAttribute("message", e.getMessage());
      target = "error.jsp";
    }
    
    request.getRequestDispatcher(target).forward(request, response);
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
