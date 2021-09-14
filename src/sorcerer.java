import java.util.ArrayList;
public class sorcerer {
    private int wizardRank;
    private static int numWizard;
    private String magicType;
    ArrayList<String> Spell = new ArrayList<String>();
    public sorcerer ( int wizardRank, String magicType){
        this.wizardRank = wizardRank;
        this.magicType = magicType;
        checkRank();
        posSpell();
    }
    public int getWizardRank() {
        return wizardRank;
    }
    public void setWizardRank(int wizardRank) {
        this.wizardRank = wizardRank;
    }
    public String getMagicType() {
        return magicType;
    }
    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }

    public void checkRank(){
        if (wizardRank <= 0){
            wizardRank = 1;
        }
        if (magicType != "Anima" && magicType != "Light" && magicType != "Dark"){
            magicType = "Anima";
        }
    }
    public void posSpell(){
        Spell.clear();
        if (magicType == "Anima") {
            if(wizardRank >= 1){
                Spell.add("Fire");
            }
            if(wizardRank >= 2){
                Spell.add("Thunder");
            }
            if(wizardRank >= 3){
                Spell.add("ElFire");
            }
            if(wizardRank >= 4){
                Spell.add("Fimbulvetr");
            }
            if(wizardRank >= 5){
                Spell.add("Excalibur");
            }
        }
        if (magicType == "Light"){
            if(wizardRank >= 1){
                Spell.add("Lighting");
            }
            if(wizardRank >= 2){
                Spell.add("Shine");
            }
            if(wizardRank >= 3){
                Spell.add("Divine");
            }
            if(wizardRank >= 4){
                Spell.add("Aura");
            }
            if(wizardRank >= 5){
                Spell.add("Luce");
            }
        }
        if (magicType == "Dark"){
            if(wizardRank >= 1){
                Spell.add("Flux");
            }
            if(wizardRank >= 2){
                Spell.add("Luna");
            }
            if(wizardRank >= 3){
                Spell.add("Nosferatu");
            }
            if(wizardRank >= 4){
                Spell.add("Fenrir");
            }
            if(wizardRank >= 5){
                Spell.add("Gespenst");
            }
        }
    }

    public String toString(){
        numWizard++;
        String output = "";
        output += "\nYour "+ magicType +" Sorcerer is Rank #" + wizardRank;
        output += "\nHe can use these Spells:";
        output += "\nThere are/is " + numWizard + " Sorcerer ";
        for (int i = 0; i < Spell.size(); i++) {
            output += "\n" + Spell.get(i);
        }
        return output;


    }

}
