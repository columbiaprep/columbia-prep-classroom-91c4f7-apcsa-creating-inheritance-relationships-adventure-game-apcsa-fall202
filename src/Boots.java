//Nathan R
public class Boots {
    private int revisedStrength;
    private int revisedDexterity;
    private boolean uncomfortableBoots;
    private int revisedCharisma;
    private String typeOfBoot;
    private boolean bootWithShoelaces;


    public Boots(boolean uncomfortableBoots, String typeOfBoot, boolean bootWithShoelaces){
        this.uncomfortableBoots = uncomfortableBoots;
        this.typeOfBoot = typeOfBoot;
        this.bootWithShoelaces = bootWithShoelaces;
        this.revisedStrength = 10;
        this.revisedDexterity = 10;
        this.revisedCharisma = 10;
    }

    public int getRevisedStrength() {
        return revisedStrength;
    }

    public void setRevisedStrength(int revisedStrength) {
        this.revisedStrength = revisedStrength;
    }

    public int getRevisedDexterity() {
        return revisedDexterity;
    }

    public void setRevisedDexterity(int revisedDexterity) {
        this.revisedDexterity = revisedDexterity;
    }

    public boolean isUncomfortableBoots() {
        return uncomfortableBoots;
    }

    public void setUncomfortableBoots(boolean uncomfortableBoots) {
        this.uncomfortableBoots = uncomfortableBoots;
    }

    public int getRevisedCharisma() {
        return revisedCharisma;
    }

    public void setRevisedCharisma(int revisedCharisma) {
        this.revisedCharisma = revisedCharisma;
    }

    public String getTypeOfBoot() {
        return typeOfBoot;
    }

    public void setTypeOfBoot(String typeOfBoot) {
        this.typeOfBoot = typeOfBoot;
    }

    public boolean isBootWithShoelaces() {
        return bootWithShoelaces;
    }

    public void setBootWithShoelaces(boolean bootWithShoelaces) {
        this.bootWithShoelaces = bootWithShoelaces;
    }


    public int getStrMod() {
        return limitModifier(calculateModifier(revisedStrength));
    }

    public int getDexMod() {
        return limitModifier(calculateModifier(revisedDexterity));
    }

    public int getChaMod() {
        return limitModifier(calculateModifier(revisedCharisma));
    }

    public boolean getConMod() {
        return uncomfortableBoots;
    }

    public boolean getIntMod() {
        return uncomfortableBoots;
    }

    public int getWisMod() {
        if (bootWithShoelaces) {
            return 2;
        } else {
            return 0;
        }
    }

    private int limitModifier(int modifier) {
        if (modifier > 2) return 2;
        if (modifier < -2) return -2;
        return modifier;
    }

    private int calculateModifier(int abilVal) {
        return (abilVal - 10) / 2;
    }


    // Test Methods:
    public boolean test() {

        setRevisedStrength(12);
        if (getStrMod() != 1) return false;

        setRevisedStrength(18);
        if (getStrMod() != 2) return false;

        setRevisedStrength(5);
        if (getStrMod() != -2) return false;

        setRevisedDexterity(14);
        if (getDexMod() != 2) return false;

        setRevisedDexterity(20);
        if (getDexMod() != 2) return false;

        setRevisedDexterity(6);
        if (getDexMod() != -2) return false;

        setRevisedCharisma(16);
        if (getChaMod() != 2) return false;

        setRevisedCharisma(10);
        if (getChaMod() != 0) return false;

        setUncomfortableBoots(true);
        if (!getConMod()) return false;

        setUncomfortableBoots(false);
        if (getConMod()) return false;

        setUncomfortableBoots(true);
        if (!getIntMod()) return false;

        setUncomfortableBoots(false);
        if (getIntMod()) return false;

        setBootWithShoelaces(true);
        if (getWisMod() != 2) return false;

        setBootWithShoelaces(false);
        if (getWisMod() != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        Boots bootsTests = new Boots(true, "Leather", false);
        System.out.println(bootsTests.test());
    }
}
