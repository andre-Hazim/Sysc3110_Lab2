import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> buddies;


    public void addBuddy(BuddyInfo buddyInfo){
        buddies.add(buddyInfo);

    }
    public void removeBuddy(BuddyInfo buddyInfo){
        buddies.remove(buddyInfo);
    }
    public static void main(String[] args) {
        System.out.printf("Address Book");
    }
}
