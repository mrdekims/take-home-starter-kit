<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Product</title>
</head>
<body>
<h2>Edit Product</h2>
<form action="/product/update" method="post">
    <input type="hidden" name="id" value="${product.id}">
    <table class="table table-bordered">
        <tbody>
        <tr><th>Product Name</th><td><input type="text" name="productName" required="required" value="${product.productName}"></td></tr>
        <tr><th>Best Price</th><td><input type="number" step="0.01" min="0" name="bestPrice" required="required" value="${product.bestPrice}"></td></tr>
        <tr><th>Currency</th><td><input type="text" name="currency" required="required" value="${product.currency}"></td></tr>
        <tr><th>Location</th><td><input type="text" name="location" required="required"  value="${product.location}"></td></tr>
        <tr><td colspan="2"><input type="submit" value="Edit Product" class="btn btn-success"></tr>
        </tbody>
    </table>
</form>
<a href="/product/index" class="btn btn-success">Back</a>
<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>
</body>
</html>