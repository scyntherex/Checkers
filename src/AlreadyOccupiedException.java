import java.lang.RuntimeException;

public class AlreadyOccupiedException extends RuntimeException{
	public AlreadyOccupiedException(String msg)
	   {
	      super(msg);
	   }
}
