package iTunesAPI.iTunesAPI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Response implements Serializable {

	private static final long serialVersionUID = 1476515585834L;

	/**
	 * Reusable, threadsafe {@link ObjectReader} instance for deserializing
	 * iTunes response into {@link Response} instance.
	 */
	public static final ObjectReader READER = new ObjectMapper().reader(Response.class);

	private int resultCount;
	
	private final List<Result> results = new ArrayList<Result>();

	/**
	 * @return the number of results in this {@link Response}
	 */
	public int getResultCount() {
		return resultCount;
	}

	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}

	/**
	 * @return modifiable {@link List} of {@link Result} instances, never {@code null}
	 */
	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results.clear();
		if (results != null) {
			this.results.addAll(results);
		}
	}

	@Override
	public String toString() {
		return "Response [resultCount=" + resultCount + ", results=" + results + "]";
	}
	
}