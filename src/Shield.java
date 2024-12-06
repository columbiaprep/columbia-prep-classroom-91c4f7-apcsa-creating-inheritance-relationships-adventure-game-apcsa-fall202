// Jake W
public class Shield {
    private double weight;
    private int thickness;
    private int hitpoints;
    private String material;
    private int strengthBonus;
    private int dexterityBonus;
    private int constitutionBonus;
    private int intelligenceBonus;
    private int charismaBonus;
    private int wisdomBonus;


    public Shield (String material){

        if (material.equals("wood")) {
            weight = 10;
            thickness = 5;
            hitpoints = 5;
            strengthBonus = 1;
            dexterityBonus = -1;
            constitutionBonus = 1;
            intelligenceBonus = 0;
            charismaBonus = 0;
            wisdomBonus = 0;
        }
        if (material.equals("steel")) {
            weight = 20;
            thickness = 10;
            hitpoints = 10;
            strengthBonus = 2;
            dexterityBonus = -2;
            constitutionBonus = 2;
            intelligenceBonus = 0;
            charismaBonus = 0;
            wisdomBonus = 0;
        }
        else {
            System.out.println("Shield material unavailable");
        }
    }
    public boolean test(){
      Shield testMaterial = new Shield("steel");
      if (!testMaterial.getMaterial().equals("steel")){
          return false;
      }
        if (!(testMaterial.getStrMod() == 2)){
            return false;
        }
        if (!(testMaterial.getDexMod() == -2)){
            return false;
        }
        if (!(testMaterial.getConMod() == 2)){
            return false;
        }
        if (!(testMaterial.getIntMod() == 0)){
            return false;
        }
        if (!(testMaterial.getChaMod() == 0)){
            return false;
        }
        if (!(testMaterial.getWisMod() == 0)){
            return false;
        }

      return true;
    }

    public int getStrMod(){
        return strengthBonus;
    }
    public void setStrengthBonus(int newStrengthBonus){
        strengthBonus = newStrengthBonus;
    }

    public int getDexMod(){
        return dexterityBonus ;
    }
    public void setDexterityBonus(int newDexterityBonus){
        dexterityBonus = newDexterityBonus;
    }
    public int getConMod(){
        return constitutionBonus;
    }
    public void setConstitutionBonus(int newConstitutionBonus){
        constitutionBonus = newConstitutionBonus;
    }
    public int getIntMod(){
        return intelligenceBonus;
    }
    public void setIntelligenceBonus(int newIntelligenceBonus){
        intelligenceBonus = newIntelligenceBonus;
    }
    public int getChaMod(){
        return charismaBonus;
    }
    public void setCharismaBonus(int newCharismaBonus){
        charismaBonus = newCharismaBonus;
    }
    public void setWeight(double newWeight) {
        weight = newWeight;
    }
    public void setThickness(int newThickness) {
        thickness = newThickness;
    }
    public void setHitPoints(int newHitPoints) {
        hitpoints = newHitPoints;
    }
    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }
    public String getMaterial() {
        return material;
    }

    public void setWisdomBonus(int wisdomBonus) {
        this.wisdomBonus = wisdomBonus;
    }

    public int getWisMod() {
        return wisdomBonus;
    }
}
