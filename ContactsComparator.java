
package dsaphonebook;


public class ContactsComparator implements Comparator {
    //Contacts
    @Override
    public boolean isEqualToC(Object item1, Object item2) {
        String a = item1.toString();
        String b = item2.toString();
        return a.compareTo(b) == 0;
    }

    @Override
    public boolean isLessThanC(Object item1, Object item2) {
        String a = item1.toString();
        String b = item2.toString();
        return a.compareTo(b) < 0;
    }

    @Override
    public boolean isLessThanOrEqualToC(Object item1, Object item2) {
        String a = item1.toString();
        String b = item2.toString();
        return a.compareTo(b) <= 0;
    }

    @Override
    public boolean isGreaterThanC(Object item1, Object item2) {
        String a = item1.toString();
        String b = item2.toString();
        return a.compareTo(b) > 0;
    }

    @Override
    public boolean isGreaterThanOrEqualToC(Object item1, Object item2) {
        String a = item1.toString();
        String b = item2.toString();
        return a.compareTo(b) >= 0;
    }

    
    //Char
    @Override
    public boolean isEqualToChar(Object item1, Object item2) {
        String a = item1.toString();
        String b = item2.toString();    
        return (a.charAt(0))==(b.charAt(0));
    }





}
