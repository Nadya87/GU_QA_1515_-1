package Lesson8;

import Lesson8.UserInterface;

public class Application {
    public static void main(String[] args) {

        IUserInterface ui = new UserInterface();

        ui.showMenu();


    }
}
