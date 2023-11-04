package com.company.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {
        private String type;
        private String query;
        private String language;
        private String unit;
}