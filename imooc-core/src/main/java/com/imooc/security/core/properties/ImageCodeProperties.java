package com.imooc.security.core.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ImageCodeProperties extends SmsCodeProperties {
    private int width=67;
    private int height = 23;
    public ImageCodeProperties(){
        setLength(4);
    }
}
