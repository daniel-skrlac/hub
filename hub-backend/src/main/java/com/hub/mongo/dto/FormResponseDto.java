package com.hub.mongo.dto;

import java.time.Instant;
import java.util.Map;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.hub.mongo.model.FormResponse;

import io.quarkus.mongodb.panache.common.ProjectionFor;
import lombok.Data;

@Data
@ProjectionFor(FormResponse.class)
public class FormResponseDto {
    private ObjectId formId;
    private String user;
    @JsonProperty(access = Access.READ_ONLY)
    private Instant submittedAt;
    private Map<String, Object> answers;
}
