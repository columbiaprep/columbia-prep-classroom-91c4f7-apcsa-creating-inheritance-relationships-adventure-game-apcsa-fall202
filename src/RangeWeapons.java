// Ryder L
public class RangeWeapons {
    //  private String name;
    private int range;
    private int damage;
    private int ammoCapacity;
    private int currentAmmo;
    private int ammoType;
    private double weight;

    public RangeWeapons(int range, int damage, int ammoCapacity, int currentAmmo, int ammoType, double weight) {
        //    this.name = name;
        this.range = range;
        this.damage = damage;
        this.ammoCapacity = ammoCapacity;
        this.currentAmmo = currentAmmo;
        this.ammoType = ammoType;
        this.weight = weight;
    }

    public int getRange() {
        return range;

    }

    public int getDamage() {
        return damage;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public int getCurrentAmmo() {
        return currentAmmo;
    }

    public int getAmmoType() {
        return ammoType;
    }

    public double getWeight() {
        return weight;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDamage(int range) {
        this.damage = damage;
    }

    public void setAmmoCapacity(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
    }

    public void setCurrentAmmo(int currentAmmo) {
        this.currentAmmo = currentAmmo;
    }

    public void setAmmoType(int ammoType) {
        this.ammoType = ammoType;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getStrMod() {
        if (weight > 10) return -1;
        return 0;
    }

    public int getDexMod() {
        if (range > 50) return 2;
        return 0;
    }

    public int getConMod() {
        return 0;
    }

    public int getIntMod() {
        if (ammoType == 1) return 1;
        return 0;
    }

    public int getWisMod() {
        return 0;
    }

    public int getChaMod() {
        return 0;
    }

    public String toString() {
        return "RangeWeapons {" +
                "range=" + range +
                ", damage=" + damage +
                ", ammoCapacity=" + ammoCapacity +
                ", currentAmmo=" + currentAmmo +
                ", ammoType=" + ammoType +
                ", weight=" + weight +
                '}';
    }
    public boolean test(){
        RangeWeapons weapons = new RangeWeapons(60, 10,5,5,1,12.0);
        if (weapons.getStrMod() != -1){
            return false;
        }
        if (weapons.getDexMod() != 2){
            return false;
        }
        if (weapons.getConMod() != 0) {
            return false;
        }
        if(weapons.getIntMod() != 1){
            return false;
        }
        if (weapons.getWisMod() != 0){
            return false;
        }
        if(weapons.getChaMod() != 0){
            return false;
        }

        return true;
    }

}
