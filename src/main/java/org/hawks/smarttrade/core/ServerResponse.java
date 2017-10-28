package org.hawks.smarttrade.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ServerResponse {

	private Logger logger = (Logger) LogManager.getLogger(this.getClass().getName());
	
	
	/**
	 * Uses Get response
	 * @param url
	 * @return result or null
	 */
	public String getServerReponse(String url) {
		try {
			URL serverLink = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) serverLink.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("USER_AGENT", "Mozilla/5.0");
			connection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
			
			int responseCode  = connection.getResponseCode();
			String response = "Response Code: "+responseCode+"-  "+(new Date()).toString();
			System.out.println(response);
			logger.info(response);
			BufferedReader br  = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer buf = new StringBuffer();
			while(true) {
				String line  = br.readLine();
				if(line == null)break;
				buf.append(line);
			}
			br.close();
			connection.disconnect();
			return buf.toString();
		}catch(Exception ex) {
			String error  = this.getClass().getName()+" function: getServerReponse"+ex.getMessage();
			logger.error(ex.getMessage());
			return null;
		}
	}
	
}
