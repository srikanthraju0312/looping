import java.util.*;
/**
 * This program simulates the traffic light
 */

class traffic{
    public static void main(String[] args) {
        int simulate;
        String con;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("1 - Red");
        System.out.println("2 - Yellow");
        System.out.println("3 - Green");
        System.out.print("Want would you like to signal: ");
        simulate = sc.nextInt();
        try{
            if (simulate == 1) {
                System.out.println("It's a red signal. Stop!!!");
            }
            else if(simulate == 2){
                System.out.println("It's yellow. Wait until it's green");
            }
            else if(simulate == 3){
                System.out.println("It's green. You can start moving");
            }
            else{
                System.out.println("Sorry, Invalid input!!!");
                    
            }
            System.out.print("Do you like to continue or end(y/n): ");
            con = sc.nextLine();
            while (con=="y" || con=="Y") {
                continue;
            }
            System.out.println("Simulation Ended.");
            }
            finally {
            sc.close();
            }
    }
    }

