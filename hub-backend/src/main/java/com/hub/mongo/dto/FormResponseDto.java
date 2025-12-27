package com.hub.mongo.dto;

import java.time.Instant;
import java.util.Map;

import lombok.Data;

@Data
public class FormResponseDto {
    private String user;
    private Instant submittedAt;
    private Map<String, Object> answers;
}
