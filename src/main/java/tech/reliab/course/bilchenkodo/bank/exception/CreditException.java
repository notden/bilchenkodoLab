package tech.reliab.course.bilchenkodo.bank.exception;

public class CreditException extends RuntimeException {
	public CreditException() {
		super("Error: can't give credit");
	}

	public CreditException(String msg) {
		super("Error: can't give credit: " + msg);
	}
}