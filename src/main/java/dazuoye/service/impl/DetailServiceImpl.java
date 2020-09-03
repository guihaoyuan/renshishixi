package dazuoye.service.impl;

import java.util.List;

import dazuoye.dao.CategoryDao;
import dazuoye.dao.RouteDao;
import dazuoye.dao.RouteImgDao;
import dazuoye.dao.impl.CategoryDaoImpl;
import dazuoye.dao.impl.RouteDaoImpl;
import dazuoye.dao.impl.RouteImgDaoImpl;
import dazuoye.po.Category;
import dazuoye.po.Route;
import dazuoye.po.RouteDetails;
import dazuoye.po.RouteImg;
import dazuoye.service.DetailService;

public class DetailServiceImpl implements DetailService{

	private RouteDao rd = new RouteDaoImpl();
	private RouteImgDao ridm = new RouteImgDaoImpl();
	@Override
	public RouteDetails getRouteDetails(Integer rid) throws Exception {
		Route r = rd.getRouteById(rid);
		//����id��ȡ¼���ӦͼƬ
		List<RouteImg> ri = ridm.getRouteImgsByRid(rid);
		//��ȡ������Ϣ
		CategoryDao cd = new CategoryDaoImpl();
		Category c = cd.getCategoryById(r.getCid());
		//��������������
		RouteDetails rde = new RouteDetails();
		rde.setR(r);
		rde.setRi(ri);
		rde.setC(c);
		//����
		System.out.println(r);
		System.out.println(ri);
		System.out.println(c);
		return rde;
	}

}
