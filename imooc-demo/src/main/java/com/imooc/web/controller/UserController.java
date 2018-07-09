package com.imooc.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.dto.User;
import com.imooc.dto.UserQueryCondition;
import com.imooc.exception.UserNotExistException;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping
    @JsonView(User.UserSimpleView.class)
    public List<User> query(/*@RequestParam(name = "username",defaultValue = "tom")  String nickname*/
                            UserQueryCondition condition,@PageableDefault(page = 2,size = 15,sort = "username,asc") Pageable pageable){
       // System.out.println("username:"+nickname);
        System.out.println(condition);
        System.out.println(pageable);
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable(name = "id") String id){
//        throw new RuntimeException();
//        throw new UserNotExistException(id);
        System.out.println("进入getInfo服务");
        User user = new User();
        user.setUsername("czc");
        return user;
    }

    @PostMapping
    public User create(@Valid @RequestBody User user/*, BindingResult errors*/){
        /*if(errors.hasErrors()){
            errors.getAllErrors().stream().forEach(error ->System.out.println(error.getDefaultMessage()));
        }
*/
        System.out.println(user);
        user.setId("1");
        return user;
    }

    @PutMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User updateInfo(@Valid @RequestBody User user, BindingResult errors){
        if(errors.hasErrors()){
            /*errors.getAllErrors().stream().forEach(error ->{
                FieldError fieldError = (FieldError)error;
                String message =fieldError.getField()+" "+ fieldError.getDefaultMessage();
                System.out.println(message);
            });*/
            errors.getAllErrors().stream().forEach(error ->System.out.println(error.getDefaultMessage()));
        }

        System.out.println(user);
        user.setId("1");
        return user;
    }

    @DeleteMapping("/{id:\\d+}")
    public void delete(@PathVariable String id){
        System.out.println(id);
    }
}
