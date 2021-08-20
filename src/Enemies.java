public abstract class Enemies {


    private boolean hasClaws;

    public Enemies (boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }




     @Override
    public String toString(){
         return "This Bad Boy Has Claws? " + hasClaws;
     }
}
