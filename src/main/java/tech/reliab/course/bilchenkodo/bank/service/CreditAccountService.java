package tech.reliab.course.bilchenkodo.bank.service;

import java.util.List;

import tech.reliab.course.bilchenkodo.bank.entity.CreditAccount;

public interface CreditAccountService {
    CreditAccount create(CreditAccount creditAccount);

    public CreditAccount getCreditAccountById(int id);

    public List<CreditAccount> getAllCreditAccounts();

    boolean makeMontlyPayment(CreditAccount creditAccount);
}
