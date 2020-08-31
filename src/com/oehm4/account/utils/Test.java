package com.oehm4.account.utils;

import java.util.List;

import com.oehm4.account.dao.AccountDAO;
import com.oehm4.account.dto.AccountDTO;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId(102L);
		accountDTO.setMobileNumber(785612355L);
		accountDTO.setAccountHodlerName("Naman");
		accountDTO.setAccountNumber("IND1019083");
		accountDTO.setAddress("India");
		accountDTO.setBalance(102000.5D);
		
		AccountDAO dao = new AccountDAO();
		dao.saveAccountDetails(accountDTO);
		System.out.println("operation succssful");
	}
}
		
