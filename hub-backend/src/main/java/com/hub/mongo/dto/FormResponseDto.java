package com.hub.mongo.dto;

import java.time.Instant;
import java.util.Map;

import com.hub.mongo.documents.FormResponse;

import io.quarkus.mongodb.panache.common.ProjectionFor;
import lombok.Data;

@Data
@ProjectionFor(FormResponse.class)
public class FormResponseDto {
    private String user;
    private Instant submittedAt;
    private Map<String, Object> answers;
}
