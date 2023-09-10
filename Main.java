import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    YesOrNo check = new YesOrNo();
    Scanner input = new Scanner(System.in);
    Confident testing = new Confident();
    int whatToDo = 0;
    String wantWork = "";
    System.out.println("Are you bored???");
    String sureInput = input.nextLine();
    String wantToDo = " ";
    if (check.YON(sureInput)){
      testing.checkConfidence();
    } else {
      System.out.println("Ok, bye!!!!!!!");
      System.exit(0);
    }
    System.out.println("Ok, ok, you win");
    System.out.println("Do you want something to do?");
    wantWork = input.nextLine();
    while (check.YON(wantWork)) {
      whatToDo = rand.nextInt(6);
      if (whatToDo == 0){
        System.out.println("Do you want to paint?");
        String paintInput = input.nextLine();
        if (check.YON(paintInput)){
          int painting = rand.nextInt(11);
          System.out.println("You could paint...");
          if (painting == 0) {
            System.out.println("A cat");
          }
          if (painting == 1) {
            System.out.println("A Disney character");
          }
          if (painting == 2) {
            System.out.println("Smth for me?");
          }
          if (painting == 3) {
            System.out.println("A sunset");
          }
          if (painting == 4) {
            System.out.println("A quote");
          }
          if (painting == 5) {
            System.out.println("A squishmallow");
          }
          if (painting == 6) {
            System.out.println("A skyline");
          }
          if (painting == 7) {
            System.out.println("A beach");
          }
          if (painting == 8) {
            System.out.println("A bird");
          }
          if (painting == 9) {
            System.out.println("A MINION!!!");
          }
          if (painting == 10) {
            System.out.println("A spider!");
          }
          System.out.println("Are you still bored?");
          wantWork = input.nextLine();
        }
      }
      if (whatToDo == 1){
        System.out.println("Do you want to read?");
        wantToDo = input.nextLine();
        if (check.YON(wantToDo)){
          System.out.println("Are you still bored?");
          wantWork = input.nextLine();
        }
      }
      if (whatToDo == 2){
        System.out.println("Do you want to go for a walk?");
        wantToDo = input.nextLine();
        if (check.YON(wantToDo)){
          System.out.println("Are you still bored?");
          wantWork = input.nextLine();
        }
      }
      if (whatToDo == 3){
        System.out.println("Do you want to swim?");
        wantToDo = input.nextLine();
        if (check.YON(wantToDo)){
          System.out.println("Are you still bored?");
          wantWork = input.nextLine();
        }
      }
      if (whatToDo == 4){
        System.out.println("RAWR!!!");
      }
      if (whatToDo == 5){
        System.out.println("You could pick what you're gonna wear tmrw, do you want to do that?");
        wantToDo = input.nextLine();
        if (check.YON(wantToDo)){
          System.out.println("Do you want help with that?");
          String wantHelpClothes = input.nextLine();
          if (check.YON(wantHelpClothes)){
            int shirtColor = 0;
            int shirt = 0;
            int shorts = 0;
            String wantShirtColor = "";
            String likeOutfit = "";
            System.out.println("What season is it? (fall, winter summer, or spring)");
            String season = input.nextLine();
            while (season.contains("fall") || season.contains("Fall")){
              shirt = rand.nextInt(5);
              shorts = rand.nextInt(4);
              while (shorts != 3 && shirt == 3) {
                shirt = rand.nextInt(4);
              }
              while (shorts == 3 && shirt != 3) {
                shorts = rand.nextInt(4);
              }
              if (shirt == 0) {
                System.out.println("You could wear a T-shirt, do you want a color?");
                wantShirtColor = input.nextLine();
                if (check.YON(wantShirtColor)){
                  shirtColor = rand.nextInt(10);
                  if (shirtColor == 0){
                    System.out.println("You could wear a blue shirt");
                  }
                  if (shirtColor == 1){
                    System.out.println("You could wear a pink shirt");
                  }
                  if (shirtColor == 2){
                    System.out.println("You could wear a black shirt");
                  }
                  if (shirtColor == 3){
                    System.out.println("You could wear a green shirt");
                  }
                  if (shirtColor == 4){
                    System.out.println("You could wear a grey shirt");
                  }
                  if (shirtColor == 5){
                    System.out.println("You could wear a purple shirt");
                  }
                  if (shirtColor == 6){
                    System.out.println("You could wear a pink shirt");
                  }
                  if (shirtColor == 7){
                    System.out.println("You could wear a orange(central) shirt");
                  }
                  if (shirtColor == 8){
                    System.out.println("You could wear a white shirt");
                  }
                  if (shirtColor == 9){
                    System.out.println("You could wear a yellow shirt");
                  }
                }
              }
              if (shirt == 1) {
                System.out.println("You could wear a crop top");
              }
              if (shirt == 2) {
                System.out.println("You could wear a tank top");
              }
              if (shirt == 3) {
                System.out.println("You could wear a sweatshirt hint hint *wink wink*");
              }
              if (shirt == 4) {
                System.out.println("You could wear a long sleeve shirt");
              }
              if (shorts == 0) {
                System.out.println("You could wear black shorts");
              }
              if (shorts == 1) {
                System.out.println("You could wear tight shorts(no comment)");
              }
              if (shorts == 2) {
                System.out.println("You could wear jean shorts");
              }
              if (shorts == 3) {
                System.out.println("You could wear leggings");
              }
              System.out.println("Do you like this outift?");
              likeOutfit = input.nextLine();
              if (check.YON(likeOutfit)){
                season = "";
              }
            }
            while (season.contains("winter") || season.contains("Winter")){
              shirt = rand.nextInt(3);
              shorts = rand.nextInt(2);
              if (shirt == 0) {
                System.out.println("You could wear a long sleeve shirt");
              }
              if (shirt == 1) {
                System.out.println("You could wear a crop top");
              }
              if (shirt == 2) {
                System.out.println("You could wear a sweatshirt hint hint *wink wink* *nudge nudge*");
              }
              if (shorts == 0) {
                System.out.println("You could wear legginings(frfr no comment)");
              }
              if (shorts == 1) {
                System.out.println("You could wear sweatpants");
              }
              System.out.println("Do you like this outift?");
              likeOutfit = input.nextLine();
              if (check.YON(likeOutfit)){
                season = "";
              }
            }
            while (season.contains("spring") || season.contains("Spring")){
              shirt = rand.nextInt(6);
              shorts = rand.nextInt(5);
              while (shorts != 3 && shirt == 3) {
                shirt = rand.nextInt(4);
              }
              while (shorts == 3 && shirt != 3) {
                shorts = rand.nextInt(4);
              }
              if (shirt == 0) {
                System.out.println("You could wear a T-shirt, do you want a color?");
                wantShirtColor = input.nextLine();
                if (check.YON(wantShirtColor)){
                  shirtColor = rand.nextInt(10);
                  if (shirtColor == 0){
                    System.out.println("You could wear a blue shirt");
                  }
                  if (shirtColor == 1){
                    System.out.println("You could wear a pink shirt");
                  }
                  if (shirtColor == 2){
                    System.out.println("You could wear a black shirt");
                  }
                  if (shirtColor == 3){
                    System.out.println("You could wear a green shirt");
                  }
                  if (shirtColor == 4){
                    System.out.println("You could wear a grey shirt");
                  }
                  if (shirtColor == 5){
                    System.out.println("You could wear a purple shirt");
                  }
                  if (shirtColor == 6){
                    System.out.println("You could wear a pink shirt");
                  }
                  if (shirtColor == 7){
                    System.out.println("You could wear a orange(central) shirt");
                  }
                  if (shirtColor == 8){
                    System.out.println("You could wear a white shirt");
                  }
                  if (shirtColor == 9){
                    System.out.println("You could wear a yellow shirt");
                  }
                }
              }
              if (shirt == 1) {
                System.out.println("You could wear a crop top");
              }
              if (shirt == 2) {
                System.out.println("You could wear a tank top");
              }
              if (shirt == 4) {
                System.out.println("You could wear a sweatshirt hint hint *wink wink*");
              }
              if (shirt == 5) {
                System.out.println("You could wear a long sleeve shirt");
              }
              if (shorts == 0) {
                System.out.println("You could wear black shorts");
              }
              if (shorts == 1) {
                System.out.println("You could wear tight shorts(no comment)");
              }
              if (shorts == 2) {
                System.out.println("You could wear jean shorts");
              }
              if (shorts == 4) {
                System.out.println("You could wear leggings");
              }
              if (shorts == 3 && shirt == 3) {
                System.out.println("You could wear a dress(it'd look nice)");
              }
              System.out.println("Do you like this outift?");
              likeOutfit = input.nextLine();
              if (check.YON(likeOutfit)){
                season = "";
              }
            }
            while (season.contains("summer") || season.contains("Summer")){
              shirt = rand.nextInt(4);
              shorts = rand.nextInt(4);
              while (shorts != 3 && shirt == 3) {
                shirt = rand.nextInt(4);
              }
              while (shorts == 3 && shirt != 3) {
                shorts = rand.nextInt(4);
              }
              if (shirt == 0) {
                System.out.println("You could wear a T-shirt, do you want a color?");
                wantShirtColor = input.nextLine();
                if (check.YON(wantShirtColor)){
                  shirtColor = rand.nextInt(10);
                  if (shirtColor == 0){
                    System.out.println("You could wear a blue shirt");
                  }
                  if (shirtColor == 1){
                    System.out.println("You could wear a pink shirt");
                  }
                  if (shirtColor == 2){
                    System.out.println("You could wear a black shirt");
                  }
                  if (shirtColor == 3){
                    System.out.println("You could wear a green shirt");
                  }
                  if (shirtColor == 4){
                    System.out.println("You could wear a grey shirt");
                  }
                  if (shirtColor == 5){
                    System.out.println("You could wear a purple shirt");
                  }
                  if (shirtColor == 6){
                    System.out.println("You could wear a pink shirt");
                  }
                  if (shirtColor == 7){
                    System.out.println("You could wear a orange(central) shirt");
                  }
                  if (shirtColor == 8){
                    System.out.println("You could wear a white shirt");
                  }
                  if (shirtColor == 9){
                    System.out.println("You could wear a yellow shirt");
                  }
                }
              }
              if (shirt == 1) {
                System.out.println("You could wear a crop top");
              }
              if (shirt == 2) {
                System.out.println("You could wear a tank top");
              }
              if (shorts == 0) {
                System.out.println("You could wear black shorts");
              }
              if (shorts == 1) {
                System.out.println("You could wear tight shorts(no comment)");
              }
              if (shorts == 2) {
                System.out.println("You could wear jean shorts");
              }
              if (shorts == 3 && shirt == 3) {
                System.out.println("You could wear a Summer dress(it'd look nice)");
              }
              System.out.println("Do you like this outift?");
              likeOutfit = input.nextLine();
              if (check.YON(likeOutfit)){
                season = "";
              }
            }
          }
          System.out.println("Are you still bored?");
          wantWork = input.nextLine();
        }
      }
    }
    System.out.println("Ok, bye!!!!!!!");
    System.exit(0);
  }
}
