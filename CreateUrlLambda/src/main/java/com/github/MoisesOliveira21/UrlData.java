package com.github.MoisesOliveira21;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UrlData {

    private String originalUrl;
    private long expirationTime;

}
