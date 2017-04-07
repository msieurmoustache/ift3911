package Travel.Itineraries;

import java.sql.Time;

import Travel.Facilities.TravelFacility;

public class Stop {

	private TravelFacility location;
	private Time timeFromDeparture;

	public Stop(TravelFacility tf, Time time) {
		this.location = tf;
		this.timeFromDeparture = time;
	}

	public TravelFacility getLocation() {
		return this.location;
	}

	public void setLocation(TravelFacility location) {
		this.location = location;
	}

	public Time getTimeFromDeparture() {
		return this.timeFromDeparture;
	}

	public void setTimeFromDeparture(Time timeFromDeparture) {
		this.timeFromDeparture = timeFromDeparture;
	}

}