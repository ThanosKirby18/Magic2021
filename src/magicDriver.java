public class magicDriver {
    public static void main(String[] args) {
        goblin kyle = new goblin(true, -2);
        goblin gerome = new goblin(false, 13);
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
        gerald.setWingLength(6.0);
        gerome.setNumClaws(6);
        philus.setElement("Magic");
        System.out.println("Gerald wing is this long " + gerald.checkWing() + "feet");
        System.out.println("gerome has this number of claws " + gerome.checkClaw());
        System.out.println("The Density of Philus is " + philus.setDens());
        System.out.println(joe.toString());
        System.out.println(joe.posSpell());
        System.out.println(goku.toString());
        System.out.println(goku.posSpell());
        System.out.println(jack.toString());
        System.out.println(jack.posSpell());

        joe.setWizardRank(5);
        goku.setMagicType("Anima");

        System.out.println("Goku's Magic type is " + goku.checkRank());
        System.out.println(joe.toString());
        System.out.println(goku.toString());


        System.out.println("Number of Goblin " + goblin.getCount());
        System.out.println("Number of Golems " + golem.getCount());
        System.out.println("Number of dragons " + dragon.getCount());
        System.out.println("Number of Sorcerers  " + sorcerer.getCount());


        System.out.println(gerald.getWingNum());
        System.out.println(goku.getMagicType());
        System.out.println(philus.getElement());
        System.out.println(gerome.getNumClaws());


        
    }
}
