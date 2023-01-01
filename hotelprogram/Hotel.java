package hotelprogram;

public class Hotel {
	//data members
	private String name;
	private Room[] rooms;
	//constructor
	public Hotel(String name,Room[] rooms){
	this.name=name;
	this.rooms=rooms;
	}
	//member functions
	public String getName(){return this.name;}
	public Room[] getRooms(){return this.rooms;}   
	public boolean isFull(){
	for(int i=0;i<rooms.length;i++){
	if(!rooms[i].getReserved()){return false;}
	}
	return true;
	}
	public boolean reserveRoom(Room room){
	if(!room.getReserved()){
	room.setReserved(true);
	return true;
	}
	return false;
	}
}
