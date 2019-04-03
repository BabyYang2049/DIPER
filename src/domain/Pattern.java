package domain;

public class Pattern {
	
	String symbol;
	String prefix;
	String middle;
	String suffix;
	boolean order;
	int num;
	
	public Pattern(){}
	public Pattern(String symbol,String prefix,String middle,String suffix,boolean order,int num){
		this.symbol = symbol;
		this.prefix = prefix;
		this.middle = middle;
		this.suffix = suffix;
		this.order = order;
		this.num = num;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public boolean getOrder() {
		return order;
	}
	public void setOrder(boolean order) {
		this.order = order;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString(){
		return "("+"["+symbol+"]"+","+prefix+","+middle+","+suffix+","+order+","+num+")";
	}
	

}
