package io.riguron.stackoverflow.api.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
public class Response {

    @JsonProperty("quota_remaining")
    private int quotaRemaining;
}
