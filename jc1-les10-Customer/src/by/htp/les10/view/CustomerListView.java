package by.htp.les10.view;

import java.util.List;

import by.htp.les10.entity.Customer;


public class CustomerListView {
	public void printAll(String massage, List<Customer> customers) {
		System.out.println("--------------------------------------");
		System.out.println("massage");
		System.out.println("--------------------------------------");
		
		for(int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			System.out.println(customer.toString());
		}
	}

}
