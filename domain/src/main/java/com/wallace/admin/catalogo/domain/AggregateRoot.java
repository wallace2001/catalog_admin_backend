package com.wallace.admin.catalogo.domain;

import com.wallace.admin.catalogo.domain.validation.ValidationHandler;

public class AggregateRoot<ID extends Identifier> extends Entity<ID>{

    public AggregateRoot(final ID id) {
        super(id);
    }

    @Override
    public void validate(ValidationHandler handler) {

    }
}
