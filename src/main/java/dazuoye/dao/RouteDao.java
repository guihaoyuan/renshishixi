package dazuoye.dao;

import java.util.List;

import dazuoye.po.Route;

public interface RouteDao {
	//��ҳ��ʾ·��
		public Route getRouteById(Integer rid)throws Exception;
		public List<Route> getRouteByPage
		(Integer sm, Integer sn, Integer pm, Integer pn, 
				String cid)
				throws Exception;
		public Long getTotalCount(Integer pm, Integer pn, 
				String cid)throws Exception;
}
