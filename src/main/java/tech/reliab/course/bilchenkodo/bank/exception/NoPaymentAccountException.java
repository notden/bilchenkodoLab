package tech.reliab.course.bilchenkodo.bank.exception;

public class NoPaymentAccountException extends RuntimeException {
	public NoPaymentAccountException() {
		super("Error: can't find payment account");
	}
}