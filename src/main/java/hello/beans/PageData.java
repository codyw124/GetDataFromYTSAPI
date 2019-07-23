
package hello.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "movie_count",
    "limit",
    "page_number",
    "movies"
})
public class PageData {

    @JsonProperty("movie_count")
    @Transient
    private Integer movieCount;
    @JsonProperty("limit")
    @Transient
    private Integer limit;
    @JsonProperty("page_number")
    @Transient
    private Integer pageNumber;
    @JsonProperty("movies")
    private List<Movie> movies = null;
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("movie_count")
    public Integer getMovieCount() {
        return movieCount;
    }

    @JsonProperty("movie_count")
    public void setMovieCount(Integer movieCount) {
        this.movieCount = movieCount;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("page_number")
    public Integer getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("page_number")
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @JsonProperty("movies")
    public List<Movie> getMovies() {
        return movies;
    }

    @JsonProperty("movies")
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
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
