<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Product Listing</title>
</head>
<body>
    <h2>List of Products</h2>
    <table class="table table-bordered">
        <tr>
            <th>ID</th>
            <th>Product Name</th>
            <th>Best Price</th>
            <th>Currency</th>
            <th>Location</th>
			<th></th>
        </tr>
        <tbody>
            <c:forEach items="${products}" var="product" varStatus="itr">
                <tr>
                    <td>${itr.index+1}</td>
                    <td>${product.productName}</td>
                    <td>${product.bestPrice}</td>
                    <td>${product.currency}</td>
					<td>${product.location}</td>
                    <td><a href="/product/edit/${product.id}" class="btn btn-warning">Edit</a> </td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    <a href="/product/create" class="btn btn-success">Add Product</a>

    <script type="application/javascript" src="js/jquery.js"></script>
    <script type="application/javascript" src="js/bootstrap.js"></script>
</body>
</html>