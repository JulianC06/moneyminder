package com.julian.moneyminder.repositories;

import com.julian.moneyminder.models.Budget;
import com.julian.moneyminder.models.Category;
import com.julian.moneyminder.models.Subcategory;
import com.julian.moneyminder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    List<Budget> findByUser(User user);
    List<Budget> findByUserAndCategory(User user, Category category);
    List<Budget> findByUserAndSubcategory(User user, Subcategory subcategory);
}
