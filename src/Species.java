//Zac P
public class Species {
    private String species;
    private int movementSpeed;
    private boolean canFly;
    private String proficiency;
    private int armorClass;
    private String alignment;
    private double heightM;
    private double weightKG;
    private String size;
    private int strMod;
    private int dexMod;
    private int conMod;
    private int intMod;
    private int wisMod;
    private int chaMod;

    public Species(String species) {
        setSpecies(species);
        setStrMod(0);
        setDexMod(0);
        setIntMod(0);
        setWisMod(0);
        setConMod(0);
        setChaMod(0);
        setMovementSpeed(30);
        setCanFly(false);
        setArmorClass(11);

        if (species.equals("Elf")) {
            setProficiency("Arcana");
            setAlignment("Lawful Neutral");
            setSize("Medium");
            setIntMod(2);
            setDexMod(1);
        }
        else if (species.equals("Dwarf")) {
            setProficiency("Acrobatis");
            setAlignment("Chaotic Neutral");
            setSize("Small");
            setStrMod(2);
            setDexMod(1);
            setConMod(-1);
        }

        setHeightM(findHeight(this.size));
        setWeightKG(findWeight(this.size));

    }

    public int getChaMod() {
        return chaMod;
    }

    public int getStrMod() {
        return strMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public int getIntMod() {
        return intMod;
    }

    public int getConMod() {
        return conMod;
    }

    public int getDexMod() {
        return dexMod;
    }

    public String getSpecies() {
        return species;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public double getHeightM() {
        return heightM;
    }

    public void setHeightM(double heightM) {
        this.heightM = heightM;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }

    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }

    public void setConMod(int conMod) {
        this.conMod = conMod;
    }

    public void setIntMod(int intMod) {
        this.intMod = intMod;
    }

    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }

    public void setChaMod(int chaMod) {
        this.chaMod = chaMod;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double findHeight(String size) {
        if (size.equals("Small")) {
            return (Math.random() * 0.5) + 0.75;
        } else if (size.equals("Medium")) {
            return (Math.random() * 0.75) + 1.25;
        } else if (size.equals("Large")) {
            return (Math.random() * 1) + 1.75;
        } else {
            return (0);
        }
    }

    public double findWeight(String size) {
        if (size.equals("Small")) {
            return (Math.random() * 20) + 20;
        } else if (size.equals("Medium")) {
            return (Math.random() * 30) + 30;
        } else if (size.equals("Large")) {
            return (Math.random() * 50) + 50;
        } else {
            return (0);
        }
    }

    public boolean tesChaMod(){
       return (chaMod >= -2 && chaMod <= 2);
    }
    public boolean testWisMod(){
        return (wisMod >= -2 && wisMod <= 2);
    }
    public boolean testDexMod(){
        return (dexMod >= -2 && dexMod <= 2);
    }
    public boolean testStrMod(){
        return (strMod >= -2 && strMod <= 2);
    }
    public boolean testIntMod(){
        return (intMod >= -2 && intMod <= 2);
    }
    public boolean testConMod(){
        return (conMod >= -2 && conMod <= 2);
    }

    public boolean testSpecies(){
        switch(species){
            case "Elf":
                return (size.equals("Medium") && proficiency.equals("Arcana") && alignment.equals("Lawful Neutral"));
            case "Dwarf":
                return (size.equals("Small") && proficiency.equals("Acrobatics") && alignment.equals("Chaotic Neutral"));
            default:
                return false;
        }
    }

}