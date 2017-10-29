package org.hawks.smarttrade.model;

import java.io.Serializable;

public class Stock implements Serializable{

	/**
	 * stock model
	 */
	private static final long serialVersionUID = 3851450315847289487L;

	private String symbol;
	private String series;
	private String openPrice;
	private String highPrice;
	private String lowPrice;
	private String ltp;
	private String previousPrice;
	private String netPrice;
	private String tradedQuantity;
	private String turnoverInLakhs;
	private String lastCorpAnnouncementDate;
	private String lastCorpAnnouncement;
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
	public String getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(String openPrice) {
		this.openPrice = openPrice;
	}
	public String getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}
	public String getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}
	public String getLtp() {
		return ltp;
	}
	public void setLtp(String ltp) {
		this.ltp = ltp;
	}
	public String getPreviousPrice() {
		return previousPrice;
	}
	public void setPreviousPrice(String previousPrice) {
		this.previousPrice = previousPrice;
	}
	public String getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(String netPrice) {
		this.netPrice = netPrice;
	}
	public String getTradedQuantity() {
		return tradedQuantity;
	}
	public void setTradedQuantity(String tradedQuantity) {
		this.tradedQuantity = tradedQuantity;
	}
	public String getTurnoverInLakhs() {
		return turnoverInLakhs;
	}
	public void setTurnoverInLakhs(String turnoverInLakhs) {
		this.turnoverInLakhs = turnoverInLakhs;
	}
	public String getLastCorpAnnouncementDate() {
		return lastCorpAnnouncementDate;
	}
	public void setLastCorpAnnouncementDate(String lastCorpAnnouncementDate) {
		this.lastCorpAnnouncementDate = lastCorpAnnouncementDate;
	}
	public String getLastCorpAnnouncement() {
		return lastCorpAnnouncement;
	}
	public void setLastCorpAnnouncement(String lastCorpAnnouncement) {
		this.lastCorpAnnouncement = lastCorpAnnouncement;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((highPrice == null) ? 0 : highPrice.hashCode());
		result = prime * result + ((lastCorpAnnouncement == null) ? 0 : lastCorpAnnouncement.hashCode());
		result = prime * result + ((lastCorpAnnouncementDate == null) ? 0 : lastCorpAnnouncementDate.hashCode());
		result = prime * result + ((lowPrice == null) ? 0 : lowPrice.hashCode());
		result = prime * result + ((ltp == null) ? 0 : ltp.hashCode());
		result = prime * result + ((netPrice == null) ? 0 : netPrice.hashCode());
		result = prime * result + ((openPrice == null) ? 0 : openPrice.hashCode());
		result = prime * result + ((previousPrice == null) ? 0 : previousPrice.hashCode());
		result = prime * result + ((series == null) ? 0 : series.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((tradedQuantity == null) ? 0 : tradedQuantity.hashCode());
		result = prime * result + ((turnoverInLakhs == null) ? 0 : turnoverInLakhs.hashCode());
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
		Stock other = (Stock) obj;
		if (highPrice == null) {
			if (other.highPrice != null)
				return false;
		} else if (!highPrice.equals(other.highPrice))
			return false;
		if (lastCorpAnnouncement == null) {
			if (other.lastCorpAnnouncement != null)
				return false;
		} else if (!lastCorpAnnouncement.equals(other.lastCorpAnnouncement))
			return false;
		if (lastCorpAnnouncementDate == null) {
			if (other.lastCorpAnnouncementDate != null)
				return false;
		} else if (!lastCorpAnnouncementDate.equals(other.lastCorpAnnouncementDate))
			return false;
		if (lowPrice == null) {
			if (other.lowPrice != null)
				return false;
		} else if (!lowPrice.equals(other.lowPrice))
			return false;
		if (ltp == null) {
			if (other.ltp != null)
				return false;
		} else if (!ltp.equals(other.ltp))
			return false;
		if (netPrice == null) {
			if (other.netPrice != null)
				return false;
		} else if (!netPrice.equals(other.netPrice))
			return false;
		if (openPrice == null) {
			if (other.openPrice != null)
				return false;
		} else if (!openPrice.equals(other.openPrice))
			return false;
		if (previousPrice == null) {
			if (other.previousPrice != null)
				return false;
		} else if (!previousPrice.equals(other.previousPrice))
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
		if (tradedQuantity == null) {
			if (other.tradedQuantity != null)
				return false;
		} else if (!tradedQuantity.equals(other.tradedQuantity))
			return false;
		if (turnoverInLakhs == null) {
			if (other.turnoverInLakhs != null)
				return false;
		} else if (!turnoverInLakhs.equals(other.turnoverInLakhs))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", series=" + series + ", openPrice=" + openPrice + ", highPrice="
				+ highPrice + ", lowPrice=" + lowPrice + ", ltp=" + ltp + ", previousPrice=" + previousPrice
				+ ", netPrice=" + netPrice + ", tradedQuantity=" + tradedQuantity + ", turnoverInLakhs="
				+ turnoverInLakhs + ", lastCorpAnnouncementDate=" + lastCorpAnnouncementDate + ", lastCorpAnnouncement="
				+ lastCorpAnnouncement + "]";
	}
	
	
	
	
}
