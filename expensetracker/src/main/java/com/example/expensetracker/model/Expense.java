package com.example.expensetracker.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data                  //not in code of b2Tech
@Builder               //not in code of b2Tech
@NoArgsConstructor     //not in code of b2Tech
@AllArgsConstructor    //not in code of b2Tech 
@Table(name="tbl_expenses")
//@Setter               //not required
//@Getter               //not required
public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String expense;
	
	private String description;
	
	private BigDecimal amount;
}