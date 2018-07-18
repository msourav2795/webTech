package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InsertEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./images/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <title>Insert Employee</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"./css/signin.css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body class=\"text-center\">\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("    <form class=\"form-signin\" action=\"Login\" method=\"post\">\r\n");
      out.write("      <img class=\"mb-4\" src=\"./images/bootstrap-solid.svg\" alt=\"\" width=\"72\" height=\"72\">\r\n");
      out.write("      <h1 class=\"h3 mb-3 font-weight-normal\">Employee Form</h1>\r\n");
      out.write("      <br>\r\n");
      out.write("      <h2>");
      out.print(request.getAttribute("message") );
      out.write("</h2>\r\n");
      out.write("\r\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">First Name</label>\r\n");
      out.write("      <input name=\"firstName\" type=\"text\" id=\"firstName\" class=\"form-control\" placeholder=\"Enter First Name\" required autofocus>\r\n");
      out.write("      \r\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Middle Name</label>\r\n");
      out.write("      <input name=\"middleName\" type=\"text\" id=\"middleName\" class=\"form-control\" placeholder=\"Enter Middle Name\" required autofocus>\r\n");
      out.write("      \r\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Last Name</label>\r\n");
      out.write("      <input name=\"lastName\" type=\"text\" id=\"lastName\" class=\"form-control\" placeholder=\"Enter Last Name\" required autofocus>\r\n");
      out.write("      \r\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Designation</label>\r\n");
      out.write("      <input name=\"designation\" type=\"text\" id=\"designation\" class=\"form-control\" placeholder=\"Enter Designation\" required autofocus>\r\n");
      out.write("      \r\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Team</label>\r\n");
      out.write("      <input name=\"team\" type=\"text\" id=\"team\" class=\"form-control\" placeholder=\"Enter Team\" required autofocus>\r\n");
      out.write("      \r\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Contact</label>\r\n");
      out.write("      <input name=\"contact\" type=\"text\" id=\"contact\" class=\"form-control\" placeholder=\"Enter Contact\" required autofocus>\r\n");
      out.write("      \r\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Salary</label>\r\n");
      out.write("      <input name=\"salary\" type=\"text\" id=\"salary\" class=\"form-control\" placeholder=\"Enter Salary\" required autofocus>\r\n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\r\n");
      out.write("      <p class=\"mt-5 mb-3 text-muted\">&copy; 2017-2018</p>\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
