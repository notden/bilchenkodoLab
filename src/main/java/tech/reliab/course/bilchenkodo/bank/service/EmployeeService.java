package tech.reliab.course.bilchenkodo.bank.service;

import tech.reliab.course.bilchenkodo.bank.entity.BankOffice;
import tech.reliab.course.bilchenkodo.bank.entity.Employee;

public interface EmployeeService {
    Employee create(Employee employee);

    boolean transferEmployee(Employee employee, BankOffice bankOffice);
}
