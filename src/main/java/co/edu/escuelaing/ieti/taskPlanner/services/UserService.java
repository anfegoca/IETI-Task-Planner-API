package co.edu.escuelaing.ieti.taskPlanner.services;

import java.util.List;

import co.edu.escuelaing.ieti.taskPlanner.model.User;



public interface UserService {
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}
