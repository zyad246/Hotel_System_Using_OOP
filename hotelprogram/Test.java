package hotelprogram;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room1=new SingleRoom(101);
		room1.setReserved(true);
		Room room2=new SingleRoom(102);
		room2.setReserved(false);
		Room room3=new DoubleRoom(201);
		room3.setReserved(true);
		Room room4=new DoubleRoom(202);
		room4.setReserved(true);
		Room[] rooms={room1,room2,room3,room4};
		Hotel hotel=new Hotel("Lakeside Villa",rooms);
		//calling methods
		System.out.println("Hotel "+hotel.getName()+" is full: "+hotel.isFull());
		boolean available=hotel.reserveRoom(room4);
		if(available){System.out.println("Room successfully booked.");}
		else{System.out.println("Not available.");}   
	}

}
