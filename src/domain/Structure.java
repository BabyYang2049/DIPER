package domain;

public class Structure {
	
	String seedf;
	String seedl;
	String symbol;
	String inprefix;  //seedf之前出现的语料
	String inmiddle;	//seedf和seedl之间出现的语料
	String insuffix;	//seedl之后出现的语料
	boolean inorder;	//是否在这个句子中找到种子
	int innum;		//标记这个句子中有几个种子
	
	
	public Structure(){}
	public Structure(String seedf,String seedl,String symbol,String inprefix,String inmiddle,String insuffix,boolean inorder,int innum){
		this.seedf = seedf;
		this.seedl = seedl;
		this.symbol = symbol;
		this.inprefix = inprefix;
		this.inmiddle = inmiddle;
		this.insuffix = insuffix;
		this.inorder = inorder;
		this.innum = innum;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSeedf() {
		return seedf;
	}
	public void setSeedf(String seedf) {
		this.seedf = seedf;
	}
	public String getSeedl() {
		return seedl;
	}
	public void setSeedl(String seedl) {
		this.seedl = seedl;
	}
	public String getInprefix() {
		return inprefix;
	}
	public void setInprefix(String inprefix) {
		this.inprefix = inprefix;
	}
	public String getInmiddle() {
		return inmiddle;
	}
	public void setInmiddle(String inmiddle) {
		this.inmiddle = inmiddle;
	}
	public String getInsuffix() {
		return insuffix;
	}
	public void setInsuffix(String insuffix) {
		this.insuffix = insuffix;
	}
	public boolean getInorder() {
		return inorder;
	}
	public void setInorder(boolean inorder) {
		this.inorder = inorder;
	}
	public int getInnum() {
		return innum;
	}
	public void setInnum(int innum) {
		this.innum = innum;
	}
	public String toString(){
		return "("+"["+symbol+","+seedf+","+seedl+"]"+","+inprefix+","+inmiddle+","+insuffix+","+inorder+","+innum+")";	
	}
	
}
