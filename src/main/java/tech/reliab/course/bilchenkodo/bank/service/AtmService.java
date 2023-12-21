package tech.reliab.course.bilchenkodo.bank.service;

import java.math.BigDecimal;

import tech.reliab.course.bilchenkodo.bank.entity.BankAtm;

public interface AtmService {
    BankAtm create(BankAtm bankAtm);

    boolean depositMoney(BankAtm bankAtm, BigDecimal amount);

    boolean withdrawMoney(BankAtm bankAtm, BigDecimal amount);
}
