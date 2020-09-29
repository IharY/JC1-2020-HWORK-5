package by.htp.les10.entity;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
	private List <Flight> flights;
	
	public FlightList() {
		flights = new ArrayList <Flight>();
	}
	
	public FlightList(Flight[] flights) {
		this.flights = new ArrayList <Flight>();
		for(int i = 0; i < flights.length; i++) {
			this.flights.add(flights[i]);
		}
	}
	
	public void add (Flight flight) {
		flights.add(flight);
	}
	
	public List<Flight> getFlights(){
		return flights;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flights == null) ? 0 : flights.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightList other = (FlightList) obj;
		if (flights == null) {
			if (other.flights != null)
				return false;
		} else if (!flights.equals(other.flights))
			return false;
		return true;
	}

}
