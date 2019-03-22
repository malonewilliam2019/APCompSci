import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players=new ArrayList<PlayerCharacter>();
        players.add(new Fighter ("Doug"));
        players.add(new Mage("Sheila"));
        players.add(new Paladin("Wilbur"));
        players.add(new Priest("Gary"));

        for (PlayerCharacter x:players){
            if (x instanceof Priest){
                System.out.println("Here is a Priest");
                x.showStats();
            }
        }

    }
}
