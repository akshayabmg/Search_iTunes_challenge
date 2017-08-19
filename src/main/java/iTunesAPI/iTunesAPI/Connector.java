package iTunesAPI.iTunesAPI;

import java.io.IOException;

public interface Connector {
	public String get(String link) throws IOException;
}
