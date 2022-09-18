public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss(1000 ,400 ,WeaponType.randomWeaponType());
        System.out.println("Данные о боссе_______________");
        System.out.println("ЗДОРОВЬЕ: "+ boss.getHealth()+"; " + "УРОН: "+ boss.getDamage()+"; "
                + "ТИП ОРУЖИЯ: " + boss.getWeapon1());
        System.out.println();

        Skeleton skeleton = new Skeleton(30 ,800 ,200);
        Skeleton skeleton1 = new Skeleton(890 ,300 ,WeaponType.COLD_WEAPON,33);
        System.out.println("Данные о Скелетах ______________");
        System.out.println("Количество Стрел: " + skeleton1.getNumOfArrow()+ "; "+
                "ЗДОРОВЬЕ: "+ skeleton1.getHealth() + "; "+"УРОН: " +
                skeleton1.getDamage());
        System.out.println("ЗДОРОВЬЕ: "+ skeleton1.getHealth() + "; "+"УРОН: " +
                skeleton1.getDamage() + "; " +"ТИП ОРУЖИЯ: "+ skeleton1.getWeapon1()
        +"; " +"Количество Стрел: " + skeleton1.getNumOfArrow());




    }
}