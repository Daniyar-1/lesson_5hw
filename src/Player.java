public class Player {
    private int health;
    private int hits;
    private String hitTypes;

public Player(int health, int hits, String hitTypes){
    this.health =health;
    this.hits =hits;
    this.hitTypes = hitTypes;
}

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

    public String getHitTypes() {
        return hitTypes;
    }

    public void setHitTypes(String hitTypes) {
        this.hitTypes = hitTypes;
    }
}
