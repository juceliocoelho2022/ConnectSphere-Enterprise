package com.connectsphere.auth.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    private String secret;
    private Long accessTokenExpiration;
    private Long refreshTokenExpiration;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getAccessTokenExpiration() {
        return accessTokenExpiration;
    }

    public void setAccessTokenExpiration(Long accessTokenExpiration) {
        this.accessTokenExpiration = accessTokenExpiration;
    }

    public Long getRefreshTokenExpiration() {
        return refreshTokenExpiration;
    }

    public void setRefreshTokenExpiration(Long refreshTokenExpiration) {
        this.refreshTokenExpiration = refreshTokenExpiration;
    }
}