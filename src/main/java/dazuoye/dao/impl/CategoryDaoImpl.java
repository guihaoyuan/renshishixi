package dazuoye.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import dazuoye.dao.CategoryDao;
import dazuoye.po.Category;
import dazuoye.utils.DBCP2utils;

public class CategoryDaoImpl implements CategoryDao{
	private QueryRunner qr= new QueryRunner(DBCP2utils.getDataSource());
	@Override
	public Category getCategoryById(Integer cid) throws Exception {
		String sql = "select cid,cname from tab_category where cid = ?";
		return qr.query(sql, new BeanHandler<Category>(Category.class),cid);

	}
	

}
