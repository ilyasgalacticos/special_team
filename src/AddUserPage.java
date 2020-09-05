import css.ApplicationButton;
import css.ApplicationLabel;
import css.ApplicationTextField;

import javax.swing.*;

public class AddUserPage extends JPanel {

    private MainFrame parent;
    private JLabel label, name, price, club;
    private ApplicationButton back, add;
    private ApplicationTextField nameField, priceField, clubField;

    public AddUserPage(MainFrame parent){
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        name = new ApplicationLabel("NAME : ");
        name.setBounds(50, 50, 200,30);
        add(name);

        nameField = new ApplicationTextField();
        nameField.setBounds(50, 100, 400, 30);
        add(nameField);

        price = new ApplicationLabel("PRICE : ");
        price.setBounds(50, 150, 200,30);
        add(price);

        priceField = new ApplicationTextField();
        priceField.setBounds(50, 200, 400, 30);
        add(priceField);

        club = new ApplicationLabel("CLUB : ");
        club.setBounds(50, 250, 200,30);
        add(club);

        clubField = new ApplicationTextField();
        clubField.setBounds(50, 300, 400, 30);
        add(clubField);

        add = new ApplicationButton("ADD");
        add.setSize(100,30);
        add.setLocation(130,370);
        add(add);

        add.addActionListener(e->{

            String playerName = nameField.getText();
            int playerPrice = 0;
            try {
               playerPrice = Integer.parseInt(priceField.getText());
            }catch (Exception ex){
                playerPrice = 1000;
            }
            String playerClub = clubField.getText();

            parent.addPlayer(new Player(playerName, playerPrice, playerClub));

            nameField.setText("");
            priceField.setText("");
            clubField.setText("");

        });

        back = new ApplicationButton("BACK");
        back.setSize(100,30);
        back.setLocation(260,370);
        add(back);

        back.addActionListener(e -> {
            parent.getAddUserPage().setVisible(false);
            parent.getMainMenu().setVisible(true);
        });

    }

}
