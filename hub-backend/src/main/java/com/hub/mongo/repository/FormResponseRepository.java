package com.hub.mongo.repository;

import com.hub.mongo.documents.FormResponse;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FormResponseRepository implements PanacheMongoRepository<FormResponse> {
}
