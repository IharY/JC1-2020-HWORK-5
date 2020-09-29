package by.htp.les10.main;

/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами 
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import by.htp.les10.entity.Flight;
import by.htp.les10.entity.FlightList;
import by.htp.les10.logic.FlightListLogic;
import by.htp.les10.view.FlightView;

public class Main {
	public static void main(String[]args) {

	FlightList fList = new FlightList();
	FlightListLogic fListLogic = new FlightListLogic();
	FlightView fView = new FlightView();
	
	fList.add(new Flight("Warszawa", 101, "Huge", 15, "Mo, We, Fr"));
	fList.add(new Flight("Moscow", 103, "Common", 14, "Mo, Fr"));
	
	//fView.printAll("Just all airlines:", fList);
	
	fView.printAll("All airlines to Warszawa:", fListLogic.destinationList(fList, "Warszawa"));
	
	fView.printAll("All airlines leaving on Wednesday:", fListLogic.airlinesByWeekDay(fList, "We"));
	
	fView.printAll("All airlines leaving on Monday after 14 p.m.:", fListLogic.airlinesDayHour(fList,"Mo", 14));
	}
}
