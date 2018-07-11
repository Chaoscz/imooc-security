package com.imooc.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "imooc.security")
@Data
public class SecurityPorperties {

    private BrowserProperties  browser= new BrowserProperties();

}
