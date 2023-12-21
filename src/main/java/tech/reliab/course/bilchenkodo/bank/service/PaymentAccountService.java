package tech.reliab.course.bilchenkodo.bank.service;

import java.math.BigDecimal;

import tech.reliab.course.bilchenkodo.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    PaymentAccount create(PaymentAccount paymentAccount);

    boolean depositMoney(PaymentAccount paymentAccount, BigDecimal amount);

    boolean withdrawMoney(PaymentAccount paymentAccount, BigDecimal amount);
}
