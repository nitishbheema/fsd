<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Add Employee</title>
<style>
body{font-family:Arial,sans-serif;padding:30px;background:#f5f6fa;}
.card{background:white;padding:30px;border-radius:10px;max-width:450px;box-shadow:0 2px 8px rgba(0,0,0,0.1);}
h2{color:#2c3e50;margin-bottom:20px;}
label{display:block;font-weight:bold;font-size:13px;margin-bottom:5px;color:#555;}
input{width:100%;padding:10px;border:1px solid #ddd;border-radius:6px;font-size:14px;margin-bottom:14px;}
button{width:100%;padding:12px;background:#3498db;color:white;border:none;border-radius:6px;font-size:15px;cursor:pointer;}
</style>
</head>
<body>
<div class="card">
<h2>Add New Employee</h2>
<form:form method="POST" action="/employees/add" modelAttribute="employee">
    <label>Name</label>
    <form:input path="name" placeholder="Employee Name"/>
    <label>Department</label>
    <form:input path="department" placeholder="Department"/>
    <label>Salary</label>
    <form:input path="salary" type="number" placeholder="Salary"/>
    <button type="submit">Save Employee</button>
</form:form>
</div>
</body>
</html>
