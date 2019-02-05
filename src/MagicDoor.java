public class MagicDoor {

    public static Player[] getPlayers() {

        Player[] players = new Player[]{
                new Player(300, 30, "Warrior"),
                new Player(300, 30, "Magical"),
                new Player(300, 30, "Physical"),
                new Player(300, 30, "Physical")};
        return players;
    }
}
