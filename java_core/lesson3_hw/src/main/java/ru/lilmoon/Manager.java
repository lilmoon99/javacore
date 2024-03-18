package ru.lilmoon;

import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employee{
    public Manager(String surname, String name, String middleName, String position, String phoneNumber, int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
    }
    public static void raiseDefiniteEmployeeSalary(Employee employee,int raisedSalary){

        if (!(employee instanceof Manager)){
            employee.setSalary(raisedSalary);
        }else System.out.println("Can't raise manager's salary.");
    }

    public static void raiseAllEmployeesSalary(ArrayList<Employee> employeeList, double raiseCoefficient){
        for (Employee employee : employeeList) {
            if (!(employee instanceof Manager)){
                employee.setSalary((int) (employee.getSalary()*(1+raiseCoefficient)));
            }
        }
    }

    public void assign(Employee employee,Task task){
        employee.assign(task);
    }
}
