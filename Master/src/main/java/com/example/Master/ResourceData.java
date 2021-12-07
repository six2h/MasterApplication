package com.example.Master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ResourceData {
    @JsonProperty("TCP Connections")
    Object TcpConnections;
    @JsonProperty("Total Memory")
    Object TotalMemory;
    @JsonProperty("Available Memory")
    Object AvailableMemory;
    @JsonProperty("Processor Info")
    Object ProcessorInfo;
}
