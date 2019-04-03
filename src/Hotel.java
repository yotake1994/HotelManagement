import java.util.*;
public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Guest> guests;
    private String HotelName;


    public Hotel(String name){
        rooms = new ArrayList<Room>();
        guests= new ArrayList<Guest>();
        HotelName = name;
    }

    public void CheckIn (Guest g, String num){
        Room room= new Room(num);
        if (rooms.contains(room)){
            System.out.println("This Room Is Full");
        }
        else{
            guests.add(g);
            room.PutGuest(g);
            room.SetFullorNot("Full");
            rooms.add(room);
        }
    }

    public static void main(String[] args){
        Hotel h = new Hotel("Hilton");
        h.CheckIn(new Guest("Yuki","Otake"),"100");
        String test = h.rooms.get(0).getGuestName();
        System.out.println(test);
    }
}
