public class Guest {
    private String FirstName;
    private String LastName;
    private String FullName;

    public Guest(String FirstName, String LastName) {
        String FullName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        FullName = LastName +","+ FirstName;
        this.FullName= FullName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getFullName(){
        return FullName;
    }
    public String getFirstName(){
        return FirstName;
    }

  /*  public static void main(String[] args){
    Guest g = new Guest("Yuki","Otake");
    String ln = g.getFullName();
    System.out.println(ln);
    }
*/
}


