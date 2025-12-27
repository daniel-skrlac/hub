package com.hub.mongo.documents;

import java.time.Instant;
import java.util.Map;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MongoEntity(collection = "FormResponse")
public class FormResponse extends PanacheMongoEntity {
    private ObjectId formId;
    private String user;
    private Instant submittedAt;
    private Map<String, Object> answers;
}
