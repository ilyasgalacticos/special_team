import css.ApplicationButton;

import javax.swing.*;

public class MainMenu extends JPanel {

    private MainFrame parent;

    private ApplicationButton addUserPageButton;
    private ApplicationButton listUserPageButton;
    private ApplicationButton exitButton;

    public MainMenu(MainFrame parent){

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        addUserPageButton = new ApplicationButton("ADD PLAYER");
        addUserPageButton.setSize(300,30);
        addUserPageButton.setLocation(100,100);
        add(addUserPageButton);
        addUserPageButton.addActionListener(e -> {
            parent.getMainMenu().setVisible(false);
            parent.getAddUserPage().setVisible(true);
        });

        listUserPageButton = new ApplicationButton("LIST PLAYERS");
        listUserPageButton.setSize(300,30);
        listUserPageButton.setLocation(100,150);
        add(listUserPageButton);
        listUserPageButton.addActionListener(e -> {
            parent.getListUsersPage().generateTable(parent.getPlayers());
            parent.getMainMenu().setVisible(false);
            parent.getListUsersPage().setVisible(true);
        });

        exitButton = new ApplicationButton("EXIT");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(e -> {

            System.exit(0);

        });

    }

}
