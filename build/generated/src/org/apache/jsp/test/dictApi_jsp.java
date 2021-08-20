package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dictApi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"../assets/js/jquery.min.js\"></script>\n");
      out.write("       </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\"  style=\"font-size:20px;font-family:corbel\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class =\"col col-md-12\">\n");
      out.write("                    Enter word : <input type=\"text\" name=\"word\" id=\"word\"/>\n");
      out.write("                    <select id=\"language\">\n");
      out.write("                        <option value=\"en_US\">English (US) </option>\n");
      out.write("                        <option value=\"hi\">Hindi</option>\n");
      out.write("                        <option value=\"fr\">French</option>\n");
      out.write("                    </select>\n");
      out.write("                    <input type=\"button\" id=\"b1\" value=\"Show Meanings\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr/>\n");
      out.write("            <div class=\"row\" id=\"meaning\">\n");
      out.write("                <div id=\"d1\" style=\"display: none\">\n");
      out.write("                    <img src =\"loading.gif\"/>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"result\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $(document).ajaxStart(function () {\n");
      out.write("                    $(\"#d1\").css(\"display\",\"block\");\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(document).ajaxComplete(function () {\n");
      out.write("                    $(\"#d1\").css(\"display\",\"none\");\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                $(\"#b1\").click(function(){\n");
      out.write("                    alert($(\"#language\").val());\n");
      out.write("                    $.get(\"https://api.dictionaryapi.dev/api/v2/entries/\"+$(\"#language\").val()+\"/\"+$(\"#word\").val(),function(result,status){\n");
      out.write("                    //alert(result);               \n");
      out.write("                    //$(\"#result\").text(JSON.stringify(result)); \n");
      out.write("                    $(\"#result\").html(\"\");\n");
      out.write("                    for (x in result){\n");
      out.write("                        data = result[x];\n");
      out.write("                        $(\"#result\").css({\"border-width\":\"2px\",\"border-style\":\"solid\",\"border-radius\":\"5px\"});\n");
      out.write("                        $(\"#result\").append(\"<br/><b>\"+ data.word +\"<br/>\");\n");
      out.write("                        $(\"#result\").append(\"<br/><b>phonetics : \"+ data.phonetics[0].text +\"<br/>\");\n");
      out.write("                        $(\"#result\").append(\"<br/><b>Audio :<audio controls><source src='\"+ data.phonetics[0].audio+\"' type='audio/mp3'></audio><br/>\");\n");
      out.write("                        for(y in data.meanings){\n");
      out.write("                            $(\"#result\").append(data.meanings[y].partOfSpeech);\n");
      out.write("                            $(\"#result\").append(\":\"+data.meanings[y].definitions[0].definition +\"<br/>\");\n");
      out.write("                            $(\"#result\").append(\"Example :\"+data.meanings[y].definitions[0].example +\"<br/>\")    \n");
      out.write("            }\n");
      out.write("                    }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
