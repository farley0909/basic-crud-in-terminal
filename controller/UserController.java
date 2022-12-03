package controller;

import model.User;

public class UserController implements IUserController {
    public void save(User user){
        
        System.out.println("saved!!!");
    }
    @Override
    public User findByEmail(String email) {
        System.out.println("Finded!!!");
        return null;
    }
}
