package com.imooc.security.core.properties;

import com.imooc.security.core.validate.code.ImageCode;
import lombok.Data;

@Data
public class ValidateCodeProperties {
    private ImageCodeProperties image =new ImageCodeProperties();
}
