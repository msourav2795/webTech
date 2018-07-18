package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"./images/favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Edit Employee</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"./css/signin.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"text-center\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("    <form class=\"form-signin\" action=\"SaveEmployee\" method=\"post\">\n");
      out.write("      <img class=\"mb-4\" src=\"./images/bootstrap-solid.svg\" alt=\"\" width=\"72\" height=\"72\">\n");
      out.write("      <h1 class=\"h3 mb-3 font-weight-normal\">Edit Employee Form</h1>\n");
      out.write("      <br>\n");
      out.write("      <h2>");
      out.print(request.getAttribute("message") );
      out.write("</h2>\n");
      out.write("\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">First Name</label>\n");
      out.write("      <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"firstName\" type=\"text\" id=\"firstName\" class=\"form-control\" placeholder=\"Enter First Name\" required autofocus>\n");
      out.write("      \n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Last Name</label>\n");
      out.write("      <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"lastName\" type=\"text\" id=\"lastName\" class=\"form-control\" placeholder=\"Enter Last Name\" required autofocus>\n");
      out.write("      \n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Designation</label>\n");
      out.write("      <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee.designation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"designation\" type=\"text\" id=\"designation\" class=\"form-control\" placeholder=\"Enter Designation\" required autofocus>\n");
      out.write("      \n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Team</label>\n");
      out.write("      <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee.team}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"team\" type=\"text\" id=\"team\" class=\"form-control\" placeholder=\"Enter Team\" required autofocus>\n");
      out.write("      \n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Contact</label>\n");
      out.write("      <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"contact\" type=\"text\" id=\"contact\" class=\"form-control\" placeholder=\"Enter Contact\" required autofocus>\n");
      out.write("      \n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Salary</label>\n");
      out.write("      <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee.salary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"salary\" type=\"text\" id=\"salary\" class=\"form-control\" placeholder=\"Enter Salary\" required autofocus>\n");
      out.write("      \n");
      out.write("      <input type=\"hidden\" name=\"employeeId\" id=\"employeeId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee.employeeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("      \n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Save</button>\n");
      out.write("      <p class=\"mt-5 mb-3 text-muted\">&copy; 2017-2018</p>\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
