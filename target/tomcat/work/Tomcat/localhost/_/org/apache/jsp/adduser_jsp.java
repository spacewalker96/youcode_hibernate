/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-03-03 15:30:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.youcode.youcodePlatforme.DAO.UserDAO;
import com.youcode.youcodePlatforme.DAOImpl.UserDAOImlp;

public final class adduser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\t<title>Result Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("<form action=\"/ServletCrud\">\n");
      out.write("\t<div class=\"mb-3\">\n");
      out.write("\t\t<label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\n");
      out.write("\t\t<input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"mb-3\">\n");
      out.write("\t\t<label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("\t\t<input type=\"password\" name=\"password\" class=\"form-control\" >\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"mb-3\">\n");
      out.write("\t\t<label for=\"exampleInputPassword1\" class=\"form-label\">Nom</label>\n");
      out.write("\t\t<input type=\"password\" name=\"nom\" class=\"form-control\" >\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"mb-3\">\n");
      out.write("\t\t<label for=\"exampleInputPassword1\" class=\"form-label\">Prenom</label>\n");
      out.write("\t\t<input type=\"password\" name=\"prenom\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("\t</div>\n");
      out.write("\t<div>\n");
      out.write("\t<label class=\"container\">Java JEE\n");
      out.write("\t\t<input type=\"radio\" name=\"speciality\" value=\"9\">\n");
      out.write("\n");
      out.write("\t</label>\n");
      out.write("\t<label class=\"container\">C#\n");
      out.write("\t\t<input type=\"radio\" name=\"speciality\" value=\"12\">\n");
      out.write("\n");
      out.write("\t</label>\n");
      out.write("\t<label class=\"container\">Full Stack\n");
      out.write("\t\t<input type=\"radio\" name=\"speciality\" value=\"13\">\n");
      out.write("\t</label>\n");
      out.write("\t");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div>\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t<label class=\"container\">Student\n");
      out.write("\t\t\t<input type=\"radio\" name=\"role\" value=\"3\">\n");
      out.write("\n");
      out.write("\t\t</label>\n");
      out.write("\t\t<label class=\"container\">Formateur\n");
      out.write("\t\t\t<input type=\"radio\" name=\"role\" value=\"4\">\n");
      out.write("\t\t</label>\n");
      out.write("\t</div>\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\t</div>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
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
}