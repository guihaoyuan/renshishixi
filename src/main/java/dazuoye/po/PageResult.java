package dazuoye.po;

import java.util.List;

public class PageResult {
	//���ǵڼ�ҳ
	private Integer pageNum;
	//һҳ�ж���������
	private Integer pageCount;
	//�ܹ��ж���������
	private Long totalCounts;
	//�ܹ��ж���ҳ
	private Long totalPage;
	//��ǰ��һҳ����Щ����
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
