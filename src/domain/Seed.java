package domain;

public class Seed {
	
	String symbol;
	String seedfirst;
	String seedlast;
	
	
	public Seed(){
		
	}
	
	public Seed(String symbol,String seedfirst,String seedlast){
		this.symbol = symbol;
		this.seedfirst = seedfirst;
		this.seedlast = seedlast;
	}
	
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSeedfirst() {
		return seedfirst;
	}

	public String getSeedlast() {
		return seedlast;
	}

	public void setSeedlast(String seedlast) {
		this.seedlast = seedlast;
	}

	public void setSeedfirst(String seedfirst) {
		this.seedfirst = seedfirst;
	}
	
	public String toString(){
		return "("+symbol+","+seedfirst+","+seedlast+")";
	}
}
