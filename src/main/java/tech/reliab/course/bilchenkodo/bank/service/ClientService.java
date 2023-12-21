package tech.reliab.course.bilchenkodo.bank.service;

import java.math.BigDecimal;

import tech.reliab.course.bilchenkodo.bank.entity.Client;

public interface ClientService {
    Client create(Client client);

    BigDecimal calculateCreditRating(Client client);
}
