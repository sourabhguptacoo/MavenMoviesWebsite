<!DOCTYPE html>
<html>
<head>
<title>Java Web Programming: Index</title>
<meta name="description" content="This is a servlet that demonstrates
    how to use IO to output the contents of an Excel spreadsheet to a web page.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
  <div class="hero-unit">
    <h1>Welcome to my Favorite Movie Site</h1>
  </div>
  <%@ include file="includes/navigation.jsp" %>
  <div class="container">
    <p>View all of my favorite movies. Created using Maven. Initial entries stored 
    in an external file with the extension of '.xlsx' which then populates the database.</p>
  </div>
  <%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>