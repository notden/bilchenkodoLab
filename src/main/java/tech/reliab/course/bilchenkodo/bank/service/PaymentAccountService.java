package tech.reliab.course.bilchenkodo.bank.service;

import java.math.BigDecimal;
import java.util.List;

import tech.reliab.course.bilchenkodo.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    PaymentAccount create(PaymentAccount paymentAccount);

    public void printPaymentData(int id);

    public PaymentAccount getPaymentAccountById(int id);

    public List<PaymentAccount> getAllPaymentAccounts();

    boolean depositMoney(PaymentAccount paymentAccount, BigDecimal amount);

    boolean withdrawMoney(PaymentAccount paymentAccount, BigDecimal amount);
}
