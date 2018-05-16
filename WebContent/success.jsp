<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Success!</title>
<meta name="description" content="This page is reached when the user creates a successful action.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
  <div class="hero-unit">
    <h1>Success</h1>
  </div>
  <%@ include file="includes/navigation.jsp" %>
  <div class="container">
    <p>${message}</p>
  </div>
  <%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>