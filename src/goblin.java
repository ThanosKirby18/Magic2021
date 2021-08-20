public class goblin extends Enemies {
    //  Instance Variables
    private int numClaws;
    //Constructor
    public goblin (boolean hasClaws, int numClaws){
        super(hasClaws);
        this.numClaws = numClaws;
        checking();
    }
    // Getters and Setters
    public int getNumClaws() {
        return numClaws;
    }
    // Brain Method
    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }
    private void checking()
    {
        if (numClaws < 0) {
            numClaws = 10;
        }

    }
    // ToString

    public String toString(){
        String output = super.toString();
               output += "\nThis Goblin Has " + numClaws + " claws.";
        return output;
    }
}
