package com.ltp.workbook.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userNameValidator implements ConstraintValidator<Username, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile("[^a-z0-9 ]");
        Matcher matcher = pattern.matcher(value);
        return !(matcher.find()); //false if characters are a-z or 0-9
    }
}
