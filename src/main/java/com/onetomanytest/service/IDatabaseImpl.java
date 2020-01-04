package com.onetomanytest.service;

import com.onetomanytest.domain.Category;
import com.onetomanytest.domain.Product;
import com.onetomanytest.repository.CategoryRepository;
import com.onetomanytest.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IDatabaseImpl implements IDatabase {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public IDatabaseImpl(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public void createDatabase() {
        Category c1 = new Category();
        c1.setName("Fruits");

        Category c2 = new Category();
        c2.setName("Meats");

        Product p1 = new Product("Apple", 23, 2000);
        Product p2 = new Product("Apple", 23, 2000);
        Product p3 = new Product("Apple", 23, 2000);
        Product p4 = new Product("Apple", 23, 2000);

        p1.setCategory(c1);
        p2.setCategory(c1);
        p3.setCategory(c2);
        p4.setCategory(c2);

        categoryRepository.save(c1);
        categoryRepository.save(c2);

        productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);
    }
}
