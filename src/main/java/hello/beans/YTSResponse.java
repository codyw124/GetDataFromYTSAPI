
package hello.beans;

import java.util.HashMap;
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
    "status",
    "status_message",
    "data",
    "@meta"
})
public class YTSResponse {

    @JsonProperty("status")
    @Transient
    private String status;
    @JsonProperty("status_message")
    @Transient
    private String statusMessage;
    @JsonProperty("data")
    private PageData data;
    @JsonProperty("@meta")
    @Transient
    private Meta meta;
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("status_message")
    public String getStatusMessage() {
        return statusMessage;
    }

    @JsonProperty("status_message")
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @JsonProperty("data")
    public PageData getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(PageData data) {
        this.data = data;
    }

    @JsonProperty("@meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("@meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
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
