// Max I
public class Gauntlets{
    private int equipmentID;

    private static final int maxEquipmentID = 1;

    private static final int[][] gauntletsStats = {
            {0, 2}, // strengthModifier
            {0, -1}, // dexterityModifier
            {0, 0}, // intelligenceModifier
            {0, 0}, // wisdomModifier
            {0, 1}, // constitutionModifier
            {0 ,0} // charismaModifier
    };

    private static final double[] sellStats = {
            0.00,9.99
    };

    private static final String[][] nameData = {
            {"Bandages", "Iron Gauntlets"}, // equipmentName
            {"\u001B[36m", "\u001B[35m"} // equipmentColor
    };

    public Gauntlets(int _equipmentID){
        equipmentID = _equipmentID;
    }

    public Gauntlets(){
        equipmentID = 0;
    }

    public int getEquipmentID(){
        return equipmentID;
    }

    public int getModifier(String _statName, int _equipmentID){
        if(_equipmentID>maxEquipmentID){
            System.out.println("Invalid Gauntlets ID");
            return 0;
        }
        int toReturn = switch(_statName){
            case "strength" -> gauntletsStats[0][equipmentID];
            case "dexterity" -> gauntletsStats[1][equipmentID];
            case "intelligence" -> gauntletsStats[2][equipmentID];
            case "wisdom" -> gauntletsStats[3][equipmentID];
            case "constitution" -> gauntletsStats[4][equipmentID];
            case "charisma"-> gauntletsStats[5][equipmentID];
            default -> 999;
        };
        if (toReturn == 999){
            System.out.println("Invalid stat name given");
            return 0;
        };
        return toReturn;
    }

    public int getModifier(String _statName){
        return getModifier(_statName,equipmentID);
    }

    public double getSellValue(int _equipmentID){
        if(_equipmentID > maxEquipmentID){
            System.out.println("Invalid Gauntlets ID");
            return 0.00;
        }
        return sellStats[equipmentID];
    }

    public double getSellValue(){
        return getSellValue(equipmentID);
    }

    public String getNameData(String _statName, int _equipmentID){
        if(_equipmentID>maxEquipmentID){
            System.out.println("Invalid Gauntlets ID");
            return "";
        }
        String toReturn = switch(_statName) {
            case "equipmentName" -> nameData[0][equipmentID];
            case "equipmentColor" -> nameData[1][equipmentID];
            default -> "error";
        };
        if (toReturn == "error"){
            System.out.println("Invalid stat name given");
            return "";
        }

        return toReturn;
    }

    public String getNameData(String _statName){
        return getNameData(_statName,equipmentID);
    }

    public void replaceGauntlets(int _equipmentID){
        equipmentID = _equipmentID;
    }

    public double sellGauntlets(){
        double tempSellPrice = getSellValue();
        equipmentID = 0;
        return tempSellPrice;
    }

    public void displayGauntletsData(){
        String whiteColor = "\u001B[37m";
        System.out.println(getNameData("equipmentColor") + getNameData("equipmentName"));
        System.out.print(whiteColor);
        System.out.println(
                "sell price: " + getSellValue() + "\n" +
                        "strength: " + getModifier("strength") + "\n" +
                        "dexterity: " + getModifier("dexterity") + "\n" +
                        "intellegence: " + getModifier("intellegence") + "\n" +
                        "wisdom: " + getModifier("wisdom") + "\n" +
                        "constitution: " + getModifier("constitution") + "\n" +
                        "charisma: " + getModifier("charisma") + "\n"
        );
        return;
    }

    // The code below is redundant
    public int getStrMod(){return getModifier("strength");}
    public int getDexMod(){return getModifier("dexterity");}
    public int getConMod(){return getModifier("intelligence");}
    public int getIntMod(){return getModifier("wisdom");}
    public int getWisMod(){return getModifier("constitution");}
    public int getChaMod(){return getModifier("charisma");}


    public boolean test(){
        Gauntlets testGauntlets = new Gauntlets(0);
        testGauntlets.replaceGauntlets(1);
        if(!(testGauntlets.getEquipmentID() == 1)){
            return false;
        }
        if(!(testGauntlets.getModifier("strength") == 2)){
            return false;
        }
        if(!(testGauntlets.getModifier("dexterity") == -1)){
            return false;
        }
        if(!(testGauntlets.getModifier("intelligence") == 0)){
            return false;
        }
        if(!(testGauntlets.getModifier("wisdom") == 0)){
            return false;
        }
        if(!(testGauntlets.getModifier("constitution") == 1)){
            return false;
        }
        if(!(testGauntlets.getModifier("charisma") == 0)){
            return false;
        }
        if(!(testGauntlets.getSellValue() == 9.99)){
            return false;
        }
        if(!(testGauntlets.getNameData("equipmentName").equals("Iron Gauntlets"))){
            return false;
        }
        if(!(testGauntlets.getNameData("equipmentColor").equals("\u001B[35m"))){
            return false;
        }
        return true;
    }
}