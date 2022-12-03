package controller;
import model.User;
public interface IUserController {
   void save(User user);
   User findByEmail(String email);
}
