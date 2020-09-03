package dazuoye.dao;

import java.util.List;

import dazuoye.po.RouteImg;

public interface RouteImgDao {
	public List<RouteImg> getRouteImgsByRid(Integer rid) throws Exception;

}
