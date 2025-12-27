package com.hub.mongo.mapper;

import com.hub.mongo.documents.FormResponse;
import com.hub.mongo.dto.FormResponseDto;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FormResponseMapper {

    public FormResponseDto toDto(FormResponse formResponse) {

        if (formResponse == null) {
            return null;
        }

        FormResponseDto dto = new FormResponseDto();
        dto.setAnswers(formResponse.getAnswers());
        dto.setSubmittedAt(formResponse.getSubmittedAt());
        dto.setUser(formResponse.getUser());
        return dto;
    }

}
