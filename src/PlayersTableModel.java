import css.ApplicationButton;

import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;

public class PlayersTableModel extends AbstractTableModel {

    private ArrayList<Player> players;

    public PlayersTableModel(ArrayList<Player> players){
        this.players = players;
    }

    @Override
    public int getRowCount() {
        return players.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return players.get(rowIndex).getName();
            case 1:
                return players.get(rowIndex).getPrice() + " EUR";
            case 2:
                return players.get(rowIndex).getClub();
            case 3:
                final ApplicationButton button = new ApplicationButton("EDIT");
                button.setSize(100,20);
                button.setFont(new Font("Arial", 1, 14));
                button.setForeground(Color.BLUE);

                return button;

            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "NAME";
            case 1:
                return "PRICE";
            case 2:
                return "CLUB";
            case 3:
                return "EDIT";
            default:
                return "";
        }
    }
}
