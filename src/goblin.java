public class goblin extends Enemies {
    //  Instance Variables
    private int numClaws;
    //Constructor
    public goblin (boolean hasClaws, int numClaws){
        super(hasClaws);
        this.numClaws = numClaws;
        checkClaw();
        count++;
    }
    private static int count;

    public static int getCount ()
    {
        return count;
    }
    // Getters and Setters
    public int getNumClaws() {
        return numClaws;
    }
    // Brain Method
    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }
    public int checkClaw() {
        if (numClaws < 0) {
            numClaws = 10;
        }
        return numClaws;

    }
    // ToString

    public String toString(){
        String output = super.toString();
               output += "\nThis Goblin Has " + numClaws + " claws.";
        return output;
    }
}
