package objectValidation.validators;

import objectValidation.annotations.NotNull;

import java.lang.reflect.Field;

public class NotNullValidator<E> implements IValidator<E> {

    @Override
    public boolean isValid(E e) throws IllegalAccessException {
        Field[] declaredFields = e.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class))
                if (field.get(e) == null){
                    System.out.println(field.getAnnotation(NotNull.class).message());
                    return false;
                }
        }
        return true;
    }
}
