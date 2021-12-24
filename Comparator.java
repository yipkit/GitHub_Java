package dsaphonebook;
public interface Comparator {
    //Contacts Data
    public abstract boolean isEqualToC (Object item1, Object item2);
    public abstract boolean isLessThanC (Object item1, Object item2);
    public abstract boolean isLessThanOrEqualToC (Object item1, Object item2);
    public abstract boolean isGreaterThanC (Object item1, Object item2);
    public abstract boolean isGreaterThanOrEqualToC (Object item1, Object item2);
    //Char
    public abstract boolean isEqualToChar (Object item1, Object item2);
   
    
}

