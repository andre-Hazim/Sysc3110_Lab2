public class BuddyInfo {


    private String name;

    private String address;

    private String phoneNumber;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {

        BuddyInfo buddyInfo = new BuddyInfo("Andre");

        System.out.println("Hello " + buddyInfo.getName());
    }
}

