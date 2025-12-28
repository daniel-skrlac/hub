package com.hub.mongo.service;

import com.hub.mongo.dto.FormResponseDto;
import com.hub.mongo.mapper.FormResponseMapper;
import com.hub.mongo.repository.FormResponseRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class FormResponseService {

    final FormResponseRepository repository;
    final FormResponseMapper mapper;

    @Transactional
    public void persist(FormResponseDto formResponseDto) {
        repository.persist(mapper.toEntity(formResponseDto));
    }

    public FormResponseDto find(String user) {
        return repository.find("user = ?1 ", user)
                .project(FormResponseDto.class)
                .firstResultOptional()
                .orElseThrow(() -> new NotFoundException("User not found"));
    }
}
