package projects.exception;

@SuppressWarnings("serial")
public class dbException extends RuntimeException {

	public dbException() {
	
	}

	public dbException(String message) {
		super(message);
		
	}

	public dbException(Throwable cause) {
		super(cause);
		
	}

	public dbException(String message, Throwable cause) {
		super(message, cause);
		
	}

	

}
