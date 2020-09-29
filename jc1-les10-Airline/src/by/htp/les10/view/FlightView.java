package by.htp.les10.view;

import java.util.List;

import by.htp.les10.entity.Flight;

public class FlightView {
	public void printAll(String massage, List <Flight> flights) {
		System.out.println("--------------------------------------");
		System.out.println("massage");
		System.out.println("--------------------------------------");
		
		for(int i = 0; i < flights.size(); i++) {
			Flight flight = flights.get(i);
			System.out.println(flight.toString());
		}
	}

	}


