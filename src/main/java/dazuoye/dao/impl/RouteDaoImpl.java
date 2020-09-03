package dazuoye.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import dazuoye.utils.DBCP2utils;

import dazuoye.dao.RouteDao;
import dazuoye.po.Route;

public class RouteDaoImpl implements RouteDao{
	QueryRunner qr=new QueryRunner(DBCP2utils.getDataSource());
	@Override
	public List<Route> getRouteByPage(Integer sm, Integer sn, Integer pm, Integer pn,  String cid)
			throws Exception {
		String sql="";
		List<Route> route=null;
		if(cid=="no") {
		sql="select rid,rname,price,routeIntroduce,isThemeTour,count,cid,rimage,sid from tab_route where price > ? and price < ? limit ? , ? ";
		route=qr.query(sql,new BeanListHandler<Route>(Route.class),pm,pn,sm,sn);
		}
		else {
		sql="select rid,rname,price,routeIntroduce,isThemeTour,count,cid,rimage,sid from tab_route where price > ? and price < ? and ( cid = ? ) limit ? , ? ";
		route=qr.query(sql,new BeanListHandler<Route>(Route.class),pm,pn,cid,sm,sn);
		}
		
		return route;
	}

	@Override
	public Long getTotalCount(Integer pm, Integer pn, String cid) throws Exception {
		String sql="";
		if(cid=="no") {
		sql="select count(*) from tab_route where price > ? and price < ?";
		return qr.query(sql, new ScalarHandler<Long>(1),pm,pn);
		}
		else {
		sql="select count(*) from tab_route where price > ? and price < ? and ( cid = ? ) ";
		return qr.query(sql, new ScalarHandler<Long>(1),pm,pn,cid);
		}
	}

	@Override
	public Route getRouteById(Integer rid) throws Exception {
		return qr.query("select rid,rname,price,routeIntroduce,isThemeTour,count,cid,rimage,sid from tab_route where rid = ?", 
				new BeanHandler<Route>(Route.class), rid);
	}

}
