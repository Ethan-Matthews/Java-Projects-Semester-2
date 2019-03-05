package nscc.ca;

public class Bow extends Equipment{

    private int rangeModifier;

    public Bow(int weight, int attack, int rangeModifier) {
        super(weight, attack);
        this.rangeModifier = rangeModifier;
    }

    public int getRangeModifier() {
        return rangeModifier;
    }

    @Override
    public String toString() {
        return String.format("%1$-16s"," Weapon:") + String.format("%1$-19s", "Weight: " + getWeight()) + String.format("%1$-20s", "Attack: " + getAttack())+ String.format("%1$-17s", "Range Modifier: " + getRangeModifier()) + "\n";

    }


}
