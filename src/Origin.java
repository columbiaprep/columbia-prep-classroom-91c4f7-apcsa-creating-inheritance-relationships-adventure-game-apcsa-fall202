public class Origin {
    private String place;
    private String language;
    private String occupation;
    private String alignment;
    private String bonusOne;
    private String bonusTwo;

    public Origin(String place, String language, String occupation, String alignment, String bonusOne, String bonusTwo){
        this.place = place;
        this.language = language;
        this.occupation = occupation;
        this.alignment = alignment;

        if (bonusOne.equals("Strength") || bonusOne.equals("Intelligence") || bonusOne.equals("Wisdom") || bonusOne.equals("Charisma") || bonusOne.equals("Constitution") || bonusOne.equals("Dexterity")){
            this.bonusOne = bonusOne;
        }
        else{
            throw new java.lang.Error("Bonus one is not a valid ability score");
        }

        if (bonusTwo.equals("Strength") || bonusTwo.equals("Intelligence") || bonusTwo.equals("Wisdom") || bonusTwo.equals("Charisma") || bonusTwo.equals("Constitution") || bonusOne.equals("Dexterity")){
            this.bonusTwo = bonusTwo;
        }
        else{
            throw new java.lang.Error("Bonus one is not a valid ability score");
        }
    }

    public int getStrMod(){
        if (bonusOne.equals("Strength")){
            return 2;
        }
        if (bonusTwo.equals("Strength")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int getIntMod(){
        if (bonusOne.equals("Intelligence")){
            return 2;
        }
        if (bonusTwo.equals("Intelligence")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int getWisMod(){
        if (bonusOne.equals("Wisdom")){
            return 2;
        }
        if (bonusTwo.equals("Wisdom")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int getChaMod(){
        if (bonusOne.equals("Charisma")){
            return 2;
        }
        if (bonusTwo.equals("Charisma")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int getConMod(){
        if (bonusOne.equals("Constitution")){
            return 2;
        }
        if (bonusTwo.equals("Constitution")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int getDexMod(){
        if (bonusOne.equals("Dexterity")){
            return 2;
        }
        if (bonusTwo.equals("Dexterity")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public String getAlignment(){
        return alignment;
    }

    public String getOccupation(){
        return occupation;
    }

    public String getPlace(){
        return place;
    }

    public String getLanguage(){
        return language;
    }

    public String getBonusOne(){
        return bonusOne;
    }

    public String getBonusTwo(){
        return bonusTwo;
    }

    public void setAlignment(String alignment){
        this.alignment = alignment;
    }

    public void setPlace(String place){
        this.place = place;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public void setBonusOne(String bonusOne){
        if (bonusOne.equals("Strength") || bonusOne.equals("Intelligence") || bonusOne.equals("Wisdom") || bonusOne.equals("Charisma") || bonusOne.equals("Constitution") || bonusOne.equals("Dexterity")){
            this.bonusOne = bonusOne;
        }
        else{
            throw new java.lang.Error("Bonus one is not a valid ability score");
        }
    }

    public void setBonusTwo(){
        if (bonusTwo.equals("Strength") || bonusTwo.equals("Intelligence") || bonusTwo.equals("Wisdom") || bonusTwo.equals("Charisma") || bonusTwo.equals("Constitution") || bonusOne.equals("Dexterity")){
            this.bonusTwo = bonusTwo;
        }
        else{
            throw new java.lang.Error("Bonus one is not a valid ability score");
        }
    }

    public boolean test(){
        Origin testOne = new Origin("Forest", "Sanskrit", "Wizard", "Lawful", "Wisdom", "Constitution");
        Origin testTwo = new Origin("Forest", "Sanskrit", "Wizard", "Lawful", "Charisma", "Strength");
        if (!(testOne.getChaMod() == 0)){
            return false;
        }
        if (!(testOne.getStrMod() == 0)){
            return false;
        }
        if (!(testOne.getIntMod() == 0)){
            return false;
        }
        if (!(testOne.getWisMod() == 2)){
            return false;
        }
        if (!(testOne.getConMod() == 1)){
            return false;
        }
        if (!(testOne.getDexMod() == 0)){
            return false;
        }
        if (!(testTwo.getChaMod() == 2)){
            return false;
        }
        if (!(testTwo.getStrMod() == 1)){
            return false;
        }
        if (!(testTwo.getIntMod() == 0)){
            return false;
        }
        if (!(testTwo.getWisMod() == 0)){
            return false;
        }
        if (!(testTwo.getConMod() == 0)){
            return false;
        }
        if (!(testTwo.getDexMod() == 0)){
            return false;
        }


        return true;
    }
}