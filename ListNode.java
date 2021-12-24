package dsaphonebook;

//box=> next2(Contacts path)
//︾
//next1
//(AtoZ)
public class ListNode {

    public Object data;   // set to public for implementation convenience
    public ListNode next1;
    public Contacts next2;

    public ListNode(Object data) {
        this.data = data;
        this.next1 = null;
        this.next2 = null;
    }

    public ListNode(Object data, Contacts next2) {
        this.data = data;
        this.next1 = null;
        this.next2 = next2;

    }
    public ListNode(Object data, ListNode next1) {
        this.data = data;
        this.next1 = next1;
        this.next2 = null;

    }

    public ListNode(Object data, ListNode next1, Contacts next2) {
        this.data = data;
        this.next1 = next1;
        this.next2 = next2;
    }

    public String toString() {
        return data + "\n";
    }

}
