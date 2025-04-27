package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Expense;
import com.demo.service.ExpenseService;


@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins="*") //// To connect with frontend
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	//get all expenses
	@GetMapping
	public List<Expense> getAllExpenses(){
		return expenseService.getAllExpenses();
		
	}
	
	//get expense by ID
	@GetMapping("/{id}")
	public Optional<Expense> getExpenseById(@PathVariable Long id){
		return expenseService.getExpenseById(id);
	}
	
	 // Add new expense
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }
    
    // Update expense
    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id, @RequestBody Expense expense) {
        return expenseService.updateExpense(id, expense);
    }
    
 // Delete expense
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }

}
