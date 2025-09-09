package queue;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {

        System.out.println("This program is made to build a Queue.\n");

        Scanner scanner = new Scanner(System.in); 

        Queue queue=new Queue();

        boolean finished=false;

        while (!finished){
            System.out.println("What do you want to do?\n"+
                "1.enqueue\n"+
                "2.dequeue\n"+
                "3.get head\n"+
                "4.get tail\n"+
                "5.is empty\n"+
                "6.finish");
                String action = scanner.nextLine();

            switch (action){

                case "1":
                System.out.println("\n");
                    System.out.println("What value do you want to enqueue?\n");
                    System.out.println("\n");
                    int value = Integer.parseInt(scanner.nextLine());
                    System.out.println("\n");
                    queue.enqueue(value);
                    System.out.println("You enqueued the value "+value+"\n");
                    break;
                
                case "2":
                    System.out.println("\n");
                    try{
                        int dequeuedValue=queue.dequeue();
                        System.out.println("You popped the value "+dequeuedValue+"\n");
                        System.out.println("\n");
                    }
                    catch (NoSuchElementException e){
                        System.out.println("The Queue is already empty");
                        System.out.println("\n");
                    }
                    break;
                case "3":
                    System.out.println("\n");
                    try{
                        int headValue=queue.getHead().getValue();
                        System.out.println("The head is "+headValue+"\n");
                        System.out.println("\n");
                    }
                    catch (NoSuchElementException e){
                        System.out.println("The queue is empty");
                        System.out.println("\n");
                    }
                    break;
                case "4":
                    System.out.println("\n");
                    try{
                        int tailValue=queue.getTail().getValue();
                        System.out.println("The tail is "+tailValue+"\n");
                        System.out.println("\n");
                    }
                    catch (NoSuchElementException e){
                        System.out.println("The queue is empty");
                        System.out.println("\n");
                    }
                    break;
                case "5":
                    System.out.println("\n");
                    if (queue.isEmpty()){
                        System.out.println("The queue is empty\n");
                        System.out.println("\n");
                    }
                    else{
                        System.out.println("The queue is not empty\n");
                        System.out.println("\n");
                    }
                    break;

                case "6":
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
