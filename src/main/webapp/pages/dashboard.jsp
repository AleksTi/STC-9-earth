<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<%@include file="../containers/head.jsp" %>
<body>

<div class="container">

    <%@include file="../containers/header.jsp" %>

    <div class="row">
        <%@include file="../containers/sidebar.jsp" %>
        <div class="col-9">
            <main class="content">
                <%@include file="../containers/tableDashboard.jsp" %>
            </main><!-- .content -->
        </div><!-- .container-->


    </div><!-- .middle-->

</div><!-- .wrapper -->
<%@include file="../containers/footer.jsp" %>
</body>
</html>