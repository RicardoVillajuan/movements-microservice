package com.bank.entity;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "movement")
public class Movement {
	
	@Id
	private String id;
	private String idcustomer;
	private String idproduct;
	private String nameproduct;
	private String typemovement;
	private Double commissioncharged;//comision cobrada
	private Long ammount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
}
