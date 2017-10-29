package org.hawks.smarttrade.model;

import java.io.Serializable;

public class TradeDB implements Serializable{

	/**
	 * Trade DB
	 */
	private static final long serialVersionUID = 1076993453429508651L;
	
	private int tradeid;
	private String tradedate;
	private String tradeState;
	private String stocks;
	
	
	
	public TradeDB() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public TradeDB(int tradeid, String tradedate, String tradeState, String stocks) {
		super();
		this.tradeid = tradeid;
		this.tradedate = tradedate;
		this.tradeState = tradeState;
		this.stocks = stocks;
	}




	public int getTradeid() {
		return tradeid;
	}
	public void setTradeid(int tradeid) {
		this.tradeid = tradeid;
	}
	public String getTradedate() {
		return tradedate;
	}
	public void setTradedate(String tradedate) {
		this.tradedate = tradedate;
	}
	public String getTradeState() {
		return tradeState;
	}
	public void setTradeState(String tradeState) {
		this.tradeState = tradeState;
	}
	public String getStocks() {
		return stocks;
	}
	public void setStocks(String stocks) {
		this.stocks = stocks;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tradeState == null) ? 0 : tradeState.hashCode());
		result = prime * result + ((tradedate == null) ? 0 : tradedate.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TradeDB other = (TradeDB) obj;
		if (tradeState == null) {
			if (other.tradeState != null)
				return false;
		} else if (!tradeState.equals(other.tradeState))
			return false;
		if (tradedate == null) {
			if (other.tradedate != null)
				return false;
		} else if (!tradedate.equals(other.tradedate))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "TradeDB [tradeid=" + tradeid + ", tradedate=" + tradedate + ", tradeState=" + tradeState + ", stocks="
				+ stocks + "]";
	}
	
	
	
	
	
	
	
}
