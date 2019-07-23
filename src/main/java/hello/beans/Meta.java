
package hello.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "server_time",
    "server_timezone",
    "api_version",
    "execution_time"
})
public class Meta {

    @JsonProperty("server_time")
    private Integer serverTime;
    @JsonProperty("server_timezone")
    private String serverTimezone;
    @JsonProperty("api_version")
    private Integer apiVersion;
    @JsonProperty("execution_time")
    private String executionTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("server_time")
    public Integer getServerTime() {
        return serverTime;
    }

    @JsonProperty("server_time")
    public void setServerTime(Integer serverTime) {
        this.serverTime = serverTime;
    }

    @JsonProperty("server_timezone")
    public String getServerTimezone() {
        return serverTimezone;
    }

    @JsonProperty("server_timezone")
    public void setServerTimezone(String serverTimezone) {
        this.serverTimezone = serverTimezone;
    }

    @JsonProperty("api_version")
    public Integer getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("api_version")
    public void setApiVersion(Integer apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("execution_time")
    public String getExecutionTime() {
        return executionTime;
    }

    @JsonProperty("execution_time")
    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
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
