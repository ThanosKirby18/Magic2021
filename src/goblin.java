public class goblin extends Enemies {
    //  Instance Variables
    private int numClaws;
    private static int numGob;
    //Constructor
    public goblin (boolean hasClaws, int numClaws){
        super(hasClaws);
        this.numClaws = numClaws;
        checkClaw();
    }
    // Getters and Setters
    public int getNumClaws() {
        return numClaws;
    }
    // Brain Method
    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }
    private void checkClaw() {
        if (numClaws < 0) {
            numClaws = 10;
        }

    }
    // ToString

    public String toString(){
        numGob++;
        String output = super.toString();
               output += "\nThis Goblin Has " + numClaws + " claws.";
               output += "\nThere are/is " + numGob + " Goblins";
        return output;
    }
}
