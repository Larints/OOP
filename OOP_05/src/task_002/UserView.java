package task_002;

import java.util.Scanner;

public class UserView {

    Scanner in =  new Scanner(System.in);
    public void greetings() {
        System.out.println("Добро пожаловать в социальную сеть \"Храбрые котята\"");
    }

    public String setUser() {
        System.out.println("Введите ваше имя: ");
        return in.nextLine();
    }
}
