package tech.reliab.course.bilchenkodo.bank.service;

import java.math.BigDecimal;

import tech.reliab.course.bilchenkodo.bank.entity.BankAtm;
import tech.reliab.course.bilchenkodo.bank.entity.BankOffice;
import tech.reliab.course.bilchenkodo.bank.entity.Employee;

public interface BankOfficeService {
    BankOffice create(BankOffice bankOffice);

    boolean installAtm(BankOffice bankOffice, BankAtm bankAtm);

    boolean removeAtm(BankOffice bankOffice, BankAtm bankAtm);

    boolean depositMoney(BankOffice bankOffice, BigDecimal amount);

    boolean withdrawMoney(BankOffice bankOffice, BigDecimal amount);

    boolean addEmployee(BankOffice bankOffice, Employee employee);

    boolean removeEmployee(BankOffice bankOffice, Employee employee);
}
