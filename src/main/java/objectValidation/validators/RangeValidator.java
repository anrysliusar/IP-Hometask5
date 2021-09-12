package objectValidation.validators;

import objectValidation.annotations.Range;

import java.lang.reflect.Field;

public class RangeValidator<E> implements IValidator<E> {
    @Override
    public boolean isValid(E e) throws IllegalAccessException {
        Field[] declaredFields = e.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Range.class)) {
                int min = field.getAnnotation(Range.class).min();
                int max = field.getAnnotation(Range.class).max();
                if (!(min <= (int) field.get(e) && max >= (int) field.get(e))) {
                    return false;
                }
            }
        }
        return true;
    }
}
