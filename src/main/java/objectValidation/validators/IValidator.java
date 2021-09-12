package objectValidation.validators;

public interface IValidator<E> {
    boolean isValid(E e) throws IllegalAccessException;
}
