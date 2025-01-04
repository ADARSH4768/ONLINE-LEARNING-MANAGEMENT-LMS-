<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${not empty message}">
    <div>${message}</div>
</c:if>
<c:if test="${not empty error}">
    <div style="color:red;">${error}</div>
</c:if>
