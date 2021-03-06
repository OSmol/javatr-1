package by.javatr.array.entity.exception;

public class InvalidArrayException extends Exception {
    public InvalidArrayException() {
    }

    public InvalidArrayException(String message) {
        super(message);
    }

    public InvalidArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidArrayException(Throwable cause) {
        super(cause);
    }
}
