public class Product {String name;

    int code;

    boolean taxed;

    double price;

    int quantity;

    String type;

    public Product(String newName, int newCode, boolean newTax, double newPrice, int newQuantity, String newType) {

        name = newName;
        code = newCode;
        taxed = newTax;
        price = newPrice;
        quantity = newQuantity;
        type = newType;

        System.out.printf("%d units of %s, are priced at $%.2f, is %s, and is in our %s department.\n",quantity,name,price,taxed ? "taxable" : "not taxable",type);
    }
}
