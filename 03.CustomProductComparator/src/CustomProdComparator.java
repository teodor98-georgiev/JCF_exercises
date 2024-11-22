import java.util.ArrayList;
import java.util.Comparator;
public class CustomProdComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        int result = product1.getCategoryName().compareTo(product2.getCategoryName());
        if (result == 0){
            result = Double.compare(product1.getPrice(), product2.getPrice());
            if (result == 0){
                result = product1.getProductName().compareTo(product2.getProductName());
            }
        }

        return result;
    }

}
