package dazuoye.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import dazuoye.po.RouteDetails;
import dazuoye.service.DetailService;
import dazuoye.service.RouteService;
import dazuoye.service.impl.DetailServiceImpl;
import dazuoye.service.impl.RouteServiceImpl;

@WebServlet("/route")
public class DetailServlet extends HttpServlet{
	DetailService ds=new DetailServiceImpl(); 
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//�Ȼ�ȡ·�ߵ�id
		Integer rid = Integer.parseInt(req.getParameter("rid"));
		
		//����id��ѯ����������
		DetailService ds = new DetailServiceImpl();
		RouteDetails details = null;
		try {
			details = ds.getRouteDetails(rid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ֽ�����ת��ΪJSON
		String result = JSONObject.toJSONString(details);
		
		//���÷��ؽ���ı���
		resp.setCharacterEncoding("UTF-8");
		//�����ݽ��з���
		PrintWriter printWriter = resp.getWriter();
		printWriter.write(result);
		printWriter.close();
		
		
		
		
	}
	
}
