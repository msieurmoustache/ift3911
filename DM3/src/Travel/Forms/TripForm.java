package Travel.Forms;

import java.text.ParseException;
import java.util.Date;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.TravelType;
import Travel.Itineraries.Itinerary;
import Travel.Trip.Trip;
import Utils.DateUtils;
import Utils.MoneyUtils;
import Utils.Searcher.Searcher;

public class TripForm extends BaseForm {

	private Double basePrice;
	private Date departureTime;
	private String itineraryID;
	private String vehicleID;
	private String companyID;

	public TripForm(Trip t) {
		this.ID = t.getId();
		this.type = t.getType();
		this.basePrice = t.getBasePrice();
		this.departureTime = t.getDepartureDateTime();
		this.itineraryID = t.getItinerary().getId();
		this.vehicleID = t.getVehicle().getId();
		this.companyID = t.getCompany().getID();
	}

	public TripForm(TravelType type, String tripID, String companyID, String vehicleID, String itineraryID, String departureTime, String basePrice) throws ParseException {
		this.ID = tripID;
		this.type = type;
		this.companyID = companyID;
		this.vehicleID = vehicleID;
		this.itineraryID = itineraryID;
		this.departureTime = DateUtils.dateFromString(departureTime);
		this.basePrice = MoneyUtils.stringToDouble(basePrice);
	}

	public Double getBasePrice() { return this.basePrice; }

	public void setBasePrice(Double basePrice) { this.basePrice = basePrice; }

	public Date getDepartureTime() { return this.departureTime; } 

	public void setDepartureTime(Date departureTime) { this.departureTime = departureTime; }

	public String getItineraryID() { return this.itineraryID; }
	public Itinerary getItinerary() { return Searcher.getItineraryFromID(this.itineraryID); }

	public void setItineraryID(String itineraryID) { this.itineraryID = itineraryID; }
	public void setItinerary(Itinerary itinerary) { this.itineraryID = itinerary.getId(); }

	public String getVehicleID() { return this.vehicleID; }
	public ConcreteVehicle getVehicle() { return Searcher.getVehicleFromID(this.vehicleID); }

	public void setVehicleID(String vehicleID) { this.vehicleID = vehicleID; }
	public void setVehicle(ConcreteVehicle vehicle) { this.vehicleID = vehicle.getId(); }

	public TravelCompany getCompany() { return Searcher.getCompanyFromID(this.companyID); }
	public String getCompanyID() { return this.companyID; }

	public void setCompany(TravelCompany company) { this.companyID = company.getID(); }
	public void setCompany(String companyID) { this.companyID = companyID; }

	public BaseForm createFromPrompt() {
		// TODO - implement TripForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement TripForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}
}