public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss(1000 ,400 ,WeaponType.randomWeaponType());
        System.out.println("������ � �����_______________");
        System.out.println("��������: "+ boss.getHealth()+"; " + "����: "+ boss.getDamage()+"; "
                + "��� ������: " + boss.getWeapon1());
        System.out.println();

        Skeleton skeleton = new Skeleton(30 ,800 ,200);
        Skeleton skeleton1 = new Skeleton(890 ,300 ,WeaponType.COLD_WEAPON,33);
        System.out.println("������ � �������� ______________");
        System.out.println("���������� �����: " + skeleton1.getNumOfArrow()+ "; "+
                "��������: "+ skeleton1.getHealth() + "; "+"����: " +
                skeleton1.getDamage());
        System.out.println("��������: "+ skeleton1.getHealth() + "; "+"����: " +
                skeleton1.getDamage() + "; " +"��� ������: "+ skeleton1.getWeapon1()
        +"; " +"���������� �����: " + skeleton1.getNumOfArrow());




    }
}