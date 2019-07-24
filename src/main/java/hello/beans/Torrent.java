
package hello.beans;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "hash",
    "quality",
    "type",
    "seeds",
    "peers",
    "size",
    "size_bytes",
    "date_uploaded",
    "date_uploaded_unix"
})
@Entity
public class Torrent {

    @JsonProperty("url")
    @Id
    private String url;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("quality")
    private String quality;
    @JsonProperty("type")
    private String type;
    @JsonProperty("seeds")
    private Integer seeds;
    @JsonProperty("peers")
    private Integer peers;
    @JsonProperty("size")
    private String size;
    @JsonProperty("size_bytes")
    private Long sizeBytes;
    @JsonProperty("date_uploaded")
    private String dateUploaded;
    @JsonProperty("date_uploaded_unix")
    private Integer dateUploadedUnix;
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="movie_id")
    private Movie movie;

    public Movie getMovie() {
        return movie;
    }

    @JsonProperty("url")
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("quality")
    public String getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(String quality) {
        this.quality = quality;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("seeds")
    public Integer getSeeds() {
        return seeds;
    }

    @JsonProperty("seeds")
    public void setSeeds(Integer seeds) {
        this.seeds = seeds;
    }

    @JsonProperty("peers")
    public Integer getPeers() {
        return peers;
    }

    @JsonProperty("peers")
    public void setPeers(Integer peers) {
        this.peers = peers;
    }

    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    @JsonProperty("size_bytes")
    public Long getSizeBytes() {
        return sizeBytes;
    }

    @JsonProperty("size_bytes")
    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
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
