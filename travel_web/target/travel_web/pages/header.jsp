<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<header class="main-header">


    <!-- Logo -->
    <a href="${pageContext.request.contextPath}/product/findAll2.do?page=1&size=5" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>ZEEN</b></span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>ZEEN Travel</b></span>
    </a>


    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">

                <!-- Tasks: style can be found in dropdown.less -->
                <li class="dropdown tasks-menu">
                    <a href="#" >
                        <i class="fa fa-shopping-cart"></i>

                    </a>

                </li>


                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="../img/muwan.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs">
                            <security:authentication property="principal.username"/>
                        </span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="../img/muwan.jpg" class="img-circle" alt="User Image">

                            <p>
                                <security:authentication property="principal.username"/>
                                <small>
                                    Log in on <script> document.write(new Date().toLocaleDateString()); </script>
                                </small>


                            </p>
                        </li>
                        <!-- Menu Body
                <li class="user-body">
                    <div class="row">
                        <div class="col-xs-4 text-center">
                            <a href="#">Followers</a>
                        </div>
                        <div class="col-xs-4 text-center">
                            <a href="#">Sales</a>
                        </div>
                        <div class="col-xs-4 text-center">
                            <a href="#">Friends</a>
                        </div>
                    </div>
                </li>-->
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
<%--                                <a href="#" class="btn btn-default btn-flat">Change password</a>--%>
                            </div>
                            <div class="pull-right">
                                <a href="${pageContext.request.contextPath}/logout.do" class="btn btn-default btn-flat">Sign Out</a>
                            </div>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>
</header>
