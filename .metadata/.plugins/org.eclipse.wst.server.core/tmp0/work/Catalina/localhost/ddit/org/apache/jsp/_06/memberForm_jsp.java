/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2020-06-10 06:56:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._06;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type='text/javascript' src='http://code.jquery.com/jquery-latest.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/ddit/js/common/validation.js'></script>\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("\t$('form').submit(function() {\r\n");
      out.write("\t\tvar mem_pass = $('input[name=mem_pass]').val();\r\n");
      out.write("\t\tif (!mem_pass.validationPWD()) {\r\n");
      out.write("\t\t\talert('비밀번호를 바르게 입력해주세요');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar mem_hometel = $('input[name=mem_hometel]').val();\r\n");
      out.write("\t\tif (!mem_hometel.validationHOMETEL()) {\r\n");
      out.write("\t\t\talert('집전화번호를 바르게 입력해주세요');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar mem_comtel = $('input[name=mem_comtel]').val();\r\n");
      out.write("\t\tif (!mem_comtel.validationCOMTEL()) {\r\n");
      out.write("\t\t\talert('회사전화번호를 바르게 입력해주세요');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar mem_hp = $('input[name=mem_hp]').val();\r\n");
      out.write("\t\tif (!mem_hp.validationHP()) {\r\n");
      out.write("\t\t\talert('휴대전화번호를 바르게 입력해주세요');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar mem_mail = $('input[name=mem_mail]').val();\r\n");
      out.write("\t\tif (!mem_mail.validationMAIL()) {\r\n");
      out.write("\t\t\talert('이메일을 바르게 입력해주세요');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form action='/ddit/06/insertMemberInfo.jsp' method='post'>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>아이디</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_id' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>패스워드</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_pass' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>성명</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_name' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>주민등록번호</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_regno1' /> <input type='text'\r\n");
      out.write("\t\t\t\t\tname='mem_regno2' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>생년월일</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_bir' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>우편번호</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_zip' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>주소</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_add1' />- <input type='text'\r\n");
      out.write("\t\t\t\t\tname='mem_add2' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>집전화번호</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_hometel' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>회사전화번호</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_comtel' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>휴대폰번호</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_hp'></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_mail' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>직업</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_job' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>취미</td>\r\n");
      out.write("\t\t\t\t<td><input type='text' name='mem_like' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan='2'>\r\n");
      out.write("\t\t\t\t<input type='submit' value='회원가입' /> \r\n");
      out.write("\t\t\t\t<input type='reset' value='취소' /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
