package com.example.desensitizedemo.converter;

import com.fasterxml.jackson.databind.util.StdConverter;

public class PhoneConverter extends StdConverter<String, String> {

    @Override
    public String convert(String s) {
        if (s == null || s.length() != 11)
            return s;
        return s.substring(0, 3) + "****" + s.substring(7);
    }
}
