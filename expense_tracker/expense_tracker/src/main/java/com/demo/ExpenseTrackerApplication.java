package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.model.Expense;
import com.demo.repository.ExpenseRepository;
import com.demo.service.ExpenseService;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExpenseTrackerApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(ExpenseTrackerApplication.class, args);
	ExpenseRepository er = context.getBean(ExpenseRepository.class);
	
    Expense ex = new Expense();
    // to add the expenses 
//    ex.getId();
//    ex.setName("Maintenance");
//    ex.setAmount(1000.00);
//    ex.setCategory("Utilities");
//    ex.setDate(java.time.LocalDate.now());
//   System.out.println(er.save(ex));
//    System.out.println("Expenses added successfully!");
 // *******************************************************************************   
    
 // Fetch the expense by ID & update 
//    Long updateId = 7L;  // Update expense with ID 1
//    Expense existingExpense = er.findById(updateId).orElse(null);
//
//    if (existingExpense != null) {
//        existingExpense.setName("Orders");
//        existingExpense.setAmount(1500.00);  // Updated amount
//        er.save(existingExpense);
//
//        System.out.println("Expense updated successfully!");
//    } else {
//        System.out.println("Expense not found!");
//    }
  // ****************************************************************************************
    
    // to show all expenses 
//    Iterable<Expense> expenses = er.findAll();
//    System.out.println("\n--- All Expenses ---");
//    for (Expense e : expenses) {
//        System.out.println("ID: " + e.getId());
//        System.out.println("Name: " + e.getName());
//        System.out.println("Amount: " + e.getAmount());
//        System.out.println("Description: " + e.getCategory());
//        System.out.println("Date: " + e.getDate());
//        System.out.println("------------------------");
//    }
//	*****************************************************************************************
    
    // delete expenses 
    Long deleteId = 3L;  // Expense ID to delete
    if (er.existsById(deleteId)) {
        er.deleteById(deleteId);
        System.out.println("Expense deleted successfully!");
    } else {
        System.out.println("Expense not found!");
    }

	}

}
