
package hello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "url",
    "imdb_code",
    "title",
    "title_english",
    "title_long",
    "slug",
    "year",
    "rating",
    "runtime",
    "genres",
    "summary",
    "description_full",
    "synopsis",
    "yt_trailer_code",
    "language",
    "mpa_rating",
    "background_image",
    "background_image_original",
    "small_cover_image",
    "medium_cover_image",
    "large_cover_image",
    "state",
    "torrents",
    "date_uploaded",
    "date_uploaded_unix"
})
public class Movie {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("imdb_code")
    private String imdbCode;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_english")
    private String titleEnglish;
    @JsonProperty("title_long")
    private String titleLong;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("rating")
    private Double rating;
    @JsonProperty("runtime")
    private Integer runtime;
    @JsonProperty("genres")
    private List<String> genres = null;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description_full")
    private String descriptionFull;
    @JsonProperty("synopsis")
    private String synopsis;
    @JsonProperty("yt_trailer_code")
    private String ytTrailerCode;
    @JsonProperty("language")
    private String language;
    @JsonProperty("mpa_rating")
    private String mpaRating;
    @JsonProperty("background_image")
    private String backgroundImage;
    @JsonProperty("background_image_original")
    private String backgroundImageOriginal;
    @JsonProperty("small_cover_image")
    private String smallCoverImage;
    @JsonProperty("medium_cover_image")
    private String mediumCoverImage;
    @JsonProperty("large_cover_image")
    private String largeCoverImage;
    @JsonProperty("state")
    private String state;
    @JsonProperty("torrents")
    private List<Torrent> torrents = null;
    @JsonProperty("date_uploaded")
    private String dateUploaded;
    @JsonProperty("date_uploaded_unix")
    private Integer dateUploadedUnix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("imdb_code")
    public String getImdbCode() {
        return imdbCode;
    }

    @JsonProperty("imdb_code")
    public void setImdbCode(String imdbCode) {
        this.imdbCode = imdbCode;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title_english")
    public String getTitleEnglish() {
        return titleEnglish;
    }

    @JsonProperty("title_english")
    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    @JsonProperty("title_long")
    public String getTitleLong() {
        return titleLong;
    }

    @JsonProperty("title_long")
    public void setTitleLong(String titleLong) {
        this.titleLong = titleLong;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @JsonProperty("runtime")
    public Integer getRuntime() {
        return runtime;
    }

    @JsonProperty("runtime")
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    @JsonProperty("genres")
    public List<String> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("description_full")
    public String getDescriptionFull() {
        return descriptionFull;
    }

    @JsonProperty("description_full")
    public void setDescriptionFull(String descriptionFull) {
        this.descriptionFull = descriptionFull;
    }

    @JsonProperty("synopsis")
    public String getSynopsis() {
        return synopsis;
    }

    @JsonProperty("synopsis")
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @JsonProperty("yt_trailer_code")
    public String getYtTrailerCode() {
        return ytTrailerCode;
    }

    @JsonProperty("yt_trailer_code")
    public void setYtTrailerCode(String ytTrailerCode) {
        this.ytTrailerCode = ytTrailerCode;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("mpa_rating")
    public String getMpaRating() {
        return mpaRating;
    }

    @JsonProperty("mpa_rating")
    public void setMpaRating(String mpaRating) {
        this.mpaRating = mpaRating;
    }

    @JsonProperty("background_image")
    public String getBackgroundImage() {
        return backgroundImage;
    }

    @JsonProperty("background_image")
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @JsonProperty("background_image_original")
    public String getBackgroundImageOriginal() {
        return backgroundImageOriginal;
    }

    @JsonProperty("background_image_original")
    public void setBackgroundImageOriginal(String backgroundImageOriginal) {
        this.backgroundImageOriginal = backgroundImageOriginal;
    }

    @JsonProperty("small_cover_image")
    public String getSmallCoverImage() {
        return smallCoverImage;
    }

    @JsonProperty("small_cover_image")
    public void setSmallCoverImage(String smallCoverImage) {
        this.smallCoverImage = smallCoverImage;
    }

    @JsonProperty("medium_cover_image")
    public String getMediumCoverImage() {
        return mediumCoverImage;
    }

    @JsonProperty("medium_cover_image")
    public void setMediumCoverImage(String mediumCoverImage) {
        this.mediumCoverImage = mediumCoverImage;
    }

    @JsonProperty("large_cover_image")
    public String getLargeCoverImage() {
        return largeCoverImage;
    }

    @JsonProperty("large_cover_image")
    public void setLargeCoverImage(String largeCoverImage) {
        this.largeCoverImage = largeCoverImage;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("torrents")
    public List<Torrent> getTorrents() {
        return torrents;
    }

    @JsonProperty("torrents")
    public void setTorrents(List<Torrent> torrents) {
        this.torrents = torrents;
    }

    @JsonProperty("date_uploaded")
    public String getDateUploaded() {
        return dateUploaded;
    }

    @JsonProperty("date_uploaded")
    public void setDateUploaded(String dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    @JsonProperty("date_uploaded_unix")
    public Integer getDateUploadedUnix() {
        return dateUploadedUnix;
    }

    @JsonProperty("date_uploaded_unix")
    public void setDateUploadedUnix(Integer dateUploadedUnix) {
        this.dateUploadedUnix = dateUploadedUnix;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
