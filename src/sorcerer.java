public class sorcerer {
    private int wizardRank;
    private String magicType;
    public sorcerer ( int wizardRank, String magicType){
        this.wizardRank = wizardRank;
        this.magicType = magicType;
    }
    public int geWizardRank() {
        return wizardRank;
    }
    public String getWingLength() {
        return magicType;
    }
    public void setWizardRank(int wizardRank) {
        this.wizardRank = wizardRank;
    }
    public void getMagicType(String magicType) {
        this.magicType = magicType;
    }

}
