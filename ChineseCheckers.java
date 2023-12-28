import java.awt.EventQueue;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class ChineseCheckers extends JFrame {
    public ChineseCheckers() {
        EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame("Китайские шашки");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new BorderLayout());
			frame.add(new Board());
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			frame.setResizable(false);
		});
    }
}

