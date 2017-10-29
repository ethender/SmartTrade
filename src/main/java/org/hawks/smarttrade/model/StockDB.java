package org.hawks.smarttrade.model;

import java.io.Serializable;

public class StockDB implements Serializable{

	/**
	 * Stocks DB
	 */
	private static final long serialVersionUID = 872302046042956810L;

	private int stockid;
	private String symbol;
	private String series;
	private float openprice;
	private float highprice;
	private float lowprice;
	private float ltp;
	private float previousprice;
	private float netprice;
	private float tradedquantity;
	private float turnoverinlakhs;
	private String lastcropannouncementdate;
	private String lastcropannouncement;
	private String stockstate;
	public int getStockid() {
		return stockid;
	}
	public void setStockid(int stockid) {
		this.stockid = stockid;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public float getOpenprice() {
		return openprice;
	}
	public void setOpenprice(float openprice) {
		this.openprice = openprice;
	}
	public float getHighprice() {
		return highprice;
	}
	public void setHighprice(float highprice) {
		this.highprice = highprice;
	}
	public float getLowprice() {
		return lowprice;
	}
	public void setLowprice(float lowprice) {
		this.lowprice = lowprice;
	}
	public float getLtp() {
		return ltp;
	}
	public void setLtp(float ltp) {
		this.ltp = ltp;
	}
	public float getPreviousprice() {
		return previousprice;
	}
	public void setPreviousprice(float previousprice) {
		this.previousprice = previousprice;
	}
	public float getNetprice() {
		return netprice;
	}
	public void setNetprice(float netprice) {
		this.netprice = netprice;
	}
	public float getTradedquantity() {
		return tradedquantity;
	}
	public void setTradedquantity(float tradedquantity) {
		this.tradedquantity = tradedquantity;
	}
	public float getTurnoverinlakhs() {
		return turnoverinlakhs;
	}
	public void setTurnoverinlakhs(float turnoverinlakhs) {
		this.turnoverinlakhs = turnoverinlakhs;
	}
	public String getLastcropannouncementdate() {
		return lastcropannouncementdate;
	}
	public void setLastcropannouncementdate(String lastcropannouncementdate) {
		this.lastcropannouncementdate = lastcropannouncementdate;
	}
	public String getLastcropannouncement() {
		return lastcropannouncement;
	}
	public void setLastcropannouncement(String lastcropannouncement) {
		this.lastcropannouncement = lastcropannouncement;
	}
	public String getStockstate() {
		return stockstate;
	}
	public void setStockstate(String stockstate) {
		this.stockstate = stockstate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(highprice);
		result = prime * result + ((lastcropannouncement == null) ? 0 : lastcropannouncement.hashCode());
		result = prime * result + ((lastcropannouncementdate == null) ? 0 : lastcropannouncementdate.hashCode());
		result = prime * result + Float.floatToIntBits(lowprice);
		result = prime * result + Float.floatToIntBits(ltp);
		result = prime * result + Float.floatToIntBits(netprice);
		result = prime * result + Float.floatToIntBits(openprice);
		result = prime * result + Float.floatToIntBits(previousprice);
		result = prime * result + ((series == null) ? 0 : series.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + Float.floatToIntBits(tradedquantity);
		result = prime * result + Float.floatToIntBits(turnoverinlakhs);
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
		StockDB other = (StockDB) obj;
		if (Float.floatToIntBits(highprice) != Float.floatToIntBits(other.highprice))
			return false;
		if (lastcropannouncement == null) {
			if (other.lastcropannouncement != null)
				return false;
		} else if (!lastcropannouncement.equals(other.lastcropannouncement))
			return false;
		if (lastcropannouncementdate == null) {
			if (other.lastcropannouncementdate != null)
				return false;
		} else if (!lastcropannouncementdate.equals(other.lastcropannouncementdate))
			return false;
		if (Float.floatToIntBits(lowprice) != Float.floatToIntBits(other.lowprice))
			return false;
		if (Float.floatToIntBits(ltp) != Float.floatToIntBits(other.ltp))
			return false;
		if (Float.floatToIntBits(netprice) != Float.floatToIntBits(other.netprice))
			return false;
		if (Float.floatToIntBits(openprice) != Float.floatToIntBits(other.openprice))
			return false;
		if (Float.floatToIntBits(previousprice) != Float.floatToIntBits(other.previousprice))
			return false;
		if (series == null) {
			if (other.series != null)
				return false;
		} else if (!series.equals(other.series))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (Float.floatToIntBits(tradedquantity) != Float.floatToIntBits(other.tradedquantity))
			return false;
		if (Float.floatToIntBits(turnoverinlakhs) != Float.floatToIntBits(other.turnoverinlakhs))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StockDB [stockid=" + stockid + ", symbol=" + symbol + ", series=" + series + ", openprice=" + openprice
				+ ", highprice=" + highprice + ", lowprice=" + lowprice + ", ltp=" + ltp + ", previousprice="
				+ previousprice + ", netprice=" + netprice + ", tradedquantity=" + tradedquantity + ", turnoverinlakhs="
				+ turnoverinlakhs + ", lastcropannouncementdate=" + lastcropannouncementdate + ", lastcropannouncement="
				+ lastcropannouncement + ", stockstate=" + stockstate + "]";
	}
	
	
	
	
}
