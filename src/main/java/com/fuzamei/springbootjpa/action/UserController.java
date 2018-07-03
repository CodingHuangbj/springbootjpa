package com.fuzamei.springbootjpa.action;

import com.fuzamei.springbootjpa.entity.User;
import com.fuzamei.springbootjpa.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "saveUser",notes = "saveUser")
    @ApiImplicitParam(name = "user",value = "user entity",required = true,dataType = "User")
    @PostMapping(value = "/saveUser")
    public User saveUser(@RequestBody User user){
        User userPO = userService.addUser(user);
        return userPO;
    }
}
