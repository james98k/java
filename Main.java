import java.util.*;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    
    Stack<Integer> stack = new Stack<>();
    int sum = 0;
    int temp = 0;

    for(int i = 0; i < length; i++){
      temp = sc.nextInt();

      if(temp == 0){
        temp = stack.pop();
        System.out.println(temp + "has been poped");
      }
      else{
        stack.push(temp);
        System.out.println(temp +"has been pushed");
      }

      // System.out.println(stack[i]);
    }

    

    for(int i = 0; i < stack.size(); i++){
      temp = stack.pop();
      System.out.println(temp + "is added");
      sum += temp;      

    }
    System.out.println(sum);

  }
}
