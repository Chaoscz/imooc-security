package com.imooc.security.core.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsCodeProperties {
    private int length = 6;
    private int expireIn = 60;
    private String url;
}
