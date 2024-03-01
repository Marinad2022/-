public class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        points = 20 + (int) Math.round(Math.random() * (30 - 20));

    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "\nИмя: " + getName() + " - Очки: " + getPoints();
    }
}
