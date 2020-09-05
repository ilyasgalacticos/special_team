import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private MainMenu mainMenu;
    private AddUserPage addUserPage;
    private EditUserPage editUserPage;
    private ListUsersPage listUsersPage;

    private Long playerId = 1L;
    private ArrayList<Player> players = new ArrayList<>();

    public MainFrame(){

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500,500);
        setLayout(null);

        mainMenu = new MainMenu(this);
        mainMenu.setLocation(0,0);
        add(mainMenu);
        mainMenu.setVisible(true);

        addUserPage = new AddUserPage(this);
        addUserPage.setLocation(0,0);
        addUserPage.setVisible(false);
        add(addUserPage);

        editUserPage = new EditUserPage(this);
        editUserPage.setLocation(0,0);
        editUserPage.setVisible(false);
        add(editUserPage);

        listUsersPage = new ListUsersPage(this);
        listUsersPage.setLocation(0,0);
        listUsersPage.setVisible(false);
        add(listUsersPage);

    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public AddUserPage getAddUserPage() {
        return addUserPage;
    }

    public ListUsersPage getListUsersPage() {
        return listUsersPage;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player){
        player.setId(playerId);
        players.add(player);
        playerId++;
    }

    public EditUserPage getEditUserPage() {
        return editUserPage;
    }

    public boolean savePlayer(Player player){
        for(int i=0;i<players.size();i++){
            if(players.get(i).getId()==player.getId()){
                players.set(i, player);
                return true;
            }
        }
        return false;
    }

    public boolean deletePlayer(Player player){
        for(int i=0;i<players.size();i++){
            if(players.get(i).getId()==player.getId()){
                players.remove(i);
                return true;
            }
        }
        return false;
    }
}