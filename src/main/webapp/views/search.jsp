<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>search</title>
</head>
<body>
    <h1>Search information Student</h1>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
        }
    </style>
   
     <table>
        <tr>
            <th>STT</th>
            <th>School</th>
            <th>Quan/Huyen</th>
            <th>StudenID</th>
            <th>Class</th>
            <th>FullName</th>
            <th>Day</th>
            <th>Month</th>
            <th>Year</th>
            <th>Sex</th>
            <th>Countryside</th>
            <th>Ethnic</th>
            <th>HouseHold</th>
            <th>Phone</th>
            <th>P1</th>
            <th>P2</th>
            <th>P3</th>
            <th>P4</th>
            <th>P5</th>
            <th>UuTien</th>
            <th>SumP</th>
            <th>Comment</th>
        </tr>
        <c:forEach var="student" items="${student}">
            <tr>
                <td>${student.getStt()}</td>
                <td>${student.getSchool()}</td>
                <td>${student.getDistric()}</td>
                <td>${student.getStudentID()}</td>
                <td>${student.getIClass()}</td>
                <td>${student.getName()}</td>
                <td>${student.getDay()}</td>
                <td>${student.getMonth()}</td>
                <td>${student.getYear()}</td>
                <td>${student.getSex()}</td>
                <td>${student.getCountryside()}</td>
                <td>${student.getEthnic()}</td>
                <td>${student.getHousehold()}</td>
                <td>${student.getPhone()}</td>
                <td>${student.getP1()}</td>
                <td>${student.getP2()}</td>
                <td>${student.getP3()}</td>
                <td>${student.getP4()}</td>
                <td>${student.getP5()}</td>
                <td>${student.getUuTien()}</td>
                <td>${student.getSumP()}</td>
                <td>${student.getComment()}</td>

             </tr>
        </c:forEach>
    </table> 
</body>
</html>