package dazuoye.service;

import dazuoye.po.PageResult;

public interface RouteService {
	public PageResult getRoutePage(Integer pageNum,Integer pageCount,
			Integer priceLow,Integer priceHigh,String cid)throws Exception;
}
