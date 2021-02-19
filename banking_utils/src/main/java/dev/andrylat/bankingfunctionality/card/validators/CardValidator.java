package dev.andrylat.bankingfunctionality.card.validators;

import dev.andrylat.bankingfunctionality.card.exceptions.CardValidatorException;

public interface CardValidator {
    boolean validate(String input) throws CardValidatorException;
}