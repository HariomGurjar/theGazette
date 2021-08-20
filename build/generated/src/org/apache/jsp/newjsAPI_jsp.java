package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsAPI_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"TemplateMo\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>About Us</title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-stand-blog.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("TemplateMo 551 Stand Blog\n");
      out.write("\n");
      out.write("https://templatemo.com/tm-551-stand-blog\n");
      out.write("\n");
      out.write("-->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <!-- ***** Preloader Start ***** -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"jumper\">\n");
      out.write("            <div></div>\n");
      out.write("            <div></div>\n");
      out.write("            <div></div>\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("    <!-- include header.jsp -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("  \n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <!-- Banner Starts Here -->\n");
      out.write("    <div class=\"main-banner header-text\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"owl-banner owl-carousel\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Banner Ends Here -->\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"blog-posts\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\" >\n");
      out.write("          <div class=\"col-lg-8\" id=\"news\">\n");
      out.write("           <div class =\"col col-md-12 \">                  \n");
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
      out.write("              </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-8\" id=\"nws\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write(" \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Additional Scripts -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl.js\"></script>\n");
      out.write("    <script src=\"assets/js/slick.js\"></script>\n");
      out.write("    <script src=\"assets/js/isotope.js\"></script>\n");
      out.write("    <script src=\"assets/js/accordions.js\"></script>\n");
      out.write("\n");
      out.write("    <script language = \"text/Javascript\"> \n");
      out.write("      cleared[0] = cleared[1] = cleared[2] = 0; //set a cleared flag for each field\n");
      out.write("      function clearField(t){                   //declaring the array outside of the\n");
      out.write("      if(! cleared[t.id]){                      // function makes it static and global\n");
      out.write("          cleared[t.id] = 1;  // you could use true and false, but that's more typing\n");
      out.write("          t.value='';         // with more chance of typos\n");
      out.write("          t.style.color='#fff';\n");
      out.write("          }\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write(" <script>\n");
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
      out.write("  </body>\n");
      out.write("</html>");
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
