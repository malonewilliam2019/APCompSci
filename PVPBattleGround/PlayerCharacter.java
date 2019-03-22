public abstract class PlayerCharacter {
    protected String name;

    protected int strength;
    protected int inteligence;
    protected int agility;

    protected int HP,HPmax;
    protected int MP,MPmax;

    protected static int count;

    public PlayerCharacter( ){
        count++;
    }
    public void showStats(){
        System.out.printf("HP:%3d/%3d\n",HP,HPmax);
        System.out.printf("MP:%3d/%3d\n",MP,MPmax);
        System.out.printf("STR:%3d\nINT:%3d\nAGI:%3d\n",strength,inteligence,agility);
    }


}
