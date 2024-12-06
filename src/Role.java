// Aubrey S
public class Role {
    private String name;
    private int roleLevel;
    public Role(String _name) {
        if (_name.equals("Paladin")) {
            //set bonusHardiness to 2
            //set bonusWisdom to 0
        }
        else if (_name.equals("Rogue") || _name.equals("Assassin")) {

        }
        else {
            throw new java.lang.Error("Oops");
        }

        if (10 > roleLevel && roleLevel > 5) {

        }
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public int getChaMod() {
        return 200;
    }


    public boolean test() {
        Role r = new Role("Fighter");
        if (!r.getName().equals("Fighter")) {
            return false;
        }

        //check if getChaMod() function returns
        //within -2 to 2 inclusive

        return true;
    }
}
//nbjdskubgdbsuakbgdasukgas
