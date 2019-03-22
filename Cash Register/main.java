public class Main {

    public static void main(String[] args) {
        Product fujiApples = new Product("Fuji Apples",4131,false,.49,75,"Produce");
        Product apricots = new Product("Apricots",4218,false,.39,75,"Produce");
        Product oranges = new Product("Orange",1,false,.45,50,"Produce");
        Product strawberries = new Product("Strawberries",2,false,.51,100,"Produce");
        Product watermelon = new Product("Watermelon",3,false,1.29,200,"Produce");
        Product bread = new Product("Bread",4,false,3.50,25,"Dry Good");
        Product grapes = new Product("Grapes",5,false,4.00,39,"dairy");

        System.out.println(fujiApples);
        System.out.println(apricots);
        System.out.println(oranges);
        System.out.println(strawberries);
        System.out.println(watermelon);
        System.out.println(bread);
        System.out.println(grapes);
    }
}
