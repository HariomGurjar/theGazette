package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"../assets/js/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"d1\" style=\"width:200px;height: 100px; background-color: black;color:white\">\n");
      out.write("            this is division \n");
      out.write("        </div>\n");
      out.write("        <button id=\"b1\">Yellow</button> \n");
      out.write("        <button id=\"b2\">Red-Yellow</button>\n");
      out.write("        <button id=\"b3\">Yellow-Red (using JS)</button>\n");
      out.write("        <script>\n");
      out.write("    $(\"#b1\").click(function(){\n");
      out.write("        $(\"#d1\").css(\"background-color\",\"yellow\");\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $(\"#b2\").click(function(){\n");
      out.write("        $(\"#d1\").css({\"background-color\":\"red\", \"color\":\"yellow\"});\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $(\"#b3\").click(function(){\n");
      out.write("        //js code\n");
      out.write("        document.getElementById(\"d1\").style.backgroundColor=\"yellow\";\n");
      out.write("        document.getElementById(\"d1\").style.color=\"red\";\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
