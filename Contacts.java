package dsaphonebook;
public class Contacts {

    public String phoneNumber;
    public String fullName;
    public Contacts next;

    public Contacts(Object fullName, Object phoneNumber) {
        String a = phoneNumber.toString();
        String b = fullName.toString();
        this.phoneNumber = a;
        this.fullName = b;
        this.next = null;
    }

    public Contacts(Object fullName, Object phoneNumber, Contacts next) {
        String a = phoneNumber.toString();
        String b = fullName.toString();
        this.phoneNumber = a;
        this.fullName = b;
        this.next = next;
    }

    public String toString() {
        return this.fullName + "Phone Number : " + this.phoneNumber;
    }
}