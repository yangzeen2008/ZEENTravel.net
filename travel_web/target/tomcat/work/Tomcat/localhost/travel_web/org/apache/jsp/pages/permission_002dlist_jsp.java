/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-24 02:47:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class permission_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- 页面meta -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>ZEEN Travel</title>\r\n");
      out.write("    <meta name=\"description\" content=\"zeen Travel\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"zeen Travel\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionicons/css/ionicons.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/iCheck/square/blue.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/morris/morris.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/datepicker/datepicker3.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/datatables/dataTables.bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/treeTable/jquery.treetable.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/treeTable/jquery.treetable.theme.default.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/select2/select2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/colorpicker/bootstrap-colorpicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/adminLTE/css/AdminLTE.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/adminLTE/css/skins/_all-skins.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionslider/ion.rangeSlider.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/ionslider/ion.rangeSlider.skinNice.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-slider/slider.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"hold-transition skin-black-light sidebar-mini\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "aside.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- 内容头部 -->\r\n");
      out.write("        <section class=\"content-header\">\r\n");
      out.write("            <h1>\r\n");
      out.write("                Permissions\r\n");
      out.write("                <small>Permission Table</small>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <ol class=\"breadcrumb\">\r\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\r\n");
      out.write("                <li><a href=\"#\"> Manage</a></li>\r\n");
      out.write("                <li class=\"active\"> Manage Permission</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- 内容头部 /-->\r\n");
      out.write("\r\n");
      out.write("        <!-- 正文区域 -->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- .box-body -->\r\n");
      out.write("            <div class=\"box box-primary\">\r\n");
      out.write("                <div class=\"box-header with-border\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- 数据表格 -->\r\n");
      out.write("                    <div class=\"table-box\">\r\n");
      out.write("\r\n");
      out.write("                        <!--工具栏-->\r\n");
      out.write("                        <div class=\"pull-left\">\r\n");
      out.write("                            <div class=\"form-group form-inline\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" title=\"CREATE\" onclick=location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/permission-add.jsp\"><i class=\"fa fa-file-o\"></i> CREATE</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" title=\"REFRESH\" onclick=location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do\"><i class=\"fa fa-refresh\"></i> REFRESH</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!--工具栏/-->\r\n");
      out.write("\r\n");
      out.write("                        <!--数据列表-->\r\n");
      out.write("                        <table id=\"dataList\" class=\"table table-bordered table-striped table-hover dataTable\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("\r\n");
      out.write("                                <th class=\"sorting_asc\">ID</th>\r\n");
      out.write("                                <th class=\"sorting_desc\">Permission Name</th>\r\n");
      out.write("                                <th class=\"sorting_asc sorting_asc_disabled\">Permission URL</th>\r\n");
      out.write("                                <th class=\"text-center\">options</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                            <!--\r\n");
      out.write("                        <tfoot>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                        <th>Rendering engine</th>\r\n");
      out.write("                        <th>Browser</th>\r\n");
      out.write("                        <th>Platform(s)</th>\r\n");
      out.write("                        <th>Engine version</th>\r\n");
      out.write("                        <th>CSS grade</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        </tfoot>-->\r\n");
      out.write("                        </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.box-body -->\r\n");
      out.write("\r\n");
      out.write("                <!-- .box-footer-->\r\n");
      out.write("                <div class=\"box-footer\">\r\n");
      out.write("                    <div class=\"pull-left\">\r\n");
      out.write("                        <div class=\"form-group form-inline\">\r\n");
      out.write("                            Each page\r\n");
      out.write("                            <select class=\"form-control\" id=\"changePageSize\" onchange=\"productChangePageSize() \">\r\n");
      out.write("                                <option>1</option>\r\n");
      out.write("                                <option>2</option>\r\n");
      out.write("                                <option>3</option>\r\n");
      out.write("                                <option>4</option>\r\n");
      out.write("                                <option>5</option>\r\n");
      out.write("                                <option>6</option>\r\n");
      out.write("                                <option>7</option>\r\n");
      out.write("                                <option>8</option>\r\n");
      out.write("                                <option>9</option>\r\n");
      out.write("                                <option>10</option>\r\n");
      out.write("                            </select> information\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"box-tools pull-right\">\r\n");
      out.write("                        <ul class=\"pagination\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do?page=1&size=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pageSize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" aria-label=\"Previous\">First page</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pageNum-1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&size=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pageSize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Back</a></li>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pageNum+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&size=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pageSize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Next</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&size=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pageSize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" aria-label=\"Next\">Last page</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.box-footer-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- 正文区域 /-->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jQueryUI/jquery-ui.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/raphael/raphael-min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/morris/morris.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("<script src=\"../plugins/knob/jquery.knob.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/daterangepicker/daterangepicker.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("<script src=\"../plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/adminLTE/js/app.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/treeTable/jquery.treetable.js\"></script>\r\n");
      out.write("<script src=\"../plugins/select2/select2.full.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/colorpicker/bootstrap-colorpicker.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/bootstrap-markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/to-markdown.js\"></script>\r\n");
      out.write("<script src=\"../plugins/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.date.extensions.js\"></script>\r\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.extensions.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/chartjs/Chart.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.resize.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.pie.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.categories.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/ionslider/ion.rangeSlider.min.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-slider/bootstrap-slider.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script src=\"../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    function productChangePageSize(){\r\n");
      out.write("\r\n");
      out.write("        var pageSize = $(\"#changePageSize\").val();\r\n");
      out.write("        location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do?page=1&size=\" + pageSize;\r\n");
      out.write("    }\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        // 选择框\r\n");
      out.write("        $(\".select2\").select2();\r\n");
      out.write("\r\n");
      out.write("        // WYSIHTML5编辑器\r\n");
      out.write("        $(\".textarea\").wysihtml5({\r\n");
      out.write("            locale: 'zh-CN'\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // 设置激活菜单\r\n");
      out.write("    function setSidebarActive(tagUri) {\r\n");
      out.write("        var liObj = $(\"#\" + tagUri);\r\n");
      out.write("        if (liObj.length > 0) {\r\n");
      out.write("            liObj.parent().parent().addClass(\"active\");\r\n");
      out.write("            liObj.addClass(\"active\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        // 激活导航位置\r\n");
      out.write("        setSidebarActive(\"admin-index\");\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<!---->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pages/permission-list.jsp(130,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/permission-list.jsp(130,28) '${perList.list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perList.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/permission-list.jsp(130,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("permission");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${permission.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${permission.permissionName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${permission.url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("                                    <td class=\"text-center\">\r\n");
          out.write("                                        <button type=\"button\" class=\"btn bg-olive btn-xs\">Delete</button>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /pages/permission-list.jsp(189,28) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setBegin(1);
    // /pages/permission-list.jsp(189,28) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pages}", java.lang.Integer.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).intValue());
    // /pages/permission-list.jsp(189,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("pageNum");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/permission/findAll.do?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&size=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${perList.pageSize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
