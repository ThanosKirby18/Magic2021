class golem extends Enemies{
    private String element;
    enum Density {
        LOW,
        MEDIUM,
        HIGH
    }
    Density dens;
    public golem (boolean hasClaws, String element){
        super(hasClaws);
        this.element = element;
        checking();
    }
    public String getElement() {
        return element;
    }
    public void setElement(String element) {
        this.element = element;
    }
    private void checking()
    {
        if (element != "magic" || element != "rock" || element != "ice" ) {
            element = "rock";
        }
        setDens();
    }
    private void setDens(){
        if (element == "rock"){
            dens = Density.MEDIUM;
        }
        else if(element == "ice") {
            dens = Density.LOW;
        }
        else{
            dens = Density.HIGH;
        }
    }
    public String toString(){

        String output = super.toString();
        output += "\nThis Golem Is a " + element + " golem. ";
        output += "\nThis Golem has a " + dens + " density";
        return output;
    }
}
