//Jordan Z
public class Gloves {
    private String rarity;
    private String specialAbility;
    private boolean gloveWeapon;
    private int attackDamage;
    private int gloveCost;
    private int weight;

    public Gloves(String rarity, String specialAbility, boolean gloveWeapon, int attackDamage, int gloveCost, int weight) {
        this.rarity = rarity;
        this.specialAbility = specialAbility;
        this.gloveWeapon = gloveWeapon;
        this.attackDamage = attackDamage;
        this.gloveCost = gloveCost;
        this.weight = weight;
    }

    // Getters
    public String getRarity() {
        if (rarity.equals("Common") || rarity.equals("Uncommon") || rarity.equals("Rare")) {
            return rarity;
        } else {
            return "This rarity does not exist";
        }
    }

    public String getSpecialAbility() {
        if (specialAbility.equals("The Force")) {
            return specialAbility;
        } else {
            return "This pair of gloves does not have a special ability";
        }
    }

    public boolean getGloveWeapon() {
        return gloveWeapon;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getGloveCost() {
        return gloveCost;
    }

    public int getWeight() {
        return weight;
    }

    // Setters
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public void setGloveWeapon(boolean gloveWeapon) {
        this.gloveWeapon = gloveWeapon;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setGloveCost(int gloveCost) {
        this.gloveCost = gloveCost;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Stat mod methdossd
    public int getStrMod() {
        return clampModifier(weight / 5); // Example: Weight affects strength modifier
    }

    public int getDexMod() {
        return clampModifier(2 - (weight / 10)); // Heavier gloves reduce dexterity
    }

    public int getConMod() {
        return clampModifier(attackDamage / 10); // Attack damage affects constitution
    }

    public int getIntMod() {
        return 0; // No impact on intelligence
    }

    public int getWisMod() {
        int modifier = 0;
        if (rarity.equals("Rare")) {
            modifier = 2;
        }
        else if (rarity.equals("Common")) {
            modifier = 1;
        }
        return modifier; // Only rare gloves give a wisdom bonus
    }

    public int getChaMod() {
        int modifier = 0;
        if (gloveCost > 1000) {
            modifier = 1;
        }
        return modifier; // Expensive gloves increase charisma
    }

    // method to help clamp modifiers between -2 and 2
    private int clampModifier(int value) {
        if (value > 2) {
            return 2;
        } else if (value < -2) {
            return -2;
        }
        return value;
    }

    // Test case (simple example)
    public boolean test() {
        Gloves g = new Gloves("Common", "The Force", true, 20, 500, 10);
        return g.getStrMod() == 2 && g.getDexMod() == 1 && g.getConMod() == 2 && g.getWisMod() == 0 && g.getChaMod() == 0;
    }
}
