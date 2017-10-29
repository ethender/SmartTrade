package org.hawks.smarttrade.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Trade implements Serializable{

	/**
	 * Trade Model
	 */
	private static final long serialVersionUID = 8312405298468309397L;

	private String time;
	private ArrayList<Stock> data;
	
	
	public Trade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trade(String time, ArrayList<Stock> data) {
		super();
		this.time = time;
		this.data = data;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public ArrayList<Stock> getData() {
		return data;
	}
	public void setData(ArrayList<Stock> data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Trade other = (Trade) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Trade [time=" + time + ", data=" + data + "]";
	}	
	
}
