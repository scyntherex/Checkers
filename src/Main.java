import java.awt.EventQueue;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame{
	
	public Main(String title) {
	      super(title);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);

	      Board board = new Board();
	      board.add(new Checker(CheckerType.RED_REGULAR), 4, 1);
	      board.add(new Checker(CheckerType.BLACK_REGULAR), 6, 3);
	      board.add(new Checker(CheckerType.RED_KING), 5, 6);
	      setContentPane(board);

	      pack();
	      setVisible(true);
	}
	public static void main(String[] args) {
		Runnable r = new Runnable()
        {
           @Override
           public void run()
           {
              new Main("Checkers");
           }
        };
        EventQueue.invokeLater(r);
	}

}
