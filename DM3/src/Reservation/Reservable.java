package Reservation;

public class Reservable {

	private ReservableState state;
	Reservation reservation;

	/**
	 * 
	 * @param time
	 * @param r
	 */
	public boolean reserve(DateTime time, Reservation r) {
		// TODO - implement Reservable.reserve
		throw new UnsupportedOperationException();
	}

	public boolean cancel() {
		// TODO - implement Reservable.cancel
		throw new UnsupportedOperationException();
	}

	public Real getPrice() {
		// TODO - implement Reservable.getPrice
		throw new UnsupportedOperationException();
	}

	public boolean isAvailable() {
		// TODO - implement Reservable.isAvailable
		throw new UnsupportedOperationException();
	}

	public ReservableState getState() {
		return this.state;
	}

	public void setState(ReservableState state) {
		this.state = state;
	}

}