package domain;

import java.util.List;

public class Occurrence {
	
		List<String> prefix;  //seedf之前出现的语料
		String seedf;	//seedf
		List<String> middle;	//seedf和seedl之间出现的语料
		String seedl;	//seedl
		List<String> suffix;	//seedl之后出现的语料
		boolean order;	//是否在这个句子中找到种子
		int num;		//标记这个句子中有几个种子
		String symbol;
		
		public Occurrence(){}
		public Occurrence(List<String> prefix,String seedf,List<String> middle,String seedl,List<String> suffix,String symbol,boolean order,int num){
			this.prefix = prefix;
			this.seedf = seedf;
			this.middle = middle;
			this.seedl = seedl;
			this.suffix = suffix;
			this.symbol = symbol;
			this.order = order;
			this.num = num;
		}
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public List<String> getPrefix() {
			return prefix;
		}
		public void setPrefix(List<String> prefix) {
			this.prefix = prefix;
		}
		public String getSeedf() {
			return seedf;
		}
		public void setSeedf(String seedf) {
			this.seedf = seedf;
		}
		public List<String> getMiddle() {
			return middle;
		}
		public void setMiddle(List<String> middle) {
			this.middle = middle;
		}
		public String getSeedl() {
			return seedl;
		}
		public void setSeedl(String seedl) {
			this.seedl = seedl;
		}
		public List<String> getSuffix() {
			return suffix;
		}
		public void setSuffix(List<String> suffix) {
			this.suffix = suffix;
		}
		public boolean isOrder() {
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
			return "("+prefix+","+seedf+","+middle+","+seedl+","+suffix+","+symbol+","+order+","+num+")";
		}
		
}
