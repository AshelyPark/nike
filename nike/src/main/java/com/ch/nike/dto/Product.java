package com.ch.nike.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("Product")
public class Product {
	private int productNo;
	private String productName;
	private int categoryNo;
	private int price;
	private String detail;
	private String gender;

	// 조인용
	// 이렇게 해도 되는데 ProductPhoto 클래스 자체를 넣어도 될듯?? //맞네? 그랬네?? ㅋㅋ
	// private ProductPhoto productPhoto	by 해민
	private int batch;
	private String productPhoto;
	private String color;
	private String productSize;
<<<<<<< HEAD
	private int stock;
	private String productDetailNo;
	private String email;
	private String name;
	
=======
	private Address address;
	private UserOrderDetail userOrderDetail;
	private Refund refund;
>>>>>>> 5ac0323 (위시리스트, 장바구니, 주문내역(+환불) 일단 완료)

}
