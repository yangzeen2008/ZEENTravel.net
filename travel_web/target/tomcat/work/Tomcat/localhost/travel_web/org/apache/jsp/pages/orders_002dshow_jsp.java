/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-23 23:50:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orders_002dshow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html");
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
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- é¡µé¢meta -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>ZEEN Travel</title>\r\n");
      out.write("    <meta name=\"description\" content=\"ZEEN Travel\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"ZEEN Travel\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <!-- Ionicons -->\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <!-- Morris chart -->\r\n");
      out.write("    <!-- jvectormap -->\r\n");
      out.write("    <!-- Date Picker -->\r\n");
      out.write("    <!-- Daterange picker -->\r\n");
      out.write("    <!-- Bootstrap time Picker -->\r\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"../../../plugins/timepicker/bootstrap-timepicker.min.css\">-->\r\n");
      out.write("    <!-- bootstrap wysihtml5 - text editor -->\r\n");
      out.write("    <!--æ°æ®è¡¨æ ¼-->\r\n");
      out.write("    <!-- è¡¨æ ¼æ  -->\r\n");
      out.write("    <!-- select2 -->\r\n");
      out.write("    <!-- Bootstrap Color Picker -->\r\n");
      out.write("    <!-- bootstrap wysihtml5 - text editor -->\r\n");
      out.write("    <!--bootstrap-markdown-->\r\n");
      out.write("    <!-- Theme style -->\r\n");
      out.write("    <!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("       folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("    <!-- Ion Slider -->\r\n");
      out.write("    <!-- ion slider Nice -->\r\n");
      out.write("    <!-- bootstrap slider -->\r\n");
      out.write("    <!-- bootstrap-datetimepicker -->\r\n");
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
      out.write("    <!-- jQuery 2.2.3 -->\r\n");
      out.write("    <!-- jQuery UI 1.11.4 -->\r\n");
      out.write("    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <!-- Morris.js charts -->\r\n");
      out.write("    <!-- Sparkline -->\r\n");
      out.write("    <!-- jvectormap -->\r\n");
      out.write("    <!-- jQuery Knob Chart -->\r\n");
      out.write("    <!-- daterangepicker -->\r\n");
      out.write("    <!-- datepicker -->\r\n");
      out.write("    <!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("    <!-- Slimscroll -->\r\n");
      out.write("    <!-- FastClick -->\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <!-- AdminLTE App -->\r\n");
      out.write("    <!-- è¡¨æ ¼æ  -->\r\n");
      out.write("    <!-- select2 -->\r\n");
      out.write("    <!-- bootstrap color picker -->\r\n");
      out.write("    <!-- bootstrap time picker -->\r\n");
      out.write("    <!--<script src=\"../../../plugins/timepicker/bootstrap-timepicker.min.js\"></script>-->\r\n");
      out.write("    <!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("    <!--bootstrap-markdown-->\r\n");
      out.write("    <!-- CK Editor -->\r\n");
      out.write("    <!-- InputMask -->\r\n");
      out.write("    <!-- DataTables -->\r\n");
      out.write("    <!-- ChartJS 1.0.1 -->\r\n");
      out.write("    <!-- FLOT CHARTS -->\r\n");
      out.write("    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->\r\n");
      out.write("    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->\r\n");
      out.write("    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->\r\n");
      out.write("    <!-- jQuery Knob -->\r\n");
      out.write("    <!-- Sparkline -->\r\n");
      out.write("    <!-- Morris.js charts -->\r\n");
      out.write("    <!-- Ion Slider -->\r\n");
      out.write("    <!-- Bootstrap slider -->\r\n");
      out.write("    <!-- bootstrap-datetimepicker -->\r\n");
      out.write("    <!-- é¡µé¢meta /-->\r\n");
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "aside.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <section class=\"content\">\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">Order Details</div>\r\n");
      out.write("                    <div class=\"row data-type\">\r\n");
      out.write("                        <div class=\"col-md-2 title\">Product Number</div>\r\n");
      out.write("                        <div class=\"col-md-4 data\">\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\"\r\n");
      out.write("                                   placeholder=\"Order Number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.orderNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("                                    readonly=\"readonly\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">Ordered Time</div>\r\n");
      out.write("                        <div class=\"col-md-4 data\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\"\r\n");
      out.write("                                   placeholder=\"Order Time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.orderTimeStr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("                                   readonly=\"readonly\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">Product Name</div>\r\n");
      out.write("                        <div class=\"col-md-4 data\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\"\r\n");
      out.write("                                   placeholder=\"Product Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.product.productName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("                                   readonly=\"readonly\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">Departure City</div>\r\n");
      out.write("                        <div class=\"col-md-4 data\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\"\r\n");
      out.write("                                   placeholder=\"Departure City\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.product.cityName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-2 title\">Departure Time</div>\r\n");
      out.write("                        <div class=\"col-md-4 data\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\"\r\n");
      out.write("                                   placeholder=\"Departure Time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.product.departureTimeStr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-2 title\">Price</div>\r\n");
      out.write("                        <div class=\"col-md-4 data\">\r\n");
      out.write("                            <input type=\"number\" class=\"form-control\"\r\n");
      out.write("                                   placeholder=\"productPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.product.productPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title\">Guests</div>\r\n");
      out.write("                        <div class=\"col-md-4 data\">\r\n");
      out.write("                            <input type=\"number\" class=\"form-control\"\r\n");
      out.write("                                   placeholder=\"guests\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.peopleCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 title rowHeight2x\">Order Description</div>\r\n");
      out.write("                        <div class=\"col-md-4 data rowHeight2x\">\r\n");
      out.write("                        <textarea class=\"form-control\" rows=\"3\" placeholder=\"description\" readonly=\"readonly\">\r\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.orderDesc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                        </textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">Guests Information</div>\r\n");
      out.write("                    <table id=\"dataList\" class=\"table table-bordered table-striped table-hover dataTable\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th class=\"\">Guest Type</th>\r\n");
      out.write("                                <th class=\"\">Name</th>\r\n");
      out.write("                                <th class=\"\">Sex</th>\r\n");
      out.write("                                <th class=\"\">Phone Number</th>\r\n");
      out.write("                                <th class=\"\">Id type</th>\r\n");
      out.write("                                <th class=\"\">Id number</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
      out.write("    $(document).ready(function() {\r\n");
      out.write("        // éæ©æ¡\r\n");
      out.write("        $(\".select2\").select2();\r\n");
      out.write("\r\n");
      out.write("        // WYSIHTML5ç¼è¾å¨\r\n");
      out.write("        $(\".textarea\").wysihtml5({\r\n");
      out.write("            locale: 'zh-CN'\r\n");
      out.write("        });\r\n");
      out.write("        $('#dateTimePicker').datetimepicker({\r\n");
      out.write("            format: \"yyyy-mm-dd HH:mm\",\r\n");
      out.write("            autoclose: true,\r\n");
      out.write("            todayBtn: true,\r\n");
      out.write("            language: 'en-US'\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // è®¾ç½®æ¿æ´»èå\r\n");
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
      out.write("        // æ¿æ´»å¯¼èªä½ç½®\r\n");
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
    // /pages/orders-show.jsp(205,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("traveller");
    // /pages/orders-show.jsp(205,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/orders-show.jsp(205,28) '${orders.travellers}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orders.travellers}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${traveller.travellerTypeStr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${traveller.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${traveller.sex}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${traveller.phoneNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${traveller.credentialsTypeStr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                       ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${traveller.credentialsNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /pages/orders-show.jsp(229,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.orderStatus==1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <div class=\"panel panel-default\">\r\n");
        out.write("                        <div class=\"panel-heading\">Payment Information</div>\r\n");
        out.write("                        <table id=\"dataList2\" class=\"table table-bordered table-striped table-hover dataTable\">\r\n");
        out.write("                            <thead>\r\n");
        out.write("                            <tr>\r\n");
        out.write("                                <th class=\"\">Payment Type</th>\r\n");
        out.write("                                <th class=\"\">Price</th>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                            </thead>\r\n");
        out.write("                            <tbody>\r\n");
        out.write("\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.payTypeStr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orders.product.productPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                            </tbody>\r\n");
        out.write("                        </table>\r\n");
        out.write("                    </div>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
