package com.wallace.admin.catalogo.application;

import com.wallace.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}