// Max B
public class Helmet {
    private int modifier;
    private String helmetType;
    private int durability;
    private double weight;
    private String rarity;


    public int getModifier() {
        return modifier;
    }

    public String getHelmetType() {
        return helmetType;
    }

    public int getDurability() {
        return durability;
    }

    public double getWeight() {
        return weight;
    }

    public String getRarity() {
        return rarity;
    }




    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public void setHelmetType(String helmetType) {
        this.helmetType = helmetType;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }



    public Helmet(String helmetType) {
        this.helmetType = helmetType;

        if(helmetType.equals("Gold")){
            this.durability = 100;
            this.weight = 1.5;
            this.rarity = "Gold";
        }
        else if (helmetType.equals("Silver")){
            this.durability = 50;
            this.weight = 1.0;
            this.rarity = "Silver";
        }
        else if (helmetType.equals("Bronze")){
            this.durability = 25;
            this.weight = 5;
            this.rarity = "Bronze";
        }

        if (helmetType.equals("Gold")) {
            modifier = +2;
        } else if (helmetType.equals("Silver")) {
            modifier = +1;
        } else if (helmetType.equals("Bronze")) {
            modifier = +0;
        }

    }


    public String toString() {
        return "Helmet{" + "type = " + helmetType +
                ", durability = " + durability +
                ", rarity = " + rarity +
                '}';
    }


    public boolean test(){
        Helmet G = new Helmet("Gold");
        if (!G.getHelmetType().equals("Gold")) {
            return false;
        }
        else if (G.getDurability() != 100) {
            return false;
        }
        else if (!G.getRarity().equals("Gold")) {
            return false;
        }
        else if(G.getStrMod() != 2){
            return false;
        }

        return true;
    }



    public int getStrMod(){
        return modifier;
    }

    public int getDexMod(){
        return 0;
    }

    public int getConMod(){
        return 0;
    }

    public int getIntMod(){
        return 0;
    }

    public int getWisMod(){
        return 0;
    }

    public int getChaMod(){
        return 0;
    }

}
