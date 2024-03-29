package nscc.ca.CharacterClasses;
//Abstract Super Class Character.
public abstract class Character {
    private int strength;
    private int vitality;
    private int intelligence;
    private int dexterity;
    private int agility;
    //Constructor
    protected Character(int strength, int vitality, int intelligence, int dexterity, int agility) {
        this.strength = strength;
        this.vitality = vitality;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.agility = agility;
    }

    protected int getStrength() {
        return strength;
    }

    protected int getIntelligence() {
        return intelligence;
    }

    protected int getDexterity() {
        return dexterity;
    }

    protected int getVitality() {
        return vitality;
    }

    protected int getAgility() { return agility; }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public abstract String toString();
}
