package by.htp.les10.main;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

import by.htp.les10.entity.Customer;
import by.htp.les10.entity.CustomerList;
import by.htp.les10.logic.CustomerListLogic;
import by.htp.les10.view.CustomerListView;


public class Main {
	public static void main(String []args) {
	CustomerList cust = new CustomerList();
	CustomerListLogic logic = new CustomerListLogic();
	CustomerListView view = new CustomerListView();
	
	cust.add(new Customer(2, 392, 2090, "Shestakov" , "Vasily", "Dmitrievich", "Orlovskogo 23"));
	cust.add(new Customer(2, 392, 5890, "Neganov" , "Nikolay", "Sergeevich", "Kirova 12" ));
    cust.add(new Customer(2, 392, 4591, "Vorobev" , "Dmitry", "Ivanovich", "Lesnaya 128" ));
    cust.add(new Customer(2, 392, 2984, "Ivanov" , "Andrey", "Yurievich", "Gvardeyskaya 74" ));
    cust.add(new Customer(2, 392, 6789, "Smirnov" , "Mihail", "Viktorovich", "Pervomayskaya 3" ));

	//view.printAll("Just all customers:", cust);
	
	view.printAll("All customers sorted alphabetically:", logic.sortArray(cust));
	
	view.printAll("Customers with credit card numbers from 1000 to 4000:", logic.creditCardNumbersInInterval(cust, 1000, 4000));

	}

}
