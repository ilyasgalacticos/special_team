package css;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ApplicationButton extends JButton {

    public ApplicationButton(String text){
        super(text);
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.black));
        setForeground(Color.BLACK);
        setFont(new Font("Arial", 1, 18));
    }

}