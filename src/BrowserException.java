<<<<<<< HEAD

public class BrowserException extends Exception {

	String myMessage;
	private static final long serialVersionUID = 7786251702766921467L;
	
	public BrowserException(String message) {
		myMessage = message;
	}
	
	public String getMessage() {
		return myMessage;
	}

=======
/**
 * Represents an exceptional situation specific to this project.
 *
 * @author Robert C. Duvall
 */
public class BrowserException extends RuntimeException {
    // for serialization
    private static final long serialVersionUID = 1L;

    /**
     * Create an exception based on an issue in our code.
     */
    public BrowserException (String message, Object ... values) {
        super(String.format(message, values));
    }
    
    /**
     * Create an exception based on a caught exception with a different message.
     */
    public BrowserException (Throwable cause, String message, Object ... values) {
        super(String.format(message, values), cause);
    }

    /**
     * Create an exception based on a caught exception, with no additional message.
     */
    public BrowserException (Throwable exception) {
        super(exception);
    }
>>>>>>> duke-compsci308-fall2015/master
}
