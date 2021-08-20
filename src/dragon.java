public class dragon extends Enemies {
    private int wingNum;
    private double wingLength;

    public dragon (boolean hasClaws, int wingNum, double wingLength){
        super(hasClaws);
        this.wingNum = wingNum;
        this.wingLength = wingLength;
        checking();
    }
    public int getWingNum() {
        return wingNum;
    }
    public double getWingLength() {
        return wingLength;
    }
    public void setWingNum(int wingNum) {
        this.wingNum = wingNum;
    }
    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }
    private void checking()
    {
        if (wingNum < 0) {
            wingNum = 2;
        }
        if (wingLength < 0){
            wingLength = 2.3;
        }
    }
    public String toString(){

        String output = super.toString();
        output += "\nThis Dragon Has " + wingNum + " wings. \n The wings are " + wingLength + " feet long";
        return output;
    }
}
