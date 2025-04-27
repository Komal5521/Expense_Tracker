package com.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Represents the table in the database.
@Data  //Auto-generates getter, setter, and toString methods.
@NoArgsConstructor  //Reduces boilerplate code.
@AllArgsConstructor
@Table(name="expenses") //Defines the table name as expenses.
public class Expense {
	@Id //Primary key for unique identification.
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long id;
	private String name;
	private String category;
	private Double amount;
	private LocalDate date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

}
