public class Weapon  {
    private WeaponType gun ;
    private WeaponType bomb;
    private  WeaponType knife ;

     public  Weapon  (WeaponType gun,WeaponType bomb ,WeaponType knife){
         this.gun = gun;
         this.bomb = bomb;
         this.knife= knife;
     }


    public WeaponType getGun() {
        return gun;
    }

    public void setGun(WeaponType gun) {
        this.gun = gun;
    }

    public WeaponType getRifle() {
        return bomb;
    }

    public void setRifle(WeaponType bomb) {
        this.bomb = bomb;
    }

    public WeaponType getKnife() {
        return knife;
    }

    public void setKnife(WeaponType knife) {
        this.knife = knife;
    }
}
