package dazuoye.po;

import java.util.List;

public class RouteDetails {
	private Route r;
	private List<RouteImg> ri;
	private Category c;
	

	public Category getC() {
		return c;
	}
	public void setC(Category c) {
		this.c = c;
	}

	public Route getR() {
		return r;
	}
	public void setR(Route r) {
		this.r = r;
	}
	public List<RouteImg> getRi() {
		return ri;
	}
	public void setRi(List<RouteImg> ri) {
		this.ri = ri;
	}
}
