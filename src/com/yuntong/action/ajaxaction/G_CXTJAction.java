/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action.ajaxaction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuntong.service.G_IRegisterInfoService;

/** 
 * MyEclipse Struts
 * Creation date: 04-15-2007
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class G_CXTJAction extends Action {
	private G_IRegisterInfoService registerInfoService;
	
	/*
	 * Generated Methods
	 */

	public G_IRegisterInfoService getRegisterInfoService() {
		return registerInfoService;
	}

	public void setRegisterInfoService(G_IRegisterInfoService registerInfoService) {
		this.registerInfoService = registerInfoService;
	}

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 * @throws IOException 
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/xml; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String year=request.getParameter("year");
		int[] monthCnt=registerInfoService.getTotalRegisterByYear(year);
		out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.print("<info>");
		out.print("<cntLength value='"+monthCnt.length+"'>");
		out.print(monthCnt.length);
		out.print("</cntLength>");
		for (int i = 0; i < monthCnt.length; i++) {
			out.print("<monthCnt"+i+" value='"+monthCnt[i]+"'>");
			out.print(monthCnt[i]);
			out.print("</monthCnt"+i+">");
		}
		out.print("</info>");
		out.close();
		return null;
	}
}