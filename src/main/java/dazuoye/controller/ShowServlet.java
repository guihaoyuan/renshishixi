package dazuoye.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import dazuoye.po.PageResult;
import dazuoye.service.RouteService;
import dazuoye.service.impl.RouteServiceImpl;

@WebServlet("/show")
public class ShowServlet extends HttpServlet{
	private RouteService rs=new RouteServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�Ȼ�ȡ�ύ��ҳ���һҳ������
		String pn =req.getParameter("pageNum");
		String pc = req.getParameter("pageCount");
		String pl=req.getParameter("pricelow");
		String ph=req.getParameter("pricehigh");
		//����Ĭ�ϵ�ҳ��͵�ǰһҳ����������
		Integer pageNum = 1;
		Integer pageCount =	10;
		Integer priceLow=0;
		Integer priceHigh=Integer.MAX_VALUE;
		//����ύ��ҳ������һҳ������ ������޸�
		if(pn!=null&&!pn.equals("")&&pc!=null&&!pc.equals("")) {
			pageNum = Integer.parseInt(pn);
			pageCount = Integer.parseInt(pc);
		}
		if(pl!=null) {
			priceLow=Integer.parseInt(pl);
		}
		if(ph!=null) {
			priceHigh=Integer.parseInt(ph);
		}
		String cid = req.getParameter("cid");
		PageResult routes = null;
		//����ҵ��㴦���ؽ����
		RouteService rs = new RouteServiceImpl();
		//��ѯ����ǰҳ����Ҫ��������Ϣ
		try {
			routes = rs.getRoutePage(pageNum, pageCount, priceLow, priceHigh, cid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			
			//������ת����JSON��ʽ���ݣ�������
			String result = JSONObject.toJSONString(routes);
			//������������
			System.out.println(result);
			//���÷��ؽ���ı���ΪUTF-8���ó�����������
			resp.setCharacterEncoding("UTF-8");
			PrintWriter writer = resp.getWriter();
			writer.write(result);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
