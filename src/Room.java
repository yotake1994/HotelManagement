public class Room {
    private Boolean FullorNot;
    private String RoomNumber;
    private int Capacity;
    private Guest guest;

    public Room(String RoomNumber) {
        this.RoomNumber=RoomNumber;
        this.FullorNot= FullorNot;
        this.guest = guest;
    }
    public void PutGuest(Guest g){
        guest = g;
        }

    public Guest GetGuest(){
        return guest;
    }

    public String getGuestName() {
        return guest.getFullName();
    }

    public void SetFullorNot(String YorN){
        if (YorN.equalsIgnoreCase("Full")) {
            FullorNot = true;
        }
        else {
            FullorNot = false;
        }
    }
   /* public static void main(String[] args){
        Room room= new Room("104");
        room.PutGuest(new Guest("Yuki","Otake"));
        Guest testGuest= room.GetGuest();
        String testName = testGuest.getLastName();
        System.out.println(testName);
    }*/
}


