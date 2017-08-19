package iTunesAPI.iTunesAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;

public class URLConnector implements Connector,Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1476515538667L;
	public static final URLConnector INSTANCE = new URLConnector();

	public String get(String link) throws IOException {
		URL url = new URL(link);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(url.openConnection().getInputStream(), "UTF-8"));
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = in.readLine()) != null) {
			sb.append(line);
			sb.append(System.getProperty("line.separator"));
		}
		in.close();
		return sb.toString().trim();
	}

}