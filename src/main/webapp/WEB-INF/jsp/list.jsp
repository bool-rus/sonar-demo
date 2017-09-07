<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Books</title>
</head>
<body>

<table>
  <c:forEach items="${list}" var="book">
    <tr>
      <td><td>${book.name}</td><td>${book.price}</td>
    </tr>
  </c:forEach>
</table>

    <h2>create book</h2>
    <form method="POST">
        <div><label>name</label><input type="text" name="name" /></div>
        <div><label>price</label><input type="text" name="price"/></div>
        <div><input type="submit" value="Submit" name="submit" /></div>
    </form>

</body>
</html>