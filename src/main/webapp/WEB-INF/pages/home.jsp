<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User management screen</title>
</head>
<body>
<div align="center">
    <h1>User List</h1>
    <h3>
        <a href="/newUser">New User</a>
    </h3>
    <table border="1">

        <th>Name</th>
        <th>Age</th>
        <th>isAdmin</th>
        <th>createDate</th>

        <c:forEach var="user" items="${listUser}">
            <tr>

                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.admin}</td>
                <td>${user.createDate}</td>
                <td><a href="/editUser?id=${user.id}">Edit</a>
                    <a
                            href="/deleteUser?id=${user.id}">Delete</a></td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
