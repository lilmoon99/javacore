package ru.lilmoon;

import java.time.LocalDate;

public class Worker extends Employee{
    public Worker(String surname, String name, String middleName, String position, String phoneNumber, int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
    }
}
