package enums;

public enum Attribute {
	ACTOR_TERM("actorTerm"),
	ALBUM_TERM("albumTerm"),
	ALL_ARTIST_TERM("allArtistTerm"),
	ALL_TRACK_TERM("allTrackTerm"),
	ARTIST_TERM("artistTerm"),
	AUTHOR_TERM("authorTerm"),
	COMPOSER_TERM("composerTerm"),
	DESCRIPTION_TERM("descriptionTerm"),
	DIRECTOR_TERM("directorTerm"),
	FEATURE_FILM_TERM("featureFilmTerm"),
	GENRE_INDEX("genreIndex"),
	KEYWORDS_TERM("keywordsTerm"),
	LANGUAGE_TERM("languageTerm"),
	MIX_TERM("mixTerm"),
	MOVIE_ARTIST_TERM("movieArtistTerm"),
	MOVIE_TERM("movieTerm"),
	PRODUCER_TERM("producerTerm"),
	RATING_INDEX("ratingIndex"),
	RATING_TERM("ratingTerm"),
	RELEASE_YEAR_TERM("releaseYearTerm"),
	SHORT_FILM_TERM("shortFilmTerm"),
	SHOW_TERM("showTerm"),
	SOFTWARE_DEVELOPER("softwareDeveloper"),
	SONG_TERM("songTerm"),
	TITLE_TERM("titleTerm"),
	TV_EPISODE_TERM("tvEpisodeTerm"),
	TV_SEASON_TERM("tvSeasonTerm");

	private final String name;
	private Attribute(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}


}
