<%@page import="kr.or.ddit.freeboard.service.FreeboardServiceImpl"%>
<%@page import="kr.or.ddit.utiles.FileUploadRequestWrapper"%>
<%@page import="kr.or.ddit.freeboard.service.IFreeboardService"%>
<%@page import="org.apache.commons.beanutils.BeanUtils"%>
<%@page import="kr.or.ddit.vo.FreeboardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   /* request.setCharacterEncoding("UTF-8"); */
   System.out.println("dd");
   FreeboardVO freeboardInfo = new FreeboardVO();
   
   BeanUtils.populate(freeboardInfo, request.getParameterMap());
   
   IFreeboardService service = FreeboardServiceImpl.getInstance();
   service.insertFreeboardReply(freeboardInfo);
   
   response.sendRedirect(request.getContextPath() + "/13/main.jsp");
%>