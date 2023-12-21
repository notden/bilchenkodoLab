package tech.reliab.course.bilchenkodo.bank.exception;

public class NotUniqueIdException extends RuntimeException {
	public NotUniqueIdException(int id) {
		super("Error: entity with id=" + id + " already exists");
	}
}