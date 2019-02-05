import java.util.Random;

public class Boss {
    private int health;
    private int hits;
    private String changeBossDeffend;
    Random random = new Random();
    int randomInt = random.nextInt(3)+1;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getChangeBossDeffend() {
        return changeBossDeffend;
    }

    public void setChangeBossDeffend(String changeBossDeffend) {
        this.changeBossDeffend = changeBossDeffend;
    }

    public Boss(int health, int hits, String changeBossDeffend) {
        this.health = health;
        this.hits = hits;
        this.changeBossDeffend = changeBossDeffend;

    }
}
