public class Skeleton extends Boss {
    private int numOfArrow ;

    public Skeleton(int numOfArrow ,int health, int damage ) {
        this.numOfArrow = numOfArrow;
    }

    public Skeleton(int health, int damage, WeaponType weapon1, int numOfArrow) {
        super(health, damage, weapon1);
        this.numOfArrow = numOfArrow;
    }

    public int getNumOfArrow() {
        return numOfArrow;
    }

    public void setNumOfArrow(int numOfArrow) {
        this.numOfArrow = numOfArrow;
    }
    public String printInfo (){
        return  super.printInfo() + " Количество Стрел: " + this.numOfArrow;
    }
}
