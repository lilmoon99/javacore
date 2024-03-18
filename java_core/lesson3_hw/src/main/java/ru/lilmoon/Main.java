package ru.lilmoon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = initEmployeeArrayList();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Manager.raiseAllEmployeesSalary(employees,0.2);
        System.out.println("---------------------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static ArrayList<Employee> initEmployeeArrayList(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Ivanov", "Ivan", "Ivanovich",
                "backend-developer", "+7-999-888-77-66", 100,
                LocalDate.of(1940, 10, 17)));
        employees.add(new Worker("Petrov", "Ivan", "Pavlovich", "backend-developer",
                "+7-999-111-22-66", 80000,
                LocalDate.of(1969, 11, 17)));
        employees.add(new Worker("Pavlov", "Ivan", "Pavlovich", "QA engineer",
                "+7-999-111-22-66", 120000,
                LocalDate.of(1980, 11, 17)));
        employees.add(new Worker("Denisov", "Ivan", "Pavlovich", "backend-developer",
                "+7-999-111-22-66", 125000,
                LocalDate.of(1962, 11, 17)));
        employees.add(new Worker("Nosov", "Oleg", "Pavlovich", "frontend-developer",
                "+7-999-111-22-66", 70000,
                LocalDate.of(1970, 11, 17)));
        employees.add(new Manager("Shamsullin","Aynur","Damirovich","super admin", "+79911944602",160000, LocalDate.of(1999,1,25)));
        return employees;
    }
}