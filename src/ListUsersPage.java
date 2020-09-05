import css.ApplicationButton;
import css.ApplicationTableButtonRenderer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class ListUsersPage extends JPanel {

    private MainFrame parent;

    private JButton back;

    private JTable table;
    private JScrollPane scrollPane;

    private ApplicationTableButtonRenderer renderer = new ApplicationTableButtonRenderer();

    public ListUsersPage(MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        back = new ApplicationButton("BACK");
        back.setSize(300,30);
        back.setLocation(100,400);
        add(back);

        back.addActionListener(e -> {
            parent.getListUsersPage().setVisible(false);
            parent.getMainMenu().setVisible(true);
        });

        table = new JTable();
        table.setFont(new Font("Montserrat", Font.PLAIN, 12));
        table.setRowHeight(30);
        table.addMouseListener(new ApplicationTableButtonMouseListener(table, parent, this));

        scrollPane = new JScrollPane(table);
        scrollPane.setSize(460,370);
        scrollPane.setLocation(10,10);
        add(scrollPane);

    }

    public void generateTable(ArrayList<Player> players){

        PlayersTableModel model = new PlayersTableModel(players);
        table.setModel(model);
        table.getColumn("EDIT").setCellRenderer(renderer);

    }

}
