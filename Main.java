import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String desiredFruit = "";
    float desiredFruitWeight;
    int quantity;
    Scanner scan = new Scanner(System.in);
    System.out.println("Input your desired Fruit");
    desiredFruit = scan.nextLine();
    System.out.println("Input your desired Quantity");
    quantity = scan.nextInt();
    System.out.println("Input your desired Weight");
    desiredFruitWeight = scan.nextFloat();
    calculatePrice(desiredFruitWeight, quantity);
  }

  public static void calculatePrice(float fruitWeight, int qty){
    float priceEachFruit;
    if (fruitWeight>= 8 && fruitWeight <=11 ){
      priceEachFruit = 120.0f-(120.0f*0.05f);
      System.out.printf("The price of each of this fruit which weigh %.2fKg is N%.2f\n", fruitWeight, priceEachFruit);
    }
    else if(fruitWeight>= 12 ){
      priceEachFruit = 120.0f-(120.0f*0.1f);
       System.out.printf("The price of each of this fruit which weigh %.2fKg is N%.2f\n", fruitWeight, priceEachFruit);
    }
    else{
      priceEachFruit = 120;
      System.out.printf("The price of each of this fruit which weigh %.2fKg is N%.2f\n", fruitWeight, priceEachFruit);
    }
    
    System.out.printf("The price of %d fruits is N%.2f\n", qty, priceEachFruit*qty);
    
  }


}