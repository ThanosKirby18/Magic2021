public class magicDriver {
    public static void main(String[] args) {
        goblin kyle = new goblin(true, -2);
        goblin gerome = new goblin(false, 0);
        dragon gerald = new dragon(true, -1 , -2);
        dragon barney = new dragon(true, -2 , 8.9);
        golem garry = new golem(false, "disease");
        golem philus = new golem(false, "ice");
        sorcerer joe = new sorcerer(3, "Light");
        sorcerer goku = new sorcerer(5, "Dark");
        sorcerer jack = new sorcerer(1, "ds");
        System.out.println(kyle.toString());

        kyle.setNumClaws(7);

        System.out.println("Now Kyle has " + kyle.getNumClaws());

        Enemies[] myEnemies = {kyle, gerome, gerald, barney, garry, philus};
        for(int i = 0; i < myEnemies.length; i++){
            System.out.println(myEnemies[i]);
        }
        System.out.println(joe.toString());
        System.out.println(goku.toString());
        System.out.println(jack.toString());

        joe.setWizardRank(5);
        goku.setMagicType("Anima");

        System.out.println(joe.toString());
        System.out.println(goku.toString());
    }
}
