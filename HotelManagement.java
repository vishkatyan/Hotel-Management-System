package com.rdec.hotelmanagement;
import java.util.Scanner;
public class HotelManagement {
// For Star Printing
     public void pattern(){
         for (int i=1;i<=5;i++){
             try{
                 System.out.print(" * ");
                 Thread.sleep(500);
             }
             catch(InterruptedException ex){
                 ex.printStackTrace();
             }
         }
     }
    // For Printing only
    public void printing(){

        // for chair table
        System.out.println();
        System.out.println("Enter your table no ranging from 1 to 5 for first floor...");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        logic(a);

        // For Food Menu
        System.out.println("Food Menu");
        pattern();
        System.out.println();
        System.out.println("Press 1 for Breakfast" + "\n" + "Press 2 for Lunch" + "\n" + "Press 3 for Dinner");
        int ch = sc.nextInt();
        switch(ch){
            case 1: {
                // For Breakfast Menu
                System.out.println("Breakfast Menu...");
                System.out.println("1. Boiled Egg + Bread - 400 INR");
                System.out.println("2. French Toast + Juice - 500 INR");
                System.out.println("3. Sandwich + Tea/Coffee - 300 INR");
                System.out.println("4. Poha + Tea/Coffee - 350 INR");
                System.out.println("Enter the number to choose breakfast: ");
                int breakfast = sc.nextInt();
                System.out.println("Enter the plates for breakfast: ");
                int plates = sc.nextInt();
                switch(breakfast){
                    case 1: {
                        System.out.println("Your Total Bill is " +plates*400 +"\n" + "Thankyou : )");
                        break;
                    }
                case 2: {
                        System.out.println("Your Total Bill is " +plates*500 +"\n" + "Thankyou : )");
                        break;
                    }
                case 3: {
                        System.out.println("Your Total Bill is " +plates*300 +"\n" + "Thankyou : )");
                        break;
                    }
                case 4: {
                        System.out.println("Your Total Bill is " +plates*350 +"\n" + "Thankyou : )");
                        break;
                    }
                    default: {
                        System.out.println("Please choose again");
                    }
                }
                break;
            }
            case 2: {
                // For Lunch Menu
                System.out.println("Lunch Menu...");
                System.out.println("1. Indian Plate - 950 INR");
                System.out.println("2. South Indian Plate - 900 INR");
                System.out.println("3. Italian - 1000 INR");
                System.out.println("4. Continential - 1150 INR");
                System.out.println("Enter the number to choose for lunch: ");
                int lunch = sc.nextInt();
                System.out.println("Enter the plates for lunch: ");
                int plates = sc.nextInt();
                switch(lunch){
                    case 1: {
                        System.out.println("Your Total Bill is " +plates*950 +"\n" + "Thankyou : )");
                        break;
                    }
                    case 2: {
                        System.out.println("Your Total Bill is " +plates*900 +"\n" + "Thankyou : )");
                        break;
                    }
                    case 3: {
                        System.out.println("Your Total Bill is " +plates*1000 +"\n" + "Thankyou : )");
                        break;
                    }
                    case 4: {
                        System.out.println("Your Total Bill is " +plates*1150 +"\n" + "Thankyou : )");
                        break;
                    }
                    default: {
                        System.out.println("Please choose again");
                    }
                }
              break;
            }
            case 3: {
                // For Dinner Menu...
                System.out.println("Dinner Menu...");
                System.out.println("1. Indian - 1100 INR");
                System.out.println("2. Continential - 1200 INR");
                System.out.println("3. Italian - 1300 INR");
                System.out.println("4. South Indian - 1350 INR");
                System.out.println("Enter the number to choose for dinner: ");
                int dinner = sc.nextInt();
                System.out.println("Enter the plates for breakfast: ");
                int plates = sc.nextInt();
                switch(dinner){
                    case 1: {
                        System.out.println("Your Total Bill is " +plates*1100 +"\n" + "Thankyou : )");
                        break;
                    }
                    case 2: {
                        System.out.println("Your Total Bill is " +plates*1200+"\n" + "Thankyou : )");
                        break;
                    }
                    case 3: {
                        System.out.println("Your Total Bill is " +plates*1300 +"\n" + "Thankyou : )");
                        break;
                    }
                    case 4: {
                        System.out.println("Your Total Bill is " +plates*1350 +"\n" + "Thankyou : )");
                        break;
                    }
                    default: {
                        System.out.println("Please choose again");
                    }
                }
                break;
            }
            default: {
                System.out.println("Please choose again");
            }
        }

    }
// For Total chair table
    public void logic(int a){
        switch(a){
            case 1: {
                System.out.println("Your Total Chair and Table is 4");
                break;
            }
            case 2: {
                System.out.println("Your Total Chair and Table is 6");
                break;
            }
            case 3: {
                System.out.println("Your Total Chair and Table is 8");
                break;
            }
            case 4: {
                System.out.println("Your Total Chair and Table is 3");
                break;
            }
            case 5: {
                System.out.println("Your Total Chair and Table is 5");
                break;
            }
            default: {
                System.out.println("No such table no found");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Management System");
        HotelManagement hm = new HotelManagement();
        hm.pattern();
        hm.printing();
    }
}
