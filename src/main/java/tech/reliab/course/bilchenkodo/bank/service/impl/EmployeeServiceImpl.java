package tech.reliab.course.bilchenkodo.bank.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tech.reliab.course.bilchenkodo.bank.entity.BankOffice;
import tech.reliab.course.bilchenkodo.bank.entity.Employee;
import tech.reliab.course.bilchenkodo.bank.exception.NotFoundException;
import tech.reliab.course.bilchenkodo.bank.exception.NotUniqueIdException;
import tech.reliab.course.bilchenkodo.bank.service.BankOfficeService;
import tech.reliab.course.bilchenkodo.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    private final Map<Integer, Employee> employeesTable = new HashMap<>();
    private final BankOfficeService bankOfficeService;

    public EmployeeServiceImpl(BankOfficeService bankOfficeService) {
        this.bankOfficeService = bankOfficeService;
    }

    @Override
    public Employee create(Employee employee) throws NotFoundException, NotUniqueIdException {
        if (employee == null) {
            return null;
        }

        if (employee.getSalary().signum() < 0) {
            System.err.println("Error: Employee - salary must be non-negative");
            return null;
        }

        Employee newEmployee = new Employee(employee);
        if (employeesTable.containsKey(newEmployee.getId())) {
            throw new NotUniqueIdException(newEmployee.getId());
        }
        employeesTable.put(newEmployee.getId(), newEmployee);
        bankOfficeService.addEmployee(newEmployee.getBankOffice().getId(), newEmployee);

        return newEmployee;
    }

    @Override
    public boolean transferEmployee(Employee employee, BankOffice bankOffice) {
        return true;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<Employee>(employeesTable.values());
    }

    @Override
    public Employee getEmployeeById(int id) throws NotFoundException {
        Employee employee = employeesTable.get(id);
        if (employee == null) {
            System.err.println("Employee with id " + id + " is not found");
            throw new NotFoundException(id);
        }
        return employee;
    }

    @Override
    public boolean isEmployeeSuitable(Employee employee) {
        return employee.getIsCreditAvailable();
    }

}
