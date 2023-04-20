package com.wallace.admin.catalogo.domain.exceptions;

import com.wallace.admin.catalogo.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStackTraceException{
private final List<Error> errors;
    private DomainException(final String message, final List<Error> anErrors) {
        super(message);
        this.errors = anErrors;
    }

    public static DomainException with(final Error anError) {
        return new DomainException(anError.message(), List.of(anError));
    }

    public static DomainException with(final List<Error> anErrors) {
        return new DomainException("", anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}
