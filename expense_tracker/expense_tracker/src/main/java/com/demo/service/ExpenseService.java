package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Expense;
import com.demo.repository.ExpenseRepository;
import com.demo.service.ExpenseService;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepository;

	//fetch all expenses
	public List<Expense> getAllExpenses() {
		return expenseRepository.findAll();
	}

	 // Get expense by ID
	public Optional<Expense> getExpenseById(Long id) {
		return expenseRepository.findById(id);
	}
	
	 // Add new expense
	public Expense saveExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	 // Update expense
	public Expense updateExpense(Long id, Expense updatedExpense) {
		if (expenseRepository.existsById(id)) {
            updatedExpense.setId(id);
			return expenseRepository.save(updatedExpense);
       }
		return null;
	}

	// Delete expense
	public void deleteExpense(Long id) {
		 expenseRepository.deleteById(id);
		
	}

}
