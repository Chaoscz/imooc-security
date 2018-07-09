package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.validator.MyConstraint;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Past;
import java.util.Date;

@Data
public class User {
    @MyConstraint(message = "这是一个自定义的校验注解的测试")
    @JsonView(UserSimpleView.class)
    private String username;

    @NotBlank(message = "密码不能为空")
    @JsonView(UserDetailView.class)
    private String password;

    @JsonView(UserSimpleView.class)
    private String id;

    @Past(message = "生日必须是一个过去的时间")
    @JsonView(UserSimpleView.class)
    private Date birthday;


    public interface UserSimpleView{}
    public interface UserDetailView extends UserSimpleView{}
}
