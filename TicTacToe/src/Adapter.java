import java.awt.event.*;
import java.util.*;

public class Adapter implements ActionListener {

    private Controller c;
    private View v;

    // initializing the references of the controller and view classes
    public Adapter(Controller c, View v) {
        this.c = c;
        this.v = v;
    }

    // Implementation of the actionPerformed method for the ActionListener interface
    public void actionPerformed(ActionEvent e) {
        // adapter asks the controller to perform desired action based on the button pressed
        if(v.isReset(e))
            c.setRequest();
        else {
            ArrayList<Integer> position = v.getPosition(e);
            c.setRequest(position);
        }
    }

}
