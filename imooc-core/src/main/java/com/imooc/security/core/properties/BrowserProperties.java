package com.imooc.security.core.properties;

import lombok.Data;

@Data
public class BrowserProperties {

    private String loginPage="/imooc-signIn.html";

    private LoginType loginType =LoginType.JSON;

    private Integer rememberMeSeconds=3600;
}
