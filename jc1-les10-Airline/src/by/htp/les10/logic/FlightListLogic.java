package by.htp.les10.logic;

import by.htp.les10.entity.Flight;
import by.htp.les10.entity.FlightList;

import java.util.ArrayList;
import java.util.List;

public class FlightListLogic {
	public List<Flight> destinationList(FlightList flightlist, String destination) {
		List<Flight> result = new ArrayList<Flight>();
		List<Flight> flights = flightlist.getFlights();

		for (int i = 0; i < flights.size(); i++) {
			Flight flight = flights.get(i);

			if (flight.getDestination().equals(destination)) {
				result.add(flights.get(i));
			}
		}

		return result;
	}

	public List<Flight> airlinesByWeekDay(FlightList airport, String Days) {
		List<Flight> result = new ArrayList<Flight>();
		List<Flight> flights = airport.getFlights();

		for (int i = 0; i < flights.size(); i++) {
			Flight flight = flights.get(i);

			if (flight.getWeekDays().contains(Days)) {
				result.add(flights.get(i));
			}
		}

		return result;
	}

	public List<Flight> airlinesAfterHour(FlightList flightList, int hour) {
		List<Flight> result = new ArrayList<Flight>();
		List<Flight> flights = flightList.getFlights();

		for (int i = 0; i < flights.size(); i++) {
			Flight airline = flights.get(i);

			if (airline.getDepartureTime() > hour) {
				result.add(flights.get(i));
			}
		}

		return result;
	}

	public List<Flight> airlinesDayHour(FlightList flightList, String Days, int hour) {
		List<Flight> firstResult = new ArrayList<Flight>();
		List<Flight> secondResult = new ArrayList<Flight>();
		List<Flight> flights = flightList.getFlights();

		for (int i = 0; i < flights.size(); i++) {
			Flight flight = flights.get(i);

			if (flight.getWeekDays().contains(Days)) {
				firstResult.add(flights.get(i));
			}
		}

		for (int i = 0; i < firstResult.size(); i++) {
			Flight flight = firstResult.get(i);

			if (flight.getDepartureTime() > hour) {
				secondResult.add(firstResult.get(i));
			}
		}

		return secondResult;
	}
}
