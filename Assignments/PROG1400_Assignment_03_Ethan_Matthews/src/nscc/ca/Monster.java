package nscc.ca;
//Abstract Super Class extends from Character.
public abstract class Monster extends Character {

    private String monsterName;
    //Constructor.
    public Monster(String monsterName, int strength, int intelligence, int dexterity, int vitality) {
        super(strength, intelligence, dexterity, vitality);
        this.monsterName = monsterName;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName; }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterName='" + monsterName + '\'' +
                '}';
    }



}
