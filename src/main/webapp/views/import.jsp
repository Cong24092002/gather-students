<!DOCTYPE html>
<html lang="vi">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>import file</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <h1>Import file .xlsx</h1>
    <form:form method="POST" action="/importFile/uploadFile" enctype="multipart/form-data">
        <table>
            <tr>
                <td><form:label path="file">Select a file to upload</form:label></td>
                <td><input type="file" name="file" /></td>
            </tr>
            <tr>
                <a href="/find/showListStudent" class="btn-submit"><button>submit</button></a>    
        </tr>
        </table>
    </form>
     
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
     
</body>
</html>