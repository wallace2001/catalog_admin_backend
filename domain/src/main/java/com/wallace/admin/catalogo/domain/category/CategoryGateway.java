package com.wallace.admin.catalogo.domain.category;

import com.wallace.admin.catalogo.domain.Pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category create(Category aCategory);
    Category update(Category aCategory);
    void deleteById(CategoryID anId);
    Optional<Category> findById(CategoryID anId);
    Pagination<Category> findAll(CategorySearchQuery aQuery);

}
