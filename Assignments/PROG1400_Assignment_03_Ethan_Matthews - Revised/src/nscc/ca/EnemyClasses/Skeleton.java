package nscc.ca.EnemyClasses;

import javax.swing.*;

//Monster Class extends from Player & Character.
public class Skeleton extends Monster {

    private int resurrectionCharge;
    private ImageIcon skeletonImage;
    //Constructor
    public Skeleton(String monsterName, int strength, int intelligence, int dexterity, int vitality, int resurrectionCharge) {
        super(monsterName, strength, intelligence, dexterity, vitality);
        this.resurrectionCharge = resurrectionCharge;
        this.skeletonImage = new ImageIcon(this.getClass().getResource("/Images/Skeleton_Warrior.png"));
    }
    //Getters
    public int getResurrectionCharge() {
        return resurrectionCharge;
    }

    public ImageIcon getSkeletonImage() { return skeletonImage; }
    //Setters.
    public void setResurrectionCharge(int resurrectionCharge) { this.resurrectionCharge = resurrectionCharge; }

    public void setSkeletonImage(ImageIcon skeletonImage) { this.skeletonImage = skeletonImage; }

    //To String formats text for skeleton output in battle screen.
    @Override
    public String toString() {
        return
        String.format("%1$-20s","\n Monster: " + getMonsterName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength()) + String.format("%1$-20s", "Vitality: " + getVitality()) + String.format("%1$-20s", "Intelligence: " + getIntelligence()) + String.format("%1$-20s","Dexterity: " + getDexterity()) + "\n" +
        String.format("%1$-19s"," Special: ") + String.format("%1$-19s", "Resurrection Charge: " +  getResurrectionCharge());
    }


}