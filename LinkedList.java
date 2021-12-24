package dsaphonebook;

public class LinkedList {

    //ListNode H&T
    private ListNode head;
    private ListNode tail;
    //Contacts H&T
    private Contacts Head;
    private Contacts Tail;

    private Comparator comparator;

    public LinkedList(Comparator comparator) {
        head = tail = null;// ListNode null
        Head = Tail = null;// Contacts null
        this.comparator = comparator;
    }

    public boolean isEmptyC() {
        return (Head == null);
    }//Contacts is Empty

    public boolean isEmptyL() {
        return (head == null);
    }//ListNode is Empty

    //Create mode (Contacts) 
    //item1 is fullName item2 is phoneNumber
    public void addToHead(Object item1, Object item2) {

        if (isEmptyC()) {
            Head = Tail = new Contacts(item1, item2);
        } else {
            Head = new Contacts(item1, item2, Head);
        }
    }

    public void addToTail(Object item1, Object item2) {
        if (isEmptyC()) {
            Head = Tail = new Contacts(item1, item2);
        } else {
            Tail.next = new Contacts(item1, item2);
            Tail = Tail.next;
        }
    }

    public void insertInOrder(Object item1, Object item2) {
        if (isEmptyC()) {

            Head = Tail = new Contacts(item1, item2);
        } else if (comparator.isGreaterThanOrEqualToC(Head.fullName, item1)) {

            addToHead(item1, item2);
        } else if (comparator.isLessThanOrEqualToC(Tail.fullName, item1)) {

            addToTail(item1, item2);
        } else {

            // insert in the middle
            Contacts current = Head;
            while (current.next != null) {
                if (comparator.isGreaterThanOrEqualToC(current.next.fullName, item1)) {
                    Contacts newContacts = new Contacts(item1, item2);
                    newContacts.next = current.next;
                    current.next = newContacts;
                    return;
                }
                current = current.next;
            }
        }
    }

    /*==========================================================================================*/
    //Create mode (ListNode)
    //find next2 path
    public Contacts Searching(Object item) {
        Contacts cur = Head;
        while (cur != null) {
            String a = item.toString();
            Object item2 = a.charAt(0);
            Object item1 = cur.fullName.charAt(0);
            if (comparator.isEqualToC(item1, item2)) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //find AtoZ char
    public boolean RepeatData(Object item2) {
        ListNode cur = head;
        while (cur != null) {
            Object item1 = cur.data;
            if (comparator.isEqualToC(item1, item2)) {
                return true;
            }
            cur = cur.next1;
        }
        return false;
    }
//System.out.println(con.next.fullName);

    public void addTotail(Object item) {
        String s = item.toString();
        char AtoZ = s.charAt(0);
        Contacts con = Searching(item);

        if (isEmptyL()) {

            head = tail = new ListNode(AtoZ);
            head.next2 = con;

            // set Contacts cur
        } else {
            if (RepeatData(AtoZ) == false) {
                tail.next1 = new ListNode(AtoZ);
                tail = tail.next1;
                tail.next2 = con;

            }
        }
    }

    public void checking() {
        Contacts current = Head;
        while (current != null) {
            addTotail(current.fullName);
            current = current.next;
        }
    }

    //Testing Script
    public String ShowTable() {
        String s = "";
        ListNode current = head;// control char
        Contacts currents = current.next2; //control string
        while (current != null) {
            s += current.data + "--";

            while (currents != null) {
                if (currents.next != null) {
                    if (comparator.isEqualToChar(currents.fullName, currents.next.fullName) == false) {
                        s += currents.fullName + " :   " + currents.phoneNumber + "\n   ";
                        currents = currents.next;
                        break;
                    }
                }

                s += currents.fullName + " :   " + currents.phoneNumber + ",   ";
                currents = currents.next;

            }

            current = current.next1;

            s += "\n";
        }
        return s;
    }

    public String ShowANS(String fullName) {
        
        String s = "";
        ListNode current = head;// control char
        Contacts currents = current.next2; //control string
        char c = fullName.charAt(0);
        while (current != null) {
            if(((char)(current.data)) == c){
                while(currents != null){
                    if(comparator.isEqualToC(fullName, currents.fullName)){
                        return currents.phoneNumber;
                    }
                    currents = currents.next;
                }
            }
            current = current.next1;
        }
        return "Data Not Found !!!!";
    }

}
