package dazuoye.po;

public class Route {
	private Integer rid;
	private String rname;
	private double price;
	private String routeIntroduce;
	//我觉得rflag和sourceid还有rdate就不加了吧，我感觉没啥用
	private String isThemeTour;
	private Integer count;
	private Integer cid;
	private String rimage;
	private Integer sid;
	
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRouteIntroduce() {
		return routeIntroduce;
	}
	public void setRouteIntroduce(String routeIntroduce) {
		this.routeIntroduce = routeIntroduce;
	}
	public String getIsThemeTour() {
		return isThemeTour;
	}
	public void setIsThemeTour(String isThemeTour) {
		this.isThemeTour = isThemeTour;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getRimage() {
		return rimage;
	}
	public void setRimage(String rimage) {
		this.rimage = rimage;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
}
