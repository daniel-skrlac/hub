package com.hub.mongo.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Data;

@Data
public class FormComponent {
    public enum HtmlElement {
        TEXTAREA("textarea");

        private String name;

        private HtmlElement(String name) {
            this.name = name;
        }

        @JsonValue
        public String getName() {
            return name;
        }

        public HtmlElement fromName(String name) {
            for (HtmlElement value : HtmlElement.values()) {
                if (value.getName().equals(name)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("Enum of type %s does not exist".formatted(name));
        }
    }

    private String name;
    private HtmlElement type;
    private String label;
}
