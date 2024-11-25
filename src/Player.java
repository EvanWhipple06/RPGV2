public class Player {
    private String name;
    private int STR;
    private int DEX;
    private int CON;
    private int INT;
    private int WIS;
    private int CHR;
    private int maxHealth;
    private int health;
    private int AC;
    private int attack;

    Dice D4 = new Dice(4);
    Dice D6 = new Dice(6);
    Dice D8 = new Dice(8);
    Dice D10 = new Dice(10);
    Dice D12 = new Dice(12);
    Dice D20 = new Dice(20);

    //8 points to split up between these abilities
    public Player(String name, int STR, int DEX, int CON, int INT, int WIS, int CHR) {
        this.name = name;
        this.STR = STR;
        this.DEX = DEX;
        this.CON = CON;
        this.INT = INT;
        this.WIS = WIS;
        this.CHR = CHR;

        this.AC = 10;
        this.maxHealth = 10 + CON;
        this.health = this.maxHealth;
    }

    public void equipped() {

    }
}
