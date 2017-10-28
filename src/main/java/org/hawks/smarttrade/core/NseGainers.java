package org.hawks.smarttrade.core;

public class NseGainers implements Runnable{

	/**
	 * This class should call the nse server gainers and 
	 * convert json to object and push to database.
	 */
	public void run() {
		
		String data  = (new ServerResponse().getServerReponse(Globals.GAINERS));
		
	}

}
