package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newsapi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>NITW Blog News API</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-stand-blog.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../assets/js/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\">               \n");
      out.write("                <div class =\"col col-md-12 \">                  \n");
      out.write("                   ");
 
                       String key=request.getParameter("q"); 
                     System.out.println("key is ="+key);
                     String val=key;
                   
      out.write("<br/><br/><br/>\n");
      out.write("                   Enter Keyword : <input type=\"textarea\" name=\"keyword\" id=\"keyword\" value='");
      out.print(val);
      out.write("'/>\n");
      out.write("                   <input type=\"button\" id=\"b1\" value=\"Search/Load News\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr/>\n");
      out.write("            <div class=\"row\" id=\"news\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $(\"#b1\").click(function () {\n");
      out.write("              //  https://newsapi.org/v2/everything?q=\" + $(\"#keyword\").val() + \"&from=2021-06-27&sortBy=publishedAt&apiKey=381e4be231734341bf0a7333872d1ce8\n");
      out.write("              //  $.get(\"https://newsapi.org/v2/everything?q=\" + $(\"#keyword\").val() + \"&from=2021-08-11&sortBy=publishedAt&apiKey=21f6b04f7efe489485c54aeef72cb961\",  \n");
      out.write("                $.get(\"https://newsapi.org/v2/everything?q=\" + $(\"#keyword\").val() + \"&from=2021-07s-27&sortBy=publishedAt&apiKey=381e4be231734341bf0a7333872d1ce8\",\n");
      out.write("                        function (result, status) {\n");
      out.write("                            //var news = JSON.parse(result);\n");
      out.write("                            var articles = result.articles;\n");
      out.write("                            $(\"#news\").html(\"\");\n");
      out.write("                            for (x in articles) {\n");
      out.write("                                var article = articles[x];\n");
      out.write("                                var s = '<div class=\"card col col-md-3 col-sm-12 col-lg-3\" style=\"border-width:2px;border-radius: 5px;border-style:solid;margin:5px;\">\\\n");
      out.write("                    <img class=\"card-img-top\" src=\"'+article.urlToImage+'\" alt=\"Card image\" style=\"width:100%\">\\\n");
      out.write("                    <div class=\"card-body\">\\\n");
      out.write("                        <h4 class=\"card-title\">'+ article.title+'</h4>\\\n");
      out.write("                        <p class=\"card-text\">'+ article.description+'</p>\\\n");
      out.write("                        <a href=\"'+article.url+'\" class=\"btn btn-primary stretched-link\">Show News</a>\\\n");
      out.write("                    </div></div>';\n");
      out.write("            \n");
      out.write("                                $(\"#news\").append(s);\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
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
