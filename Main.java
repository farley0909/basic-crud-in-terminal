
import java.util.Scanner;
import view.Menu;
public class Main {
    public static void main(String[] args) {
        int option;
        Scanner scan  = new Scanner(System.in);
        Menu menu = new Menu();
        option = menu.show();
        switch(option){
            case 1:
               menu.viewCreateUser();
            break;
            case 2:
                System.out.println("List user");
            break;
            case 3:
                System.out.println("Delete User");
            break;
        }
    }
}
