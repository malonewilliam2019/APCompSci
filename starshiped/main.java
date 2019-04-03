import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Overall available fleet:");

        ArrayList<Starship> fleet = new ArrayList<Starship>();

        String registry[] =  new String[]{"Reliant","Enterprise","Yorktown","Saratoga","Voyager","Discovery","Constitution","Constellation","Grissom","Defiant","Intrepid","Britaan","Stargazer","Yamato","Iowa","Galaxy","Ambassador","Nimitz","Equinox","Relativity"};

        for(int i=0;i<5;i++) {
            fleet.add(new Escort(registry[i]));
        }
        for(int i=5;i<10;i++) {
            fleet.add(new Frigate(registry[i]));
        }
        for(int i=10;i<15;i++) {
            fleet.add(new Cruiser(registry[i]));
        }
        for(int i=15;i<20;i++) {
            fleet.add(new Battleship(registry[i]));
        }

        System.out.println(fleet.size());

        ArrayList<IsDefense> defBattalion = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int shields = 0;
            int maxIndex = 0;
            for (int j = 0; j < fleet.size(); j++) {
                if ((fleet.get(j).shield > shields) && (fleet.get(j) instanceof IsDefense)) {
                    shields = fleet.get(j).shield;
                    maxIndex = j;
                }
            }
        }

        ArrayList<IsOffense> offBattalion = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int hulls = 0;
            int maxIndex = 0;
            for (int j = 0; j < fleet.size(); j++) {
                if ((fleet.get(j).hull > hulls) && (fleet.get(j) instanceof IsOffense)) {
                    hulls = fleet.get(j).hull;
                    maxIndex = j;
                }
            }


    }
    }
}

