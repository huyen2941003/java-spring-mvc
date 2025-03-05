<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="utf-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
                <meta name="description" content="" />
                <meta name="author" content="" />
                <title>Create Product</title>
                <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
                <link href="/css/style.css" rel="stylesheet" />
                <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
            </head>

            <body class="sb-nav-fixed">
                <jsp:include page="../layout/header.jsp" />

                <div id="layoutSidenav">
                    <div id="layoutSidenav_nav">
                        <jsp:include page="../layout/sidebar.jsp" />
                    </div>
                    <div id="layoutSidenav_content">
                        <main>
                            <div class="container-fluid px-4">
                                <h1 class="mt-4">Product</h1>
                                <ol class="breadcrumb mb-4">
                                    <li class="breadcrumb-item active"><a href="/admin">Dashboard</a> /
                                        Product
                                    </li>
                                </ol>
                                <div class="row">
                                    <div class="col-6">
                                        <form:form method="post" action="/admin/product/create"
                                            modelAttribute="product">
                                            <div class="mb-3">
                                                <label class="form-label">Name: </label>
                                                <form:input type="text" class="form-control" path="name" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Price: </label>
                                                <form:input type="number" class="form-control" path="price" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Detail description: </label>
                                                <form:input type="text" class="form-control" path="detailDesc" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Quantity: </label>
                                                <form:input type="number" class="form-control" path="quantity" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Sold: </label>
                                                <form:input type="number" class="form-control" path="sold" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Factory: </label>
                                                <form:input type="text" class="form-control" path="factory" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Target: </label>
                                                <form:input type="text" class="form-control" path="target" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Image: </label>
                                                <form:input type="text" class="form-control" path="image" />
                                            </div>
                                            <div class="mb-3">
                                                <button class="btn btn-success">Create</button>
                                                <a href="/admin/product" class="btn btn-primary">Quay lại</a>
                                            </div>
                                        </form:form>
                                    </div>
                                </div>
                            </div>
                        </main>
                        <jsp:include page="../layout/footer.jsp" />
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    crossorigin="anonymous"></script>
                <script src="/js/scripts.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js"
                    crossorigin="anonymous"></script>
                <script src="/js/datatables-simple-demo.js"></script>
            </body>

            </html>