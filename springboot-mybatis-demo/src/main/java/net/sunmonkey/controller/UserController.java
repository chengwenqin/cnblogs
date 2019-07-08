package net.sunmonkey.controller;

import net.sunmonkey.entity.UserEntity;
import net.sunmonkey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    private List<UserEntity> getAll(){
        return userService.getAll();
    }

    @GetMapping("/user")
    private UserEntity get(@RequestParam String id){
        return userService.get(id);
    }

    @PostMapping("/user")
    public String add(@RequestBody UserEntity userEntity){
        if(1 == userService.add(userEntity)){
            return "添加用户成功！";
        }else{
            return "添加失败！";
        }
    }

    @PutMapping("/user")
    public String modify(@RequestBody UserEntity userEntity){
        if(1 == userService.modify(userEntity)){
            return "修改用户成功！";
        }else{
            return "添加失败！";
        }
    }

    @DeleteMapping("/user")
    public String delete(@RequestBody String id){
        if(1 == userService.delete(id)){
            return "删除用户成功！";
        }else{
            return "删除失败！";
        }
    }
}
