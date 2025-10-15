public class Card {
    private String name;
    private int power;

    public Card(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return name + " (Power: " + power + ")";
    }
}
