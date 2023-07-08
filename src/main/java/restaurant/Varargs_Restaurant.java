package restaurant;

public class Varargs_Restaurant {
    /*
        Java programında, bir restoranın menüsündeki yemeklerin fiyatlarını hesaplayan bir metot yazmanız isteniyor.
        Metot, menüdeki yemeklerin isimlerini ve ardından fiyatlarını almalıdır.
        Menüdeki yemeklerin fiyatları toplamını döndüren ve menüye hiç yemek eklenmediğinde sıfır döndüren bir metot yazın.
    */

    public static void main(String[] args) {
        double totalPrice = totalPriceCalculate("Soup", "16.55", "Salad", "23.99", "Pizza", "55.99");
        System.out.println("Total Price: " + totalPrice + " $ ");

    }

    public static double totalPriceCalculate(String... foods){
        double total = 0;
        System.out.println("...Welcome to GOOD FOODS Restaurant...");
        System.out.println("_________________________");
        for (int i = 0; i < foods.length; i+=2) {
            String foodName = foods[i];
            double foodPrice = Double.parseDouble(foods[i+1]);
            total += foodPrice;
            System.out.println(foodName + " = " + foodPrice + " TL");
        }
        System.out.println("_________________________");
        return total;
    }
}
