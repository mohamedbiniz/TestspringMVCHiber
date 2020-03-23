package com.springTest.hibernate.validation;

import com.springTest.hibernate.annotation.phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<phone, String> {
   public void initialize(phone constraint) {
   }

   public boolean isValid(String obj, ConstraintValidatorContext context) {
         return obj != null && obj.matches("[0-9]+")
                 && (obj.length() >= 10) && (obj.length() <= 14);
   }
}
