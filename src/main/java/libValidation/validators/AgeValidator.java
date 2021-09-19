package libValidation.validators;

import libValidation.User;
import libValidation.annotations.Age;
import objectValidation.validators.IValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
    private static int min = 0;
    private static int max = 120;

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer != null && integer >= min && integer <=max;
    }
}
