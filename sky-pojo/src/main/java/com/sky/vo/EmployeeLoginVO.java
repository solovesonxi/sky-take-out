package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "员工登录返回的数据格式")
public class EmployeeLoginVO implements Serializable {

    @ApiModelProperty("主键值")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("jwt令牌")
    private String token;

    public Long getId() { return id; }
    public String getUserName() { return userName; }
    public String getName() { return name; }
    public String getToken() { return token; }
    public static Builder builder() { return new Builder(); }
    public static class Builder {
        private Long id;
        private String userName;
        private String name;
        private String token;
        public Builder id(Long id) { this.id = id; return this; }
        public Builder userName(String userName) { this.userName = userName; return this; }
        public Builder name(String name) { this.name = name; return this; }
        public Builder token(String token) { this.token = token; return this; }
        public EmployeeLoginVO build() {
            EmployeeLoginVO vo = new EmployeeLoginVO();
            vo.id = this.id;
            vo.userName = this.userName;
            vo.name = this.name;
            vo.token = this.token;
            return vo;
        }
    }

}
