package com.pedrosts.dev.course.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPER(3),
    DELIVERED(4),
    CANCELED(5);

    private final int CODE;

    OrderStatus(int code) {
        this.CODE = code;
    }

    public int getCode() {
        return CODE;
    }

    public static OrderStatus valueOf(int code) throws IllegalArgumentException {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid status code");
    }
}
