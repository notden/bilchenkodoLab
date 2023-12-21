package tech.reliab.course.bilchenkodo.bank.exception;

public class NotFoundException extends RuntimeException {
	public NotFoundException(int id) {
		super("Error: entity with id=" + id + " doesn't exist");
	}
}
