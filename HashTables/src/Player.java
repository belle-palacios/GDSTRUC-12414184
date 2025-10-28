import java.util.Objects;

public class Player {
    private int id;
    private String userName;
    private int tier;

    public Player(int id, String userName, int tier) {
        this.id = id;
        this.userName = userName;
        this.tier = tier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int gettier() {
        return tier;
    }

    public void settier(int level) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + userName + '\'' +
                ", tier=" + tier +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && tier == player.tier && Objects.equals(userName, player.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, tier);
    }
}
