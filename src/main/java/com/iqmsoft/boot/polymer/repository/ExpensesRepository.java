package com.iqmsoft.boot.polymer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.boot.polymer.domain.Expense;
import com.iqmsoft.boot.polymer.domain.User;

import java.util.List;

public interface ExpensesRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByUserOrderByDateDesc(User user);
}
