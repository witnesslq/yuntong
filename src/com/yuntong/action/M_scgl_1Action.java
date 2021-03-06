/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action;
import java.util.ArrayList;
import java.util.List;


import com.yuntong.service.M_TAgionInfoManagerService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.yuntong.hibernate.database.po.TAgioInfo;	
import com.yuntong.hibernate.database.po.TAgioType;
import com.yuntong.hibernate.database.po.TRegisterInfo;
/** 
 * MyEclipse Struts
 * Creation date: 04-04-2007
 * 
 * XDoclet definition:
 * @struts.action
 * @struts.action-forward name="ok" path="/ok.jsp"
 */
public class M_scgl_1Action extends Action {
	private static final int PAGE_SiZE=4;
	
	private M_TAgionInfoManagerService M_service;
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		
		//分页代码
//		得到所有的少收信息
		List list= (List) request.getSession().getAttribute("agionInfoList");
		if(list==null){
			list=M_service.getAllInfo();
		}
		
		int totalpage=(list.size()-1)/PAGE_SiZE+1;
		//currentPage设置当前
		int currentPage=1; 
		try
		{
		 currentPage=Integer.parseInt(request.getParameter("currentPage"));
		}catch(NumberFormatException ex)
		{	
		  ex.printStackTrace();
		}
		if(currentPage<1)
		{
			currentPage=1;
		}
		if(currentPage>=totalpage)
		{
			currentPage=totalpage;
		}
		//保存分页信息
		request.setAttribute("currentPage",currentPage+"");
		request.setAttribute("totalpage", totalpage+"");
		request.setAttribute("PageSixze", PAGE_SiZE+"");
		request.setAttribute("offset", ((currentPage-1)*PAGE_SiZE)+""); //offset为本页第一条记录在集合中的位置
		
		
		
		//得到所有  类型  的编号；
		List typeid=M_service.gettypeId();
//		for (int i = 0; i < typeid.size(); i++) {
//			TAgioType type=(TAgioType) typeid.get(i);
//			 M_TAgionInfoVO vo=new M_TAgionInfoVO(type.getAtypeId());
//			 vo.setAtypeId(type.getAtypeId());//编号
//			 typeid.add(vo);
//		}
		
	
		//得到所有  货票  的编号
		List registerid=M_service.getRegisterId();
//		for (int i = 0; i < registerid.size(); i++) {
//			TRegisterInfo treg= (TRegisterInfo) registerid.get(i);
//			 M_TAgionInfoVO vo=new M_TAgionInfoVO();
//			 vo.setAgioGoodsID(treg.getRegisterId());//编号
//			 registerid.add(vo);
//			 
//		}
	

		//放入session;
		request.getSession().setAttribute("typeid",typeid);
		request.getSession().setAttribute("registerid",registerid);
		request.getSession().setAttribute("agionInfoList",list);
		
		
	
		return mapping.findForward("ok");
	}

	public M_TAgionInfoManagerService getM_service() {
		return M_service;
	}

	public void setM_service(M_TAgionInfoManagerService m_service) {
		M_service = m_service;
	}
}