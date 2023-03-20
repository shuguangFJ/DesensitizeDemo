package com.example.desensitizedemo.pojo;

import com.example.desensitizedemo.converter.PhoneConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInfo {

    private String name;

    @JsonSerialize(converter = PhoneConverter.class)
    private String phone;
}
