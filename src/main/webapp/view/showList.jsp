<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>

<h1>Selected condiments</h1>

<table>
<c:forEach var="c" items="${condiments}">
    <tr>
        <td>
            <c:out value="${c}"/>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
<a href="/order">Back to list</a>

