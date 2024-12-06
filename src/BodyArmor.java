//Max R
public class BodyArmor {
    private static final String[] materialList = {"Leather", "Chain", "Iron", "Gold", "Diamond", "Netherite"}; // may be no use for this
    private int currentDurability;
    private int maxDurability;
    private boolean broken = false;
    private String material;

    private int conMod;
    private int dexMod;
    private int chaMod;
    private int strMod;
    private int intMod;
    private int wisMod;
    private int quality; // may not be useful
    private int armorClass; // which is basically weight, not sure how to get it to work with modifiers, may just remove

    public BodyArmor(String materialType) {
        assignModifiers(materialType);
        maxDurability = currentDurability;
    }

    public BodyArmor(String materialType, int currentDurability, int quality) {
        assignModifiers(materialType);
        this.quality = quality;
        chaMod += quality;
        if (currentDurability > maxDurability) {
            throw new IllegalStateException("Input durability: " + currentDurability + "is greater than the maximum allowed for that material type.");
        } else if (currentDurability < 1) {
            throw new IllegalStateException("Input durability cannot be negative or 0.");
        }
        if (chaMod > 2) {
            throw new IllegalStateException("Quality must be between 0 and 2 (inclusive) so that chaMod doesn't go over 2.");
        }
        this.currentDurability = currentDurability;
    }


    public boolean test() {
        BodyArmor ba1 = new BodyArmor("Iron");
        if (!ba1.getMaterial().equals("Iron"))
            return false;
        if (ba1.getArmorClass() != 2)
            return false;
        if (ba1.getChaMod()!=0)
            return false;
        if (ba1.getDexMod()!=0)
            return false;
        if (ba1.getStrMod()!=1)
            return false;
        if (ba1.getConMod()!=2)
            return false;
        if (ba1.getIntMod()!=0)
            return false;
        if (ba1.getWisMod()!=0)
            return false;

        BodyArmor ba2 = new BodyArmor("Diamond", 150,2);
        if (ba2.getMaterial().equals("Iron"))
            return false;
        if (ba2.getArmorClass() != 3)
            return false;
        if (ba2.getChaMod()!=2)
            return false;
        if (ba2.getDexMod()!=0)
            return false;
        if (ba2.getStrMod()!=2)
            return false;
        if (ba2.getConMod()!=1)
            return false;
        if (ba2.getIntMod()!=0)
            return false;
        if (ba2.getWisMod()!=0)
            return false;

        return true;
    }

    public String toString() {
        return "BodyArmor: " + "Material: " + material + " Quality: " + quality + " Durability: " + currentDurability + " / " + maxDurability;
    }

    //not implementing this constructor
/*
    public BodyArmor(String materialType, boolean broken) {
        getModifiers(materialType);
        this.broken = broken;

    }
*/

    private void assignModifiers(String materialType) {
        switch (materialType) {
            case "Leather": {
                material = materialType;
                dexMod += 1;
                chaMod += 1;
                wisMod += 1;
                armorClass = 1;
                maxDurability = 30;
                break;
            }
            case "Chain": {
                material = materialType;
                dexMod += 1;
                conMod += 1;
                intMod += 1;
                armorClass = 1;
                maxDurability = 45;
                break;
            }
            case "Iron": {
                material = materialType;
                conMod += 2;
                strMod += 1;
                armorClass = 2;
                maxDurability = 80;
                break;
            }
            case "Gold": {
                material = materialType;
                chaMod += 2;
                conMod += 1;
                strMod -= 1;
                armorClass = 3;
                maxDurability = 50;
                break;
            }
            case "Diamond": {
                material = materialType;
                strMod += 2;
                conMod += 1;
                armorClass = 3;
                maxDurability = 175;
                break;
            }
            case "Netherite": {
                material = materialType;
                conMod += 2;
                strMod += 1;
                dexMod -= 1;
                chaMod += 1;
                armorClass = 4;
                maxDurability = 250;
                break;
            }

            default:
                throw new IllegalStateException("Unexpected value: " + materialType);
        }
    }

    public int getStrMod() {
        return strMod;
    }

    public int getConMod() {
        return conMod;
    }

    public int getDexMod() {
        return dexMod;
    }

    public int getChaMod() {
        return chaMod;
    }

    public int getIntMod() {
        return intMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public void setConMod(int conMod) {
        this.conMod = conMod;
    }

    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }

    public void setChaMod(int chaMod) {
        this.chaMod = chaMod;
    }

    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }

    public void setIntMod(int intMod) {
        this.intMod = intMod;
    }

    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }

    public void setCurrentDurability(int currentDurability) {
        this.currentDurability = currentDurability;
    }

    public void setMaxDurability(int maxDurability) {
        this.maxDurability = maxDurability;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getQuality() {
        return quality;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isBroken() {
        return broken;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public int getCurrentDurability() {
        return currentDurability;
    }
}