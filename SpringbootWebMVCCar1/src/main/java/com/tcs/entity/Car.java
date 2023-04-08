package com.tcs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Cartbl")
public class Car {
	@Id
	private Integer cid;
	private String cname;
	private Double price;

}
