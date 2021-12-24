package dsaphonebook;
public class EmptyListException extends RuntimeException {
	public EmptyListException() {
		super("List is empty.");
	}
}
