import java.util.Random;

public class Fighter extends PlayerCharacter{


    private int constitution;

    public Fighter( String newName){
        name = newName;
        System.out.println("A fighter named " + name + " has been created!");

        Random rand=new Random();

        strength=15+(rand.nextInt(6)+1 );
        inteligence=7+(rand.nextInt(6)+1 );
        agility=8+(rand.nextInt(6)+1 );
        constitution=10+(rand.nextInt(6)+1 );

        MP=MPmax=0;
        HP=HPmax=(strength*2)+(constitution*2);

        showStats();
        System.out.println("There are "+count+" characters");
    }

    public void showStats(){
        System.out.printf("%s, a Fighter:\n",name);
        super.showStats();
        System.out.printf("CON:%3d\n",constitution);
    }
}
