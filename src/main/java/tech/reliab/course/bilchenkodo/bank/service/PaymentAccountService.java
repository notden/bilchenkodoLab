package tech.reliab.course.bilchenkodo.bank.service;

import java.math.BigDecimal;
import java.util.List;

import tech.reliab.course.bilchenkodo.bank.entity.PaymentAccount;
import tech.reliab.course.bilchenkodo.bank.exception.NotEnoughMoneyException;
import tech.reliab.course.bilchenkodo.bank.exception.NotFoundException;
import tech.reliab.course.bilchenkodo.bank.exception.NotUniqueIdException;

public interface PaymentAccountService {
    PaymentAccount create(PaymentAccount paymentAccount) throws NotFoundException, NotUniqueIdException;

    public void printPaymentData(int id) throws NotFoundException;

    public PaymentAccount getPaymentAccountById(int id) throws NotFoundException;

    public List<PaymentAccount> getAllPaymentAccounts();

    boolean depositMoney(PaymentAccount paymentAccount, BigDecimal amount);

    boolean withdrawMoney(PaymentAccount paymentAccount, BigDecimal amount) throws NotEnoughMoneyException;

    public BigDecimal getTotalMoney(int id) throws NotFoundException;
}
