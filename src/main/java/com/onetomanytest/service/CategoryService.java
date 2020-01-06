package com.onetomanytest.service;


import com.onetomanytest.domain.Category;

import java.util.Optional;

public interface CategoryService {
    Category save(Category category);
    Optional<Category> findById(Long id);
}
