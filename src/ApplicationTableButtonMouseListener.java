import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ApplicationTableButtonMouseListener extends MouseAdapter {

    private JTable table;
    private MainFrame parent;
    private JPanel panel;

    public ApplicationTableButtonMouseListener(JTable table, MainFrame parent, JPanel panel) {
        this.table = table;
        this.parent = parent;
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int col = table.getColumnModel().getColumnIndexAtX(e.getX());
        int row = e.getY()/table.getRowHeight();
        if(row<table.getRowCount() && row>=0 && col==table.getColumnModel().getColumnIndex("EDIT")){
            if(panel instanceof ListUsersPage){

                Player player = parent.getPlayers().get(row);

                parent.getListUsersPage().setVisible(false);
                parent.getEditUserPage().setCurrentPlayer(player);
                parent.getEditUserPage().setVisible(true);

            }
        }
    }
}
