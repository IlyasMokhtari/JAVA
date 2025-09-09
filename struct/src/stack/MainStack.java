package stack;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MainStack {
    public static void main(String[] args) {

        System.out.println("This program is made to build a Stack.\n");

        Scanner scanner = new Scanner(System.in); 

        Stack stack=new Stack();

        boolean finished=false;

        while (!finished){
            System.out.println("What do you want to do?\n"+
                "1.push\n"+
                "2.pop\n"+
                "3.peek\n"+
                "4.is empty\n"+
                "5.finish");
                String action = scanner.nextLine();

            switch (action){

                case "1":
                System.out.println("\n");
                    System.out.println("What value do you want to push?\n");
                    System.out.println("\n");
                    int value = Integer.parseInt(scanner.nextLine());
                    System.out.println("\n");
                    stack.push(value);
                    System.out.println("You pushed the value "+value+"\n");
                    break;
                
                case "2":
                    System.out.println("\n");
                    try{
                        int poppedValue=stack.pop();
                        System.out.println("You popped the value "+poppedValue+"\n");
                        System.out.println("\n");
                    }
                    catch (EmptyStackException e){
                        System.out.println("The stack is already empty");
                        System.out.println("\n");
                    }
                    break;
                case "3":
                    System.out.println("\n");
                    try{
                        int topValue=stack.getTop().getValue();
                        System.out.println("The top is "+topValue+"\n");
                        System.out.println("\n");
                    }
                    catch (EmptyStackException e){
                        System.out.println("The stack is empty");
                        System.out.println("\n");
                    }
                    break;
                case "4":
                    System.out.println("\n");
                    if (stack.isEmpty()){
                        System.out.println("The stack is empty\n");
                        System.out.println("\n");
                    }
                    else{
                        System.out.println("The stack is not empty\n");
                        System.out.println("\n");
                    }
                    break;
                case "5":
                    System.out.println("\n");
                    System.out.println("Thank you for using my program");
                    finished=true;
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("Try again");
                    System.out.println("\n");
                    break;
            }
        }
        scanner.close();
    }

}

        