package com.wallace.admin.catalogo.domain.category;

import com.wallace.admin.catalogo.domain.validation.Error;
import com.wallace.admin.catalogo.domain.validation.ValidationHandler;
import com.wallace.admin.catalogo.domain.validation.Validator;

public class CategoryValidator extends Validator {

    public static final int NAME_MAX_LENGTH = 255;
    public static final int NAME_MIN_LENGTH = 3;
    private final Category category;

    public CategoryValidator(final Category category, final ValidationHandler handler) {
        super(handler);
        this.category = category;
    }
    @Override
    public void validate() {
        checkNameConstraints();
    }

    private void checkNameConstraints() {
        String name = this.category.getName();
        if (name == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
            return;
        }

        if (name.trim().isBlank()) {
            this.validationHandler().append(new Error("'name' should not be empty"));
            return;
        }

        final int length = name.trim().length();
        if (length > NAME_MAX_LENGTH || length < NAME_MIN_LENGTH) {
            this.validationHandler().append(new Error("'name' must be between 3 and 25 characters"));
        }
    }
}
