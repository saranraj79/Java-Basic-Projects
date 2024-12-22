 class Purchase {
    String product;
    int price;
    String category;

    public void Show() {
        System.out.println(category + " : " + product + " : " + price);
    }

}

public class Ecommerce {
    public static void main(String[] args) {

        Purchase s1 = new Purchase ();
        	s1.product = "Air-cooler";
        	s1.price = 2000;
        	s1.category = "Electronics";

        Purchase s2 = new Purchase ();
        	s2.product = "LED light";
        	s2.price = 500;
        	s2.category = "Electronics";

        Purchase s3 = new Purchase ();
        	s3.product = "Smart TV";
        	s3.price = 30000;
        	s3.category = "Electronics";

        s1.Show();
        s2.Show();
        s3.Show();

    }
}