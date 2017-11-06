import java.lang.RuntimeException;

@SuppressWarnings("serial")
public class AlreadyOccupiedException extends RuntimeException{
	public AlreadyOccupiedException(String msg)
	   {
	      super(msg);
	   }
}
