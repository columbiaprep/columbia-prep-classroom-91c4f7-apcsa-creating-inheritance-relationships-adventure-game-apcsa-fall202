public class Philosophy {
    private int knowledge;
    private int fighting;
    private int wisdomBoost;
    private int dexterityBoost;
    private int vision;
    private String philosophyName;

    public Philosophy(String philosophyName) {
        this.philosophyName = philosophyName;
        this.knowledge = 15;
        this.fighting = 10;
        this.wisdomBoost = 5;
        this.dexterityBoost = 5;
        this.vision = 10;
    }


    public int getKnowledge() {
        return knowledge;
    }

    public int getFighting() {
        return fighting;
    }

    public int getWisdomBoost() {
        return wisdomBoost;
    }

    public String getPhilosophyName() {
        return philosophyName;
    }

    public int getDexterityBoost() {
        return dexterityBoost;
    }

    public int getVision() {
        return vision;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setFighting(int fighting) {
        this.fighting = fighting;
    }

    public void setWisdomBoost(int wisdomBoost) {
        this.wisdomBoost = wisdomBoost;
    }

    public void setDexterityBoost(int dexterityBoost) {
        this.dexterityBoost = dexterityBoost;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public void setPhilosophyName(String philosophyName) {
        this.philosophyName = philosophyName;
    }

    private int limitModifier(int modifier){
        if (modifier > 2) return 2;
        if (modifier < -2) return -2;
        return modifier;
    }

    private int calculateModifier(int abilVal) {
        return (abilVal - 10) / 2;
    }

    public int getStrMod() {
        return limitModifier(calculateModifier(fighting));
    }

    public int getDexMod() {
        return limitModifier(calculateModifier(dexterityBoost));

    }

    public int getChaMod() {
        return limitModifier(calculateModifier(knowledge));

    }

    public int getConMod(){
        return limitModifier(calculateModifier(vision));
    }

    public int getWisMod() {
        return limitModifier(calculateModifier(wisdomBoost));
    }

    public String getIntMod(){
        return philosophyName;
    }


    public boolean test() {
        setFighting(12);
        if (getStrMod() != 2) return false;

        setFighting(10);
        if (getStrMod() != 2) return false;

        setFighting(18);
        if (getStrMod() != 2) return false;

        setDexterityBoost(15);
        if (getDexMod() != 2) return false;

        setDexterityBoost(12);
        if (getDexMod() != 2) return false;

        setDexterityBoost(18);
        if (getDexMod() != 2) return false;


        setKnowledge(20);
        if (getChaMod() != 2) return false;

        setKnowledge(24);
        if (getChaMod() != 2) return false;

        setKnowledge(16);
        if (getChaMod() != 2) return false;

        setVision(10);
        if (getConMod() != 2) return false;

        setVision(8);
        if (getConMod() != 2) return false;

        setVision(14);
        if (getConMod() != 2) return false;

        setWisdomBoost(6);
        if (getWisMod() != 2) return false;

        setWisdomBoost(10);
        if (getWisMod() != 2) return false;

        setWisdomBoost(8);
        if (getWisMod() != 2) return false;

        return true;
    }




}
