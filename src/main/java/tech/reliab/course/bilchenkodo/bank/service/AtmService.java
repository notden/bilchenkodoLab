package tech.reliab.course.bilchenkodo.bank.service;

import java.math.BigDecimal;
import java.util.List;

import tech.reliab.course.bilchenkodo.bank.entity.BankAtm;

public interface AtmService {
    BankAtm create(BankAtm bankAtm);

    public BankAtm getBankAtmById(int id);

    public List<BankAtm> getAllBankAtms();

    boolean depositMoney(BankAtm bankAtm, BigDecimal amount);

    boolean withdrawMoney(BankAtm bankAtm, BigDecimal amount);
}
