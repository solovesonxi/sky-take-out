package com.sky.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.jwt")
public class JwtProperties {

    private String adminSecretKey = "d2h5LWFyZS15b3Utc28taW50ZXJlc3RlZC1pbi10aGlzLWtleQ==";
    private String adminTokenName;
    private Long adminTtl;

    public String getAdminSecretKey() {
        return adminSecretKey;
    }

    public void setAdminSecretKey(String adminSecretKey) {
        this.adminSecretKey = adminSecretKey;
    }

    public String getAdminTokenName() {
        return adminTokenName;
    }

    public void setAdminTokenName(String adminTokenName) {
        this.adminTokenName = adminTokenName;
    }

    public Long getAdminTtl() {
        return adminTtl;
    }

    public void setAdminTtl(Long adminTtl) {
        this.adminTtl = adminTtl;
    }
}