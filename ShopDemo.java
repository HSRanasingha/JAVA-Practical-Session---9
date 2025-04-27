import java.util.Scanner;
class ShopDemo{
    
    static String description[] = {"Bread", "Milk Powder", "Tooth paste"};
    static int unitPrice[] = {160, 1060, 260};
    
    static byte[] itemBasketIndex = new byte[3];
    static int[] itemBasketQuantity = new int[3];
    
    static void getItems(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Demo Shop");
        System.out.println("Please select your item by entering the number");
        char userOption = 'y';
        int basketIndex = 0;
        
        do {
            for (int i = 0; i < description.length; i++) {
                System.out.println("Enter " + i + " for " + description[i]);
            }
            
            int itemIndex = sc.nextInt();
            
            System.out.println("You have chosen " + description[itemIndex]);
            System.out.println("Unit price of " + description[itemIndex] + " is " + unitPrice[itemIndex]);
            
            System.out.println("Enter the Quantity");
            int numberOfUnits = sc.nextInt();
            
            itemBasketIndex[basketIndex] = (byte) itemIndex;
            itemBasketQuantity[basketIndex] = numberOfUnits;
            basketIndex++;
            
            System.out.println("Enter y to continue, press any other key to Exit");
            
            userOption = sc.next().charAt(0);
        }
        while (userOption == 'y' && basketIndex < 3);
    }
    
    static void showBasket(){
        System.out.println("No \t\t Item \t\t Unit price \t\t Quantity \t\t Price ");
        
        for (int i = 0; i < itemBasketIndex.length; i++) {
            System.out.println(i + " \t\t " + description[itemBasketIndex[i]] + " \t\t " 
                               + unitPrice[itemBasketIndex[i]] + " \t\t " 
                               + itemBasketQuantity[i] + " \t\t " 
                               + (itemBasketQuantity[i] * unitPrice[itemBasketIndex[i]]));
        }
    }
    
    public static void main(String[] args){
        getItems();
        showBasket();
    }
}

