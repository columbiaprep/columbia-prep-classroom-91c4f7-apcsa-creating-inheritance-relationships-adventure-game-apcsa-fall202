public class Adventurer {
    private String name;
    private int maxHP;
    private int currentHP;
    private int maxMP;
    private int currentMP;
    private int hardiness;
    private int wisdom;

    public Adventurer(String name) {
        this.name = name;
        //this.hardiness = Helper.rollD20(); TODO: Fix
        //this.wisdom = Helper.rollD20(); TODO: Fix
        this.maxHP = 10 + calculateModifier(hardiness);
        this.currentHP = 10 + calculateModifier(hardiness);
        this.maxMP = 10 + calculateModifier(wisdom);
        this.currentMP = 10 + calculateModifier(wisdom);
    }

    public int calculateModifier(int abilVal) {
        return (abilVal - 10) / 2;
    }

    public void printCharacter() {
        System.out.println(name + " | HP: " + currentHP + "/" + maxHP + " | MP: " + currentMP + "/" + maxMP);
    }
}

