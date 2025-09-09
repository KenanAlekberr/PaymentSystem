package main.enums;

public enum ExceptionStatus {
    AUTHORIZED(200, "Payment has been authorized."),
    CAPTURED(201, "Payment has been captured."),
    REFUNDED(202, "Payment has been refunded."),
    FAILED(500, "Payment has failed.");

    private final int statusCode;
    private final String message;

    ExceptionStatus(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public static ExceptionStatus fromCode(int code) {
        for (ExceptionStatus status : ExceptionStatus.values()) {
            if (status.statusCode == code)
                return status;
        }
        throw new IllegalArgumentException("\nInvalid ExceptionStatus code: " + code);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}