package tech.reliab.course.bilchenkodo.bank.service;

import java.util.List;

import tech.reliab.course.bilchenkodo.bank.entity.CreditAccount;
import tech.reliab.course.bilchenkodo.bank.exception.NotEnoughMoneyException;
import tech.reliab.course.bilchenkodo.bank.exception.NotFoundException;
import tech.reliab.course.bilchenkodo.bank.exception.NotUniqueIdException;

public interface CreditAccountService {
    CreditAccount create(CreditAccount creditAccount) throws NotFoundException, NotUniqueIdException;

    public CreditAccount getCreditAccountById(int id) throws NotFoundException;

    public List<CreditAccount> getAllCreditAccounts();

    boolean makeMontlyPayment(CreditAccount creditAccount) throws NotEnoughMoneyException;
}
