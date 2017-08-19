package iTunesAPI.iTunesAPI;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result implements Serializable {

	private static final long serialVersionUID = 1476515572439L;


	private final Set<String> genreIds = new HashSet<String>();
	private final Set<String> genres = new HashSet<String>();

	private final Set<String> ipadScreenshotUrls = new HashSet<String>();
	private final Set<String> appletvScreenshotUrls = new HashSet<String>();
	private final Set<String> features = new HashSet<String>();
	private final Set<String> supportedDevices = new HashSet<String>();
	private final Set<String> advisories = new HashSet<String>();
	private final Set<String> screenshotUrls = new HashSet<String>();
	private final Set<String> languageCodesISO2A = new HashSet<String>();


	/**
	 * The name of the object returned by the search request.
	 * 
	 * @return track, collection, artist
	 */
	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getGenreIds() {
		return genreIds;
	}

	public void setGenreIds(Collection<String> genreIds) {
		this.genreIds.clear();
		if (genreIds != null) {
			this.genreIds.addAll(genreIds);
		}
	}

	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getGenres() {
		return genres;
	}

	public void setGenres(Collection<String> genres) {
		this.genres.clear();
		if (genres != null) {
			this.genres.addAll(genres);
		}
	}

	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getIpadScreenshotUrls() {
		return ipadScreenshotUrls;
	}

	public void setIpadScreenshotUrls(Collection<String> ipadScreenshotUrls) {
		this.ipadScreenshotUrls.clear();
		if (ipadScreenshotUrls != null) {
			this.ipadScreenshotUrls.addAll(ipadScreenshotUrls);
		}
	}

	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getAppletvScreenshotUrls() {
		return appletvScreenshotUrls;
	}

	public void setAppletvScreenshotUrls(Collection<String> appletvScreenshotUrls) {
		this.appletvScreenshotUrls.clear();
		if (appletvScreenshotUrls != null) {
			this.appletvScreenshotUrls.addAll(appletvScreenshotUrls);
		}
	}

	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getFeatures() {
		return features;
	}

	public void setFeatures(Collection<String> features) {
		this.features.clear();
		if (features != null) {
			this.features.addAll(features);
		}
	}

	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getSupportedDevices() {
		return supportedDevices;
	}

	public void setSupportedDevices(Collection<String> supportedDevices) {
		this.supportedDevices.clear();
		if (supportedDevices != null) {
			this.supportedDevices.addAll(supportedDevices);
		}
	}

	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getAdvisories() {
		return advisories;
	}

	public void setAdvisories(Collection<String> advisories) {
		this.advisories.clear();
		if (advisories != null) {
			this.advisories.addAll(advisories);
		}
	}

	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getScreenshotUrls() {
		return screenshotUrls;
	}

	public void setScreenshotUrls(Collection<String> screenshotUrls) {
		this.screenshotUrls.clear();
		if (screenshotUrls != null) {
			this.screenshotUrls.addAll(screenshotUrls);
		}
	}



	/**
	 * @return modifiable {@link Set}, never {@code null}
	 */
	public Set<String> getLanguageCodesISO2A() {
		return languageCodesISO2A;
	}

	public void setLanguageCodesISO2A(Collection<String> languageCodesISO2A) {
		this.languageCodesISO2A.clear();
		if (languageCodesISO2A != null) {
			this.languageCodesISO2A.addAll(languageCodesISO2A);
		}
	}


	@Override
	public String toString() {
		return  "Result [genreIds=" + genreIds
				+ ", genres=" + genres + ", ipadScreenshotUrls=" + ipadScreenshotUrls + ", appletvScreenshotUrls="
				+ appletvScreenshotUrls + ", features=" + features + ", supportedDevices=" + supportedDevices
				+ ", advisories=" + advisories + ", screenshotUrls=" + screenshotUrls +  ",languageCodesISO2A= "+ languageCodesISO2A + 
				"]";
	}
	
}
