import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddyInfo){
        if(buddyInfo != null){
            buddies.add(buddyInfo);
        }


    }
    public void removeBuddy(int index){
        if (index >= 0 && index < buddies.size()){
            buddies.remove(index);
        }
    }

    public static void main(String[] args) {
        System.out.printf("Address Books");
        BuddyInfo buddy  = new BuddyInfo("Jim", "Carleton", "123");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}

