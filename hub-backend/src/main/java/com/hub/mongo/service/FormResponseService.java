package com.hub.mongo.service;

import com.hub.mongo.documents.FormResponse;
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
    public void persist(FormResponse formResponse) {
        repository.persist(formResponse);
    }

    public FormResponseDto getFormResponse(String user) {
        return repository.find("user = ?1 ", user)
                .firstResultOptional()
                .map(it -> mapper.toDto(it))
                .orElseThrow(() -> new NotFoundException("User not found"));
    }
}
