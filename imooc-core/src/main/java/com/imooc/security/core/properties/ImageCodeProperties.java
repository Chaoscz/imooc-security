package com.imooc.security.core.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageCodeProperties {
    private int width=67;
    private int height = 23;
    private int length = 4;
    private int expireIn = 60;
    private String url;
}
