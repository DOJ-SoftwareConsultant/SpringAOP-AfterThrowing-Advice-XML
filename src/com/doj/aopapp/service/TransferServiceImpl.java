/**
 * 
 */
package com.doj.aopapp.service;

/**
 * @author Dinesh.Rajput
 *
 */
public class TransferServiceImpl implements TransferService {
	
	@Override
	public Double checkBalance(String account) {
		System.out.println("Available balance: 50000");
		return new Double(50000);
	}
	
	@Override
	public void transfer(String accountA, String accountB, Long amount) {
		System.out.println(amount+" Amount trasferring from "+accountA+" to "+accountB);
		throw new NullPointerException("Opps something went wrong!!!");
	}

	@Override
	public Long withdrawal(String account, Long amount) {
		System.out.println("Withdrawal amount: " +amount);
		return amount;
	}

	@Override
	public void diposite(String account, Long amount) {
		System.out.println(amount+" Amount has been diposited to "+account);
	}

}
