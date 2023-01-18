package com.springboot.webclient;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
	private int bookingId;
	private String userName;
	private String showName;
	private Date bookingTime;
	private int userCount;
	private double price;

}
