package tech.reliab.course.bilchenkodo.bank.exception;

public class ExportException extends RuntimeException {
    public ExportException() {
        super("Error: can't export");
    }

    public ExportException(String msg) {
        super("Error: can't export: " + msg);
    }
}
