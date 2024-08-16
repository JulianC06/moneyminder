package com.julian.moneyminder.repositories;

import com.julian.moneyminder.models.Category;
import com.julian.moneyminder.models.Subcategory;
import com.julian.moneyminder.models.Transaction;
import com.julian.moneyminder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserAndCategory(User user, Category category);
    List<Transaction> findByUser(User user);
    List<Transaction> findByUserAndSubcategory(User user, Subcategory subcategory);
}
