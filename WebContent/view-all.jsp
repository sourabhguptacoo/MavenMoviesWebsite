<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Web Programming: Movie List</title>
<meta name="description" content="This is a JSP example that demonstrates how to output
    every Movie in our Excel spreadsheet to a web page.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
  <div class="hero-unit">
    <h1>Favorite Movies</h1>
  </div>
  <%@ include file="includes/navigation.jsp" %>
  <div class="conatiner">
    <c:choose>
      <c:when test="${empty movies}">
        <p>Sorry, the list of movies is empty.</p>
      </c:when>
      <c:otherwise>
        <c:forEach var="movie" items="${movies}">
          <div class="span4 movieSpan">
            <h2>${movie.title}</h2>
            <p>Director: ${movie.director}<br>Length: ${movie.lengthInMinutes} minutes<br>
            <a href="${movie.playURL}">
              <img class="movieCover" src="${movie.imageURL}">
            </a></p>
          </div><br>
        </c:forEach>
      </c:otherwise>
    </c:choose>
  </div>
  <%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>