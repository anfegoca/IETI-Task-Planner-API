package co.edu.escuelaing.ieti.taskPlanner.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.edu.escuelaing.ieti.taskPlanner.model.User;
import co.edu.escuelaing.ieti.taskPlanner.services.UserService;

@Component
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(String userId) {
        return null;
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remove(String userId) {
        // TODO Auto-generated method stub

    }
    
}
