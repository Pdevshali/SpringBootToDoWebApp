<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
    <title>Welcome to Adds Todo Page</title>



</head>
<body>
<div class="container">
<h1> Enter todo details</h1>
    <form method="post">
    Description : <input type="text" name="description"
    required="required"/>
    <input type="submit" class="btn btn-success"/ >

    </form>
</div>

    <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.7.0/jquery.min.js"></script>
</body>
</html>
