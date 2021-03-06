/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action.ajaxaction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuntong.business.vo.Y_DHQRInfoVO;
import com.yuntong.service.Y_IRegisterManagerService;

/** 
 * MyEclipse Struts
 * Creation date: 04-14-2007
 * 损货登记查看详细功能
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class Y_CKXXAction extends Action {
	private Log log = LogFactory.getLog(Y_FindRegisterByIDAction.class);
	private Y_IRegisterManagerService registerManagerService;
	public Y_IRegisterManagerService getRegisterManagerService() {
		return registerManagerService;
	}
	public void setRegisterManagerService(
			Y_IRegisterManagerService registerManagerService) {
		this.registerManagerService = registerManagerService;
	}
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		log.info("开始查看详细=================================================================");
		response.setContentType("text/xml; charset=UTF-8");
		PrintWriter out = response.getWriter();
		//查询条件
		String inputID=request.getParameter("inputID");
		
		Y_DHQRInfoVO vo=new Y_DHQRInfoVO();
		//得到查询结果
		try{
		vo=registerManagerService.findRegisterInfoByInputID(inputID);
		HttpSession session=request.getSession();
		//得到数据库编号和状态编号并保存
//		int rid=vo.getRegisterID();
//		int sid=vo.getRegisterState();
//		session.setAttribute("Y_rid", rid);
//		session.setAttribute("Y_sid", sid);
		//打印查询结果
		out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.print("<info>");
		//制单时间
			out.print("<strdate>");
				out.print(vo.getStrDate()+"");
			out.print("</strdate>");
		//货票编号
			out.print("<registerID>");
				out.print(vo.getRegisterGlideID()+"");
			out.print("</registerID>");
		//运输线路
			out.print("<registerLine>");
				out.print(vo.getRegisterLine()+"");
			out.print("</registerLine>");
		//运输编号
			out.print("<registerConveyanceID>");
				out.print(vo.getRegisterConveyanceID()+"");
			out.print("</registerConveyanceID>");
		//收货单位
			out.print("<registerClientName>");
				out.print(vo.getRegisterClientName()+"");
			out.print("</registerClientName>");
		//收货单位电话
			out.print("<registerClientPhone>");
				out.print(vo.getRegisterClientPhone()+"");
			out.print("</registerClientPhone>");
		//厂商
			out.print("<registerFactoryName>");
				out.print(vo.getRegisterFactoryName()+"");
			out.print("</registerFactoryName>");
		//厂商电话
			out.print("<registerFactoryphone>");
				out.print(vo.getRegisterFactoryphone()+"");
			out.print("</registerFactoryphone>");
		//货物名称
			out.print("<goodsName>");
				out.print(vo.getGoodsName()+"");
			out.print("</goodsName>");
		//货物件数
			out.print("<goodsNumber>");
				out.print(vo.getGoodsNumber()+"");
			out.print("</goodsNumber>");
		//重量	
			out.print("<goodsHeft>");
				out.print(vo.getGoodsHeft()+"");
			out.print("</goodsHeft>");
		//方量
			out.print("<goodsBulk>");
				out.print(vo.getGoodsBulk()+"");
			out.print("</goodsBulk>");
		//付款方式
			out.print("<registerFreightName>");
				out.print(vo.getRegisterFreightName()+"");
			out.print("</registerFreightName>");
		//计价方式
			out.print("<goodsPaymentModeName>");
				out.print(vo.getGoodsPaymentModeName()+"");
			out.print("</goodsPaymentModeName>");
		//运费
			out.print("<goodsFreight>");
				out.print(vo.getGoodsFreight()+"");
			out.print("</goodsFreight>");
		//保价
			out.print("<goodsInsuranceValue>");
				out.print(vo.getGoodsInsuranceValue()+"");
			out.print("</goodsInsuranceValue>");
		//金额合计
			out.print("<goodsAllValue>");
				out.print(vo.getGoodsAllValue()+"");
			out.print("</goodsAllValue>");
		//备注
			out.print("<goodsRemarkInfo>");
				out.print(vo.getGoodsRemarkInfo()+"");
			out.print("</goodsRemarkInfo>");
		//车次编号	
			out.print("<roadwayID>");
				out.print(vo.getRoadwayID()+"");
			out.print("</roadwayID>");
		//司机
			out.print("<driverName>");
				out.print(vo.getDriverName()+"");
			out.print("</driverName>");
		//车牌号码
			out.print("<carName>");
				out.print(vo.getCarName()+"");
			out.print("</carName>");
		//发货日期
			out.print("<formatStartDate>");
				out.print(vo.getFormatStartDate()+"");
			out.print("</formatStartDate>");
//			错误信息
			out.print("<error>");
			out.print(1);
			out.print("</error>");
		out.print("</info>");
		
		}catch(Exception e){
			e.printStackTrace();
			out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			out.print("<info>");
			out.print("<error>");
			out.print("无此记录！！");
			out.print("</error>");
			out.print("</info>");
			log.info("查询失败");
		}
		return null;
	}
}