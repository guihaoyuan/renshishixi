package dazuoye.dao;

import dazuoye.po.Category;

public interface CategoryDao {
	public Category getCategoryById(Integer cid) throws Exception;
}
