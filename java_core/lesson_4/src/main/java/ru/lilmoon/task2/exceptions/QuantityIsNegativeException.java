package ru.lilmoon.task2.exceptions;

public class QuantityIsNegativeException extends Exception {
    public QuantityIsNegativeException(String message) {
        super(message);
    }
}