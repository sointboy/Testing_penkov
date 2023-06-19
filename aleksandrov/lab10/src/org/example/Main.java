package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User result = getUserByLoginAndPassword(login,password);

        validateUser(result);

    }
    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "1", 24);
        User user2 = new User("aleksandrov", "takanawu@mail.ru", "123", 17);
        return new User[]{user1,user2};
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
        if (user.getLogin().equals(login)&&user.getPassword().equals(password)){
            System.out.println("логин и пароль совпадают");
            return user;
        }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }
    public static User validateUser(User user) throws AccessDeniedException{
        User[] users = getUsers();
            if (user.getAge()<18){
                throw new AccessDeniedException("Пользователю меньше 18 лет");
            }else {
                System.out.println("Пользователь совершеннолетен");
            }
        return user;
    }
}