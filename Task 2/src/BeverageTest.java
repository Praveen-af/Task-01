import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want extras with your tea (yes/no)?");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.println("Do you want extras with your coffee(yes/no)?");
        boolean coffeeExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        Beverages tea = new Tea();
        tea.setWantExtras(teaExtras);
        Beverages coffee = new Coffee();
        coffee.setWantExtras(coffeeExtras);

        System.out.println("Making Tea...");
        tea.finalTemplateMethod();

        System.out.println("\n Making coffee...");
        coffee.finalTemplateMethod();
        scanner.close();

    }
}
