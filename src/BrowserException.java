
public class BrowserException extends Exception {

	String myMessage;
	private static final long serialVersionUID = 7786251702766921467L;
	
	public BrowserException(String message) {
		myMessage = message;
	}
	
	public String getMessage() {
		return myMessage;
	}

}
