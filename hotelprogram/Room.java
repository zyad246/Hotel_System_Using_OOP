package hotelprogram;

public abstract class Room {
	
	private int roomNumber;
	private boolean reserved;
	
	public Room(int roomNumber){
	this.roomNumber=roomNumber;
	}
	public int getRoomNumber(){return this.roomNumber;}
	public boolean getReserved(){return this.reserved;}
	public void setReserved(boolean reserved){this.reserved=reserved;}
	public abstract double getPrice();
}
