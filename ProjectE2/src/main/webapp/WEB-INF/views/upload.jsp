<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<form method="POST" action="uploadFile" enctype="multipart/form-data">
<h2>Egiants FileUpload</h2>
Choose the file to upload<input type="file" name="file" >
Name: <input type="text" name="name"><br /> <br />
<input type="submit" value="UPLOAD">
</form>
</body>
</html>