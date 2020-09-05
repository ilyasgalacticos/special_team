public class Player {

    private Long id;
    private String name;
    private int price;
    private String club;

    public Player() {
    }

    public Player(String name, int price, String club) {
        this.name = name;
        this.price = price;
        this.club = club;
    }

    public Player(Long id, String name, int price, String club) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", club='" + club + '\'' +
                '}';
    }
}
