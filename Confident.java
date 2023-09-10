import java.util.Scanner;
import java.util.Random;

class Confident {
  Random sure = new Random();
  Scanner tester = new Scanner(System.in);
  YesOrNo check = new YesOrNo();
  public void checkConfidence(){
    String answer = "yes";
    int times = sure.nextInt(6);
    while (times == 0){
      times = sure.nextInt(6);
    }
    int lastSaying = 999;
    while (check.YON(answer)){
      int saying = sure.nextInt(7);
      if (saying == 0){
          System.out.println("Are you surreeeee????????");
          answer = tester.nextLine();
        }
      if (saying == 1 && saying != lastSaying){
          System.out.println("You surreeee?????");
          answer = tester.nextLine();
        }
      if (saying == 2 && saying != lastSaying){
          System.out.println("You 1000%%???");
          answer = tester.nextLine();
        }
      if (saying == 3 && saying != lastSaying){
          System.out.println("You confident??");
          answer = tester.nextLine();
        }
      if (saying == 4 && saying != lastSaying){
          System.out.println("You suuuurrrreeeee???");
          answer = tester.nextLine();
        }
      if (saying == 5 && saying != lastSaying){
          System.out.println("You not gonna change your answer??????");
          answer = tester.nextLine();
        }
      if (saying == 6 && saying != lastSaying){
          System.out.println("You for surrreeee???????");
          answer = tester.nextLine();
        }
      if (times != lastSaying){
        times = times - 1;
      }
      if (times == 0){
        break;
      }
      lastSaying = saying;
    }
    if (!check.YON(answer)) {
      System.out.println("Ok, bye!");
      System.exit(0);
    }
  }
}
