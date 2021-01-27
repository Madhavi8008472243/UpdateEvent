package com.bankapp.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="TRANSACTIONAL_LOG_Table")
@Data
public class TransactionLog {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int txLogId;
   private String type;
   private String fromAccount;
   private String toAccount;
   private String transactionDetails;
   private LocalDateTime timestamp;
   private boolean status;

public TransactionLog(String type, String fromAccount, String toAccount, String transactionDetails,
		LocalDateTime timestamp, boolean status) {
	this.type = type;
	this.fromAccount = fromAccount;
	this.toAccount = toAccount;
	this.transactionDetails = transactionDetails;
	this.timestamp = timestamp;
	this.status = status;
}

public TransactionLog(String type, int fromid, int toid, String transactionalDetails) {
	// TODO Auto-generated constructor stub
}

   
}
