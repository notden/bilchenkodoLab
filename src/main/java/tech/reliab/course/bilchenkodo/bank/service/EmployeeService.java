package tech.reliab.course.bilchenkodo.bank.service;

import java.util.List;

import tech.reliab.course.bilchenkodo.bank.entity.BankOffice;
import tech.reliab.course.bilchenkodo.bank.entity.Employee;
import tech.reliab.course.bilchenkodo.bank.exception.NotFoundException;
import tech.reliab.course.bilchenkodo.bank.exception.NotUniqueIdException;

public interface EmployeeService {
    Employee create(Employee employee) throws NotFoundException, NotUniqueIdException;

    public Employee getEmployeeById(int id) throws NotFoundException;

    public List<Employee> getAllEmployees();

    boolean transferEmployee(Employee employee, BankOffice bankOffice);

    public boolean isEmployeeSuitable(Employee employee);
}
