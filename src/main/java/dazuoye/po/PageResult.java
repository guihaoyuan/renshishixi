package dazuoye.po;

import java.util.List;

public class PageResult {
	//这是第几页
	private Integer pageNum;
	//一页有多少条数据
	private Integer pageCount;
	//总共有多少条数据
	private Integer totalCounts;
	//总共有多少页
	private Integer totalPage;
	//当前这一页有哪些数据
	private List<?> data;
	
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getTotalCounts() {
		return totalCounts;
	}
	public void setTotalCounts(Integer totalCounts) {
		this.totalCounts = totalCounts;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
}
