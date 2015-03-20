import java.util.ArrayList;

public class SurvivalOfTheFittest
{
   private static ArrayList<Animal> animals = new ArrayList<Animal>();
   private static Life life = new Life();
   
   public static void main(String[] args)
   {
      addAnimals();
      life.checkForCheaters(animals);
      life.sortAnimals(animals);
      
      //run life as long as there's at least two animals left
      while(animals.size() > 1)
         life.survive(animals);
         
      if (animals.size() > 0)   
         System.out.println("The sole survivor is... " + animals.get(0).toString().toUpperCase());
      else
         System.out.println("It is a cruel world...");
   }
   
   public static void addAnimals()
   {
      animals.add(new ExampleAnimal("Two", 25));
      animals.add(new ExampleAnimal("Four", 20));
      animals.add(new ExampleAnimal("Three", 22));
      animals.add(new ExampleAnimal("Five", 10));
      animals.add(new ExampleAnimal("One", 30));
      animals.add(new ExampleCheatingAnimal(100, 100, 100));
   }
   
}