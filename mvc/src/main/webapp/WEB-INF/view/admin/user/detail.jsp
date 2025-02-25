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
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item">${user.id}</li>
                                    <li class="list-group-item">${user.email}</li>
                                    <li class="list-group-item">${user.phone}</li>
                                    <li class="list-group-item">${user.fullName}</li>
                                    <li class="list-group-item">${user.address}</li>
                                </ul>
                            </div>
                            <a href="/admin/user/list" class="btn btn-success mt-2">Back</a>
                        </div>
                    </div>
                </div>
            </body>

            </html>