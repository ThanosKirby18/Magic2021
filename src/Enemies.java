public abstract class Enemies {

    private boolean hasClaws;

    public Enemies (boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }
    public boolean getHasClaws() {
        return hasClaws;
    }
    // Brain Method
    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

     @Override
    public String toString(){
         return "This Bad Boy Has Claws? " + hasClaws;
     }
}
