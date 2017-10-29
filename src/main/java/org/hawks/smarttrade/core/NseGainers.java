package org.hawks.smarttrade.core;

import org.hawks.smarttrade.model.Trade;

import com.google.gson.Gson;

public class NseGainers implements Runnable{

	/**
	 * This class should call the nse server gainers and 
	 * convert json to object and push to database.
	 */
	
	
	/**
	 * Note: this should call MON-FRI : 9:00AM to 4:00PM
	 */
	public void run() {
		Gson gson  = new Gson();
		String data  = (new ServerResponse().getServerReponse(Globals.GAINERS));
		Trade trade = gson.fromJson(data, Trade.class);
	}

}
