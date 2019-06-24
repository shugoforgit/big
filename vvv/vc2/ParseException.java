package vc2;

public class ParseException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

    public ParseException(){
        super();
    }

    public ParseException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String toString() {
        return "Exception in thread \"" + Thread.currentThread().getName() + "\" " + this.getClass().getName() +
                ": For input string: \"" + this.msg + "\"";
    }
}