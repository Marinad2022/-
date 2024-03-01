public class Main {
    public static void main(String[] args) {
        Game gameOne = new Game();
        gameOne.initPlayers();
        gameOne.add(new Player("Алексей"));
        gameOne.add(new Player("Мария"));
        System.out.println(gameOne.getPlayers());
    }

}
