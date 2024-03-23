package ru.lilmoon.task1;

public class TaskOne {
        /*
    Задача: Проверка логина и пароля
Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
В основном классе программы необходимо по-разному обработать исключения.
Метод возвращает true, если значения верны или false в другом случае.
     */
        public static void main(String[] args) {
            try {
                System.out.println(checkLoginAndPassword("lilmoon","123123","123123"));
            }catch (WrongLoginException | WrongPasswordException e){
                System.out.println(e.getMessage());
            }
        }
    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException{
            int maxLength = 20;
        if (login.length() > maxLength){
            throw new WrongLoginException(String.format("Невалидный логин: %s",login));
        }
        if (password.length() > maxLength){
            throw new WrongPasswordException(String.format("Невалидный пароль: %s",password));
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Неверный пароль!");
        }
        return true;
    }

}
