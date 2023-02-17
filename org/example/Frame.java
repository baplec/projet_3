import javax.swing.JFrame;

public class Frame {

        public void show(){
        // create a new JFrame object
        JFrame frame = new JFrame("My Simple JFrame Example");

        // set the size and position of the frame
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        // make the frame visible
        frame.setVisible(true);
    }
}