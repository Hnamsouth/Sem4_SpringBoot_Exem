package com.example.sem4_springboot_exem.controller;


import com.example.sem4_springboot_exem.entities.User;
import com.example.sem4_springboot_exem.entities.request.UserRequest;
import com.example.sem4_springboot_exem.service.IPM.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private  final UserService userService;

    @GetMapping("")
    public List<User> getAllUser (){
        return userService.getAll();
    }

    @PostMapping("/create")
    public User createUser(@Valid @RequestBody UserRequest request){
        var user = User.builder()
                .name(request.getName())
                .age(request.getAge())
                .salary(request.getSalary())
                .build();
        return userService.create(user);
    }

    @PutMapping("/update")
    public User updateUser(@Valid @RequestBody  User request){
        return userService.update(request);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable Long id){
        return userService.delete(id);
    }
    @GetMapping("/search")
    public  List<User> searchUser(@RequestParam String search){
        return userService.search(search);
    }
    @GetMapping("/search-multiple")
    public  List<User> searchUser(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam Integer age,
            @RequestParam Double salary
    ){
        return userService.searchMultiple(id,age,name,salary);
    }
}
