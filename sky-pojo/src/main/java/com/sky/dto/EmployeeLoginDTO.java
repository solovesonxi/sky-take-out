package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import java.io.Serializable;

@Getter
@ApiModel(description = "员工登录时传递的数据模型")
public class EmployeeLoginDTO implements Serializable {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    public EmployeeLoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public EmployeeLoginDTO() {}

    public String getUsername() { return username; }
    public String getPassword() { return password; }

}
