package cybersoft.javabackend.java16girakminh.user.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import cybersoft.javabackend.java16girakminh.user.validation.validator.UniqueEmailValidator;
import cybersoft.javabackend.java16girakminh.user.validation.validator.UniqueUsernameValidator;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueEmailValidator.class)
public @interface UniqueEmail {
	String message() default "Email already used";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
