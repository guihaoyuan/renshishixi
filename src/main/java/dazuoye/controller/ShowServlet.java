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
		//先获取提交的页码和一页数据量
		String pn =req.getParameter("pageNum");
		String pc = req.getParameter("pageCount");
		String pl=req.getParameter("pricelow");
		String ph=req.getParameter("pricehigh");
		//设置默认的页码和当前一页多少条数据
		Integer pageNum = 1;
		Integer pageCount =	10;
		Integer priceLow=0;
		Integer priceHigh=Integer.MAX_VALUE;
		//如果提交了页码数和一页数据量 则进行修改
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
		//调用业务层处理返回结果集
		RouteService rs = new RouteServiceImpl();
		//查询出当前页中需要的所有信息
		try {
			routes = rs.getRoutePage(pageNum, pageCount, priceLow, priceHigh, cid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			
			//将对象转换成JSON格式数据，并返回
			String result = JSONObject.toJSONString(routes);
			//将结果进行输出
			System.out.println(result);
			//设置返回结果的编码为UTF-8放置出现中文乱码
			resp.setCharacterEncoding("UTF-8");
			PrintWriter writer = resp.getWriter();
			writer.write(result);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
