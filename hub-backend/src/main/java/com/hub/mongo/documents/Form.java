package com.hub.mongo.documents;

import java.time.Instant;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MongoEntity(collection = "Form")
public class Form extends PanacheMongoEntity {
    private String user;
    private Instant createdAt;
    // private
}
