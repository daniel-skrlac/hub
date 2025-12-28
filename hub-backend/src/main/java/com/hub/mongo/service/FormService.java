package com.hub.mongo.service;

import com.hub.mongo.dto.FormDto;
import com.hub.mongo.mapper.FormMapper;
import com.hub.mongo.repository.FormRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.NotFoundException;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class FormService {

    final FormMapper mapper;
    final FormRepository repository;

    public void persist(FormDto dto) {
        repository.persist(mapper.toEntity(dto));
    }

    public FormDto find(String user) {
        return repository.find("user = ?1", user)
                .project(FormDto.class)
                .firstResultOptional()
                .orElseThrow(() -> new NotFoundException());
    }

}
