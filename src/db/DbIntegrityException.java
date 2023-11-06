package db;

public class DbIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	DbIntegrityException(String msg) {
		super(msg);
	}
}
