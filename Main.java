import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го сорта среди товаров, название которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        Products products1 = new Products("высший", "1", 200);
        Products products2 = new Products("высший", "1", 180);
        Products products3 = new Products("средний", "1", 185);
        Products products4 = new Products("высший", "2", 176);
        Products products5 = new Products("высший", "1", 205);
        List<Products> listProducts = new ArrayList<>();
        listProducts.add(products1);
        listProducts.add(products2);
        listProducts.add(products3);
        listProducts.add(products4);
        listProducts.add(products5);
        String search="1";
        Integer maxPrice = 0;
        Set<String> setName = new HashSet<>();
        Set<String> setGrade = new HashSet<>();
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().equals("высший")) {
                if (listProducts.get(i).getGrade().equals(search)) {
                    setGrade.add(listProducts.get(i).getGrade());
                    setName.add(listProducts.get(i).getName());
                    if (listProducts.get(i).getPrice() > max) {
                    maxPrice = listProducts.get(i).getPrice();
                }
            }
        }
        System.out.println("setName= " + setName);
        System.out.println("setGrade= " + setGrade);
        System.out.println("maxPrice= " + maxPrice);

    }
}
