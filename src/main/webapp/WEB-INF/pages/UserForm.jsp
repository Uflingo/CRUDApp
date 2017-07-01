<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New/Edit</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit User</h1>
        <form:form action="saveUser" method="post" modelAttribute="user">
            <table>
                <form:hidden path="id"/>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><form:input path="age" /></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><form:input path="admin" /></td>
                </tr>
                <tr>
                    <td>Telephone:</td>
                    <td><form:input path="createDate" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save"></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
