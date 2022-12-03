package view;
import java.util.Scanner;

import controller.IUserController;
import controller.UserController;
import model.User;
public class Menu {
    
    public int show(){
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.println("----------- Menu ------------");
        System.out.println("1 - Create user");
        System.out.println("2 - List users");
        System.out.println("3 - Delete user");
        System.out.println("-------------------------------");
        System.out.print("Type an option: ");
        option = scan.nextInt();
        return option;
    }
    public void viewCreateUser(){
        String name, password, email;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n----------- Create User ------------");
        System.out.print("Type the user nme: ");
        name = scan.nextLine();
        System.out.print("Type the user email: ");
        email = scan.nextLine();
        System.out.print("Type the user password: ");
        password = scan.nextLine();
        User user = new User(name, email, password);
        UserController controller = new UserController();
        controller.save(user);
    }
}