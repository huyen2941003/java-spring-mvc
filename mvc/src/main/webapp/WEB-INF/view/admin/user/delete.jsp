<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
                <link rel="stylesheet" href="/css/demo.css">
            </head>

            <body>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-12 mx-auto">
                            <div class="card" style="width: 30rem;">
                                <div class="card-header">
                                    <h3>Người dùng vừa chọn là: ${id}</h3>
                                </div>
                                <hr>
                                <div class="alert alert-danger">
                                    Mày có muốn xóa không?
                                </div>
                                <form:form method="post" action="/admin/user/delete" modelAttribute="user">
                                    <div class="mb-3" style="display: none;">
                                        <label class="form-label">Id: </label>
                                        <form:input type="text" class="form-control" path="id" />
                                    </div>
                                    <button class="btn btn-danger">Confirm</button>
                                </form:form>
                            </div>
                            <a href="/admin/user" class="btn btn-success mt-2">Quay lại</a>
                        </div>
                    </div>
                </div>
            </body>

            </html>