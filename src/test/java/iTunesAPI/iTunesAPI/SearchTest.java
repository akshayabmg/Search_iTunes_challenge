package iTunesAPI.iTunesAPI;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;

import enums.Country;
import enums.Media;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class SearchTest {

	@Before
	public void setup() {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "trace");
	}
	
	/**
	 * Find podcast What's up
	 */
	@Test
	public void searchPodcasts() {
		Response response = 
				new Search("what's up")
				.setCountry(Country.UNITED_STATES)
				.setMedia(Media.PODCAST)
				.execute();
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getResultCount() > 0);
		Assert.assertNotNull(response.getResults());
	}

	/**
	 * A term must be set before searching
	 */
	@Test(expected = IllegalStateException.class)
	public void emptyRequest() {
		new Search().build();
	}

	@Test
	public void connectorTest() throws IOException {
		String request = new Search().setTerm("south").setCountry(Country.CANADA).setMedia(Media.PODCAST).build();
		String response = new URLConnector().get(request);
		Assert.assertNotNull(response);
	}

	@Test(expected = IllegalArgumentException.class)
	public void connectorNotNull() {
		new Search().setTerm("south").setCountry(Country.CANADA).setMedia(Media.PODCAST).execute(null);
	}

	@Test
	public void mediaTest() throws IOException {
		for (Media media : Media.values()) {
			Search request = new Search()
					.setTerm("springsteen")
					.setCountry(Country.UNITED_STATES)
					.setMedia(media)
					.setLimit(2);
			String response = new URLConnector().get(request.build());
			Assert.assertNotNull(response);
		}
	}

	@Test
	public void emptyCollectionsNotNull() throws IOException {
		Result result = new Result();
		result.getAdvisories().isEmpty();
		result.getGenreIds().isEmpty();
		result.getGenres().isEmpty();
		result.getIpadScreenshotUrls().isEmpty();
		result.getAppletvScreenshotUrls().isEmpty();
		result.getFeatures().isEmpty();
		result.getSupportedDevices().isEmpty();
		result.getScreenshotUrls().isEmpty();
		result.getLanguageCodesISO2A().isEmpty();
	}
	
}