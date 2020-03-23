package com.springTest.hibernate.annotation;

import com.springTest.hibernate.validation.ContactNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ContactNumberValidator.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface phone {
    String message() default "Invalid phone number";
    Class<?>[]groups() default {};
    Class<? extends Payload>[]payload() default {};

}
