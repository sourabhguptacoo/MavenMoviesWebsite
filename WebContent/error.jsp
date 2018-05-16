<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Page Error!</title>
<meta name="description" content="This is a JSP error page that appears whenever we encounter a problem in our application.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
  <div class="hero-unit">
    <h1>Java Error</h1>
  </div>
  <%@ include file="includes/navigation.jsp" %>
  <div class="container">
    <c:choose>
      <c:when test="${message != null}">
        <p>${message}</p>
      </c:when>
      <c:otherwise>
        <iframe src='https://gfycat.com/ifr/OnlyRedBarbet' frameborder='0' scrolling='no' width='350' height='178' allowfullscreen></iframe>
        <p>There is an issue, we're not entirely sure what happened here.</p>
        <br>
        <p><em>
        ${pageContext.exception["class"]}<br>
        ${pageContext.exception.message}
        </em></p>
      </c:otherwise>
    </c:choose>
  </div>
  <%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>