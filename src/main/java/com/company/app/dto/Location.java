package com.company.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Location {
    private String name;
    private String country;
    private String region;
    private String lat;
    private String lon;
    @JsonProperty("timezone_id")
    private String timezoneId;
    private String localtime;
    @JsonProperty("localtime_epoch")
    private int localtimeEpoch;
    @JsonProperty("utc_offset")
    private String utcOffset;
    ;
}
