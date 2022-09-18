import java.util.Random;

public enum WeaponType {
    FIRE_WEAPON , ATOMIC , COLD_WEAPON;
    private  static  final Random PRNG = new Random();
    public  static  WeaponType randomWeaponType (){
        WeaponType[] weaponTypes = values();
        return  weaponTypes[PRNG.nextInt(weaponTypes.length)];
    }


}
