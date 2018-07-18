package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"./images/favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Registration</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"./css/floating-labels.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("    <form class=\"form-signin\"  action=\"UserLogin\" method=\"post\">\n");
      out.write("      <div class=\"text-center mb-4\">\n");
      out.write("        \n");
      out.write("        <h1 class=\"h3 mb-3 font-weight-normal\">Registration</h1>\n");
      out.write("        <br>\n");
      out.write("        <h2>");
      out.print(request.getAttribute("message") );
      out.write("</h2>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-label-group\">\n");
      out.write("        <input name=\"email\" type=\"email\" id=\"email\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\n");
      out.write("        <label for=\"email\">Email address</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-label-group\">\n");
      out.write("        <input name=\"password\" type=\"password\" id=\"password\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("        <label for=\"password\">Password</label>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-label-group\">\n");
      out.write("        <input name=\"username\" type=\"username\" id=\"username\" class=\"form-control\" placeholder=\"username\" required>\n");
      out.write("        <label for=\"username\">Username</label>      \n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-label-group\">\n");
      out.write("        <input name=\"contact\" type=\"contact\" id=\"contact\" class=\"form-control\" placeholder=\"contact\" required>\n");
      out.write("        <label for=\"contact\">Contact</label>\n");
      out.write("      </div>\n");
      out.write("        <br>\n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Create User</button>\n");
      out.write("      <p class=\"mt-5 mb-3 text-muted text-center\">&copy; 2017-2018</p>\n");
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
