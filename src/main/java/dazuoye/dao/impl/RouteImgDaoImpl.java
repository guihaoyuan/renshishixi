package dazuoye.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dazuoye.dao.RouteImgDao;
import dazuoye.po.RouteImg;
import dazuoye.utils.DBCP2utils;

public class RouteImgDaoImpl implements RouteImgDao{
	private QueryRunner qr = new QueryRunner(DBCP2utils.getDataSource());
	@Override
	public List<RouteImg> getRouteImgsByRid(Integer rid) throws Exception {
		return qr.query("select rgid,rid,bigPic,smallPic from tab_route_img where rid = ?",  
				new BeanListHandler<RouteImg>(RouteImg.class), rid);
	}

}
