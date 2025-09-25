package com.sky.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.jwt")
public class JwtProperties {

    /**
     * 管理端员工生成jwt令牌相关配置
     */
    private String adminSecretKey;
    private long adminTtl;
    private String adminTokenName;

    /**
     * 用户端微信用户生成jwt令牌相关配置
     */
    private String userSecretKey;
    private long userTtl;
    private String userTokenName;

    public String getAdminSecretKey() { return adminSecretKey; }
    public long getAdminTtl() { return adminTtl; }
    public String getAdminTokenName() { return adminTokenName; }
    public String getUserSecretKey() { return userSecretKey; }
    public long getUserTtl() { return userTtl; }
    public String getUserTokenName() { return userTokenName; }
}
