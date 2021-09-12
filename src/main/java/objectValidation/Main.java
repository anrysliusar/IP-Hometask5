package objectValidation;

import objectValidation.validators.NotNullValidator;
import objectValidation.validators.RangeValidator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Name", "email@mail.com", -10);
        var userRangeValidator = new RangeValidator<User>();
        var userNotNullValidator = new NotNullValidator<User>();
        System.out.println(userRangeValidator.isValid(user)); //false
        System.out.println(userNotNullValidator.isValid(user)); //true
    }
}
