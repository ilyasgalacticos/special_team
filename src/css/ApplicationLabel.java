package css;

import javax.swing.*;
import java.awt.*;

public class ApplicationLabel extends JLabel {
    public ApplicationLabel(String text){
        super(text);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", 1, 20));
    }
}
