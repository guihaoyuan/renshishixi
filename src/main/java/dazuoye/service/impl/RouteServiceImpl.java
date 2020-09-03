package dazuoye.service.impl;

import java.util.List;

import dazuoye.po.Route;
import dazuoye.dao.RouteDao;
import dazuoye.dao.impl.RouteDaoImpl;
import dazuoye.po.PageResult;
import dazuoye.service.RouteService;

public class RouteServiceImpl implements RouteService{
	RouteDao rd=new RouteDaoImpl();
	@Override
	public PageResult getRoutePage(Integer pageNum, Integer pageCount, Integer priceLow, Integer priceHigh, String cid)
			throws Exception {
		PageResult pr=new PageResult();
		if(priceLow==null)priceLow=0;
		if(priceHigh==null)priceHigh=Integer.MAX_VALUE;
		if(!cid.equals("1")&&!cid.equals("2")&&!cid.equals("3")&&!cid.equals("4")&&
				!cid.equals("5")&&!cid.equals("6")&&!cid.equals("7")&&!cid.equals("8")) {
			cid="no";
		}
		pr.setData(rd.getRouteByPage((pageNum-1)*pageCount, pageCount, priceLow, priceHigh, cid));
		pr.setPageNum(pageNum);
		pr.setPageCount(pageCount);
		Long tmp=rd.getTotalCount(priceLow, priceHigh, cid);
		pr.setTotalCounts(tmp);
		pr.setTotalPage(tmp%pageCount==0?tmp/pageCount:tmp/pageCount+1);
		return pr;
	}

}
