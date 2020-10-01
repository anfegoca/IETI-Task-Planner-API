package co.edu.escuelaing.ieti.taskPlanner.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.escuelaing.ieti.taskPlanner.model.User;
import co.edu.escuelaing.ieti.taskPlanner.services.UserService;



@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/createUser")
    public String createUser(User user) {

        service.create(user);
        return user+" creado";

    }
    @GetMapping("/getAll")
    public List<User> getAll(){
        return service.getAll();
    }
    @GetMapping("/getById")
    public User getById(String userId){
        return service.getById(userId);
    }
    
    @GetMapping("/update")
    public User update(User user){
        return service.update(user);
    }
    @GetMapping("/remove")
    public void remove(String userId){
        service.remove(userId);
    }
    
}
