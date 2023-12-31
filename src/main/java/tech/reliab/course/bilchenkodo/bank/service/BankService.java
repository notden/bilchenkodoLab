package tech.reliab.course.bilchenkodo.bank.service;

import java.math.BigDecimal;
import java.util.List;


import tech.reliab.course.bilchenkodo.bank.entity.Bank;
import tech.reliab.course.bilchenkodo.bank.entity.BankOffice;
import tech.reliab.course.bilchenkodo.bank.entity.CreditAccount;
import tech.reliab.course.bilchenkodo.bank.entity.Employee;
import tech.reliab.course.bilchenkodo.bank.exception.CreditException;
import tech.reliab.course.bilchenkodo.bank.exception.NotEnoughMoneyException;
import tech.reliab.course.bilchenkodo.bank.exception.NotFoundException;
import tech.reliab.course.bilchenkodo.bank.exception.NotUniqueIdException;
import tech.reliab.course.bilchenkodo.bank.entity.Client;

public interface BankService {
    // Создание банка
    public Bank create(Bank bank) throws NotFoundException, NotUniqueIdException;

    // Возвращает банк по его ID
    public Bank getBankById(int bankId) throws NotFoundException;

    // Установка сервиса для управления офисами
    public void setBankOfficeService(BankOfficeService bankOfficeService);

    // Получение всех офисов банка с заданным ID
    public List<BankOffice> getAllOfficesByBankId(int id) throws NotFoundException;

    // Установка сервиса для управления клиентами
    public void setClientService(ClientService bankOfficeService);

    // Удаляет банк по его ID
    public boolean deleteBankById(int bankId) throws NotFoundException;

    // Возвращает все банки
    public List<Bank> getAllBanks();

    // Вывод данных о банке с заданным ID
    public void printBankData(int bankId) throws NotFoundException;

    // Добавление офиса
    public boolean addOffice(int bankId, BankOffice bankOffice) throws NotFoundException;

    // Добавление сотрудника
    public boolean addEmployee(Bank bank, Employee employee);

    // Добавление клиента
    public boolean addClient(int id, Client client) throws NotFoundException;

    // Расчет процентной ставки банка
    public BigDecimal calculateInterestRate(Bank bank);

    // Внести amount денег в банк
    public boolean depositMoney(int id, BigDecimal amount) throws NotFoundException;

    // Вывести amount денег из банка
    public boolean withdrawMoney(int id, BigDecimal amount) throws NotFoundException, NotEnoughMoneyException;

    // Оформление заявки на кредит
    public boolean approveCredit(Bank bank, CreditAccount account, Employee employee) throws CreditException;

    // Возвращает банки, подходящие для выдачи кредита с указанной суммой и
    // длительностью
    public List<Bank> getBanksSuitable(BigDecimal sum, int countMonth) throws NotFoundException, CreditException;

    // Подходит ли банк для выдачи суммы
    public boolean isBankSuitable(Bank bank, BigDecimal money) throws NotFoundException;

    // Возвращает список офисов, подходящих для выдачи указанной суммы в банке
    public List<BankOffice> getBankOfficeSuitableInBank(Bank bank, BigDecimal money) throws NotFoundException;

    // Переводит клиента в другой банк
    public boolean transferClient(Client client, int newBankId);
}
