package tech.reliab.course.bilchenkodo.bank.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.google.gson.annotations.Expose;

public class CreditAccount extends Account {
    @Expose(serialize = true)
    private LocalDate dateStart;
    @Expose(serialize = true)
    private LocalDate dateEnd;
    @Expose(serialize = true)
    private int monthCount;
    @Expose(serialize = true)
    private BigDecimal creditAmount;
    @Expose(serialize = true)
    private BigDecimal remainingCreditAmount;
    @Expose(serialize = true)
    private BigDecimal montlyPayment;
    @Expose(serialize = true)
    private BigDecimal interestRate;
    @Expose(serialize = true)
    private Employee employee;
    @Expose(serialize = true)
    private PaymentAccount paymentAccount;

    public CreditAccount() {
        super();
        initWithDefaults();
    }

    public CreditAccount(CreditAccount creditAccount) {
        super(creditAccount.id, creditAccount.client, creditAccount.bank);
        this.dateStart = creditAccount.dateStart;
        this.dateEnd = creditAccount.dateEnd;
        this.monthCount = creditAccount.monthCount;
        this.creditAmount = creditAccount.creditAmount;
        this.remainingCreditAmount = creditAccount.remainingCreditAmount;
        this.montlyPayment = creditAccount.montlyPayment;
        this.interestRate = creditAccount.interestRate;
        this.employee = new Employee(creditAccount.employee);
        this.paymentAccount = new PaymentAccount(creditAccount.paymentAccount);
    }

    public CreditAccount(Client client, Bank bank, LocalDate dateStart, LocalDate dateEnd, int monthCount,
            BigDecimal creditAmount, BigDecimal remainingCreditAmount, BigDecimal montlyPayment,
            BigDecimal interestRate, Employee employee, PaymentAccount paymentAccount) {
        super(client, bank);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.monthCount = monthCount;
        this.creditAmount = creditAmount;
        this.remainingCreditAmount = remainingCreditAmount;
        this.montlyPayment = montlyPayment;
        this.interestRate = interestRate;
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    public CreditAccount(int id, Client client, Bank bank, LocalDate dateStart, LocalDate dateEnd, int monthCount,
            BigDecimal creditAmount, BigDecimal remainingCreditAmount, BigDecimal montlyPayment,
            BigDecimal interestRate, Employee employee, PaymentAccount paymentAccount) {
        super(id, client, bank);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.monthCount = monthCount;
        this.creditAmount = creditAmount;
        this.remainingCreditAmount = remainingCreditAmount;
        this.montlyPayment = montlyPayment;
        this.interestRate = interestRate;
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    public CreditAccount(Client client, Bank bank, LocalDate dateStart, int monthCount,
            BigDecimal creditAmount, BigDecimal montlyPayment,
            BigDecimal interestRate, Employee employee, PaymentAccount paymentAccount) {
        super(client, bank);
        this.dateStart = dateStart;
        this.dateEnd = dateStart.plusMonths(monthCount);
        this.monthCount = monthCount;
        this.creditAmount = creditAmount;
        this.remainingCreditAmount = creditAmount;
        this.montlyPayment = montlyPayment;
        this.interestRate = interestRate;
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    @Override
    public String toString() {
        return "CreditAccount:{" +
                "\n account='" + super.toString() + "'" +
                ",\n dateStart='" + getDateStart() + "'" +
                ",\n dateEnd='" + getDateEnd() + "'" +
                ",\n monthCount='" + getMonthCount() + "'" +
                ",\n creditAmount='" + String.format("%.2f", getCreditAmount()) + "'" +
                ",\n remainingCreditAmount='" + String.format("%.2f", getRemainingCreditAmount()) + "'" +
                ",\n montlyPayment='" + String.format("%.2f", getMonthlyPayment()) + "'" +
                ",\n interestRate='" + String.format("%.2f", getInterestRate()) + "'" +
                ",\n employee=" + getEmployee() +
                ",\n paymentAccount=" + getPaymentAccount() +
                "\n}";
    }

    public LocalDate getDateStart() {
        return this.dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getMonthCount() {
        return this.monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    public BigDecimal getCreditAmount() {
        return this.creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getRemainingCreditAmount() {
        return this.remainingCreditAmount;
    }

    public void setRemainingCreditAmount(BigDecimal remainingCreditAmount) {
        this.remainingCreditAmount = remainingCreditAmount;
    }

    public BigDecimal getMonthlyPayment() {
        return this.montlyPayment;
    }

    public void setMontlyPayment(BigDecimal montlyPayment) {
        this.montlyPayment = montlyPayment;
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    private void initWithDefaults() {
        dateStart = null;
        dateEnd = null;
        monthCount = 0;
        creditAmount = new BigDecimal("0");
        remainingCreditAmount = new BigDecimal("0");
        montlyPayment = new BigDecimal("0");
        interestRate = new BigDecimal("0");
        employee = null;
        paymentAccount = null;
    }

}
