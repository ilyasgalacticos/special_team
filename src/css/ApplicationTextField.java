package css;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ApplicationTextField extends JTextField {

    public ApplicationTextField(){
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.black));
        setForeground(Color.BLACK);
        setFont(new Font("Arial", 1, 18));
    }

}
