<!DOCTYPE html>
<html>
<head>
<title>Java Web Programming: Populate Database</title>
<meta name="description" content="This is a JSP page that populates a database from a excel spreadsheet.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
  <div class="hero-unit">
    <h1>Populate Database</h1>
  </div>
  <%@ include file="includes/navigation.jsp" %>
  <div class="container">
    <form action="PopulateDatabase" method="post">
      <p>Click on the populate button to populate the movie database.</p>
      <input type="submit" value="Populate">
      <p class="warning center"><em>Warning: Submitting this form will reset the database and it will
      only contain those movies in the original spreadsheet!</em></p>
    </form>
  </div>
  <%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>