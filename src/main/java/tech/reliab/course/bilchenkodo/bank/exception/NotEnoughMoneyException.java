package tech.reliab.course.bilchenkodo.bank.exception;

public class NotEnoughMoneyException extends RuntimeException {
	public NotEnoughMoneyException() {
		super("Error: not enough money");
	}
}