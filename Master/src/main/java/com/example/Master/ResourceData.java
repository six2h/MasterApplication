package com.example.Master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ResourceData {
    @JsonProperty("Performance")
    Performance performance;
    @JsonProperty("Agility")
    Agility agility;
    @JsonProperty("Security")
    Security security;
}
