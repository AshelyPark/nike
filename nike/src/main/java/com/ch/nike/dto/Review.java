package com.ch.nike.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("Review")
public class Review {
	private int review_no;
	private int product_no;
	private String email;
	private String content;
	private int star;
	private String review_date;
	private String review_del;
}
