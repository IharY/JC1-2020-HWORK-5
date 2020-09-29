package by.htp.les10.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.les10.entity.Customer;
import by.htp.les10.entity.CustomerList;

public class CustomerListLogic {
	
	public List<Customer> sortArray (CustomerList customerList){
		List<Customer> customers = customerList.getCustomers();
		Collections.sort(customers, new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				return o1.getSurname().compareTo(o2.getSurname());
			}
		});
		
		return customers;
	}
	
	public List<Customer> creditCardNumbersInInterval(CustomerList customerBook, int minNum, int maxNum) {
		List<Customer> result = new ArrayList<Customer>();
		List<Customer> customers = customerBook.getCustomers();
		
		for (int i = 0; i < customers.size(); i++) {
			if ((customers.get(i).getCardNumber() >= minNum) && (customers.get(i).getCardNumber() <= maxNum)) {
				result.add(customers.get(i));
			}
		}
		
		return result;
	}

}
