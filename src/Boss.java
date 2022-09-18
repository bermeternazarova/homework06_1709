public class Boss  extends GameEntity{
   private WeaponType weapon1 ;

    public Boss(int health, int damage, WeaponType weapon1) {
        super(health, damage);
        this.weapon1 = weapon1;
    }

    public Boss() {

    }

    public WeaponType getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(WeaponType weapon1) {
        this.weapon1 = weapon1;
    }

    public String printInfo (){
        return  "��������: "+this.health +"; "+"����: " +
                this.damage + "; "+ "��� ������: "+ this.weapon1 ;
    }
}
