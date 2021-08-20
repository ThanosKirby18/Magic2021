public class magicDriver {
    public static void main(String[] args) {
        goblin kyle = new goblin(true, -2);
        goblin gerome = new goblin(false, 0);
        dragon gerald = new dragon(true, -1 , -2);
        golem garry = new golem(false, "disease");
        System.out.println(kyle.toString());

        kyle.setNumClaws(7);

        System.out.println("Now Kyle has " + kyle.getNumClaws());

        Enemies[] myEnemies = {kyle, gerome, gerald, garry};
        for(int i = 0; i < myEnemies.length; i++){
            System.out.println(myEnemies[i]);
        }
    }
}
