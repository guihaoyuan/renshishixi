package dazuoye.po;

import java.util.List;

public class PageResult {
	//这是第几页
	private Integer pageNum;
	//一页有多少条数据
	private Integer pageCount;
	//总共有多少条数据
	private Long totalCounts;
	//总共有多少页
	private Long totalPage;
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
	public Long getTotalCounts() {
		return totalCounts;
	}
	public void setTotalCounts(Long totalCounts) {
		this.totalCounts = totalCounts;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
}
