package com.hub.mongo.repository;

import com.hub.mongo.model.Form;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FormRepository implements PanacheMongoRepository<Form> {

}
