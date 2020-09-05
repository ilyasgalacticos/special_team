import css.ApplicationButton;
import css.ApplicationLabel;
import css.ApplicationTextField;

import javax.swing.*;
import java.awt.*;

public class EditUserPage extends JPanel {

    private MainFrame parent;
    private JLabel label, name, price, club;
    private ApplicationButton back, save, delete;
    private ApplicationTextField nameField, priceField, clubField;
    private Player currentPlayer = null;

    public void setCurrentPlayer(Player player){
        this.currentPlayer = player;
        nameField.setText(player.getName());
        priceField.setText(player.getPrice()+"");
        clubField.setText(player.getClub());
    }

    public EditUserPage(MainFrame parent){
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

        save = new ApplicationButton("SAVE");
        save.setSize(100,30);
        save.setLocation(50,370);
        add(save);

        save.addActionListener(e->{

            String playerName = nameField.getText();
            int playerPrice = 0;
            try {
                playerPrice = Integer.parseInt(priceField.getText());
            }catch (Exception ex){
                playerPrice = 1000;
            }
            String playerClub = clubField.getText();

            currentPlayer.setName(playerName);
            currentPlayer.setPrice(playerPrice);
            currentPlayer.setClub(playerClub);

            parent.savePlayer(currentPlayer);

        });

        back = new ApplicationButton("BACK");
        back.setSize(100,30);
        back.setLocation(170,370);
        add(back);

        back.addActionListener(e -> {
            parent.getEditUserPage().setVisible(false);
            parent.getListUsersPage().generateTable(parent.getPlayers());
            parent.getListUsersPage().setVisible(true);
        });

        delete = new ApplicationButton("DELETE");
        delete.setForeground(Color.RED);
        delete.setSize(100,30);
        delete.setLocation(290,370);
        add(delete);

        delete.addActionListener(e -> {

            parent.deletePlayer(currentPlayer);
            parent.getEditUserPage().setVisible(false);
            parent.getListUsersPage().generateTable(parent.getPlayers());
            parent.getListUsersPage().setVisible(true);

        });

    }

}
