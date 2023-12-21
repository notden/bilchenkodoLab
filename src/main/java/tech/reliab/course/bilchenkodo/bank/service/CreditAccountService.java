package tech.reliab.course.bilchenkodo.bank.service;

import tech.reliab.course.bilchenkodo.bank.entity.CreditAccount;

public interface CreditAccountService {
    CreditAccount create(CreditAccount creditAccount);

    boolean makeMontlyPayment(CreditAccount creditAccount);
}
