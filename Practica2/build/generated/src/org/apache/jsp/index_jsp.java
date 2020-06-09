package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Practica N° 2</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>PRACTICA N° 2</h1>\n");
      out.write("        <h1>SERVLETS</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Carrera:</th>\n");
      out.write("                <td>Ingenieria de Sistemas</td>\n");
      out.write("                <td rowspan=\"5\"><h1>H</h1></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Materia:</th>\n");
      out.write("                <td>Tecnologías Emergentes II</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Apellidos y nombres:</th>\n");
      out.write("                <td>Huanacuni Pari Alex</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>C.I:</th>\n");
      out.write("                <td>8315784 L.P.</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Lugar y Fecha:</th>\n");
      out.write("                <td>El Alto, 20 de Agosto del 2019</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </center>\n");
      out.write("        <ol>\n");
      out.write("            <li><a href=\"ejercicio1\">Ejercicio N° 1</a></li>\n");
      out.write("            <li><a href=\"ejercicio2\">Ejercicio N° 2</a></li>\n");
      out.write("            <li><a href=\"ejercicio3\">Ejercicio N° 3</a></li>\n");
      out.write("            <li><a href=\"ejercicio4\">Ejercicio N° 4</a></li>\n");
      out.write("            <li><a href=\"ejercicio5\">Ejercicio N° 5</a></li>\n");
      out.write("        </ol>\n");
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
