<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="../img/muwan.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><security:authentication property="principal.username"/></p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <!-- search form -->
        <!--<form action="#" method="get" class="sidebar-form">
    <div class="input-group">
        <input type="text" name="q" class="form-control" placeholder="搜索...">
        <span class="input-group-btn">
        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
        </button>
      </span>
    </div>
</form>-->
        <!-- /.search form -->


        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">Menu</li>

            <li id="admin-index"><a href="${pageContext.request.contextPath}/product/findAll2.do"><i class="fa fa-dashboard"></i> <span>Home</span></a></li>

            <!-- 菜单 -->

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-circle"></i> <span>User(not support)</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-login">
                        <a href="#">
                            <i class="fa fa-circle-o"></i> Order(not support)
                        </a>
                    </li>
                    <li id="admin-set">
                        <a href="#">
                            <i class="fa fa-circle-o"></i> Account Setting(not support)
                        </a>
                    </li>

                </ul>
            </li>

            <security:authorize access="hasRole('ADMIN')">
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-circle"></i> <span>Manage All</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li id="admin-r">
                        <a href="${pageContext.request.contextPath}/product/findAll.do">
                            <i class="fa fa-circle-o"></i> Manage Products
                        </a>
                    </li>
                    <li id="admin-register">
                        <a href="${pageContext.request.contextPath}/role/findAll.do">
                            <i class="fa fa-circle-o"></i> Manage Roles
                        </a>
                    </li>
                    <li id="admin-regist">
                        <a href="${pageContext.request.contextPath}/orders/findAll.do">
                            <i class="fa fa-circle-o"></i> Manage Orders
                        </a>
                    </li>
                    <li id="admin-re">
                        <a href="${pageContext.request.contextPath}/user/findAll.do">
                            <i class="fa fa-circle-o"></i> Manage Users
                        </a>
                    </li>
                    <li id="admin-">
                        <a href="${pageContext.request.contextPath}/permission/findAll.do">
                            <i class="fa fa-circle-o"></i> Manage Permissions
                        </a>
                    </li>
                    <li id="admin">
                        <a href="${pageContext.request.contextPath}/sysLog/findAll.do">
                            <i class="fa fa-circle-o"></i> Check Logs
                        </a>
                    </li>
                </ul>
            </li>
            </security:authorize>

        </ul>
    </section>
    <!-- /.sidebar -->
</aside>