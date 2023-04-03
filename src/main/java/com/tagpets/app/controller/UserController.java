package com.tagpets.app.controller;

import com.tagpets.app.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @RequestMapping(method = RequestMethod.GET, path = "/findAll")
    public ResponseEntity<User> findAll (){
        User user = new User(1L,"Maik","Costa","999.999.999","maikcosta@gmail.com");
        return ResponseEntity.ok().body(user);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/insert")
    public ResponseEntity<User> insert (){
        User user = new User(1L,"Maik","Costa","999.999.999","maikcosta@gmail.com");
        return ResponseEntity.ok().body(user);
    }
    @RequestMapping(method = RequestMethod.DELETE, path = "/deleteById")
    public ResponseEntity<User> deleteById (){
        User user = new User(1L,"Maik","Costa","999.999.999","maikcosta@gmail.com");
        return ResponseEntity.ok().body(user);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public User findById(@PathVariable long id){
        return (new User(id,"Jose","Maria","999.999.999","aaaaa@gmail.com"));
    }

    @RequestMapping(method = RequestMethod.GET)
    public User findByIdParam(@RequestParam(name = "id", required = true) long id){
        return (new User(id,"Ricardo","Levi","999.999.999","rrrr@gmail.com"));
    }
}
