package com.julian.moneyminder.repositories;

import com.julian.moneyminder.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
