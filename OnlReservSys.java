import java.util.Scanner;
public class OnlReservSys {
    private static boolean isValidUser(String loginId, String password) {
        return true;
    }    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Login form
        System.out.println("Enter your login id:");
        String loginId = input.nextLine();
        System.out.println("Enter your password:");
        String password = input.nextLine();
        if (isValidUser(loginId, password)) {
            // Reservation form
            System.out.println("Enter your name:");
            String basicDetails = input.nextLine();
            System.out.println("Enter train number:");
            String trainNumber = input.nextLine();
            System.out.println("Enter class type:\n1.AC Executive Chair\n2.AC First Class\n3.AC Two Tier\n4.AC Three Tier\n5.First Class\n6.Chair Class\n7.Sleeper Class\n8.General class");
            String classType = input.nextLine();
            System.out.println("Enter Adhar Number:");
            int Adharnum = input.nextInt();
            System.out.println("Enter date of journey:");
            String dateOfJourney = input.next();
            System.out.println("Enter from (place):");
            String from = input.next();
            System.out.println("Enter to (destination):");
            String to = input.next();
            reserveTicket(basicDetails, trainNumber,Adharnum ,classType, dateOfJourney, from, to);
            System.out.println("Press 1 to cancel ticket");
            Scanner sc1= new Scanner(System.in);
            int input1 = sc1.nextInt();
            if(input1==1){
                System.out.println("Confirm Password");
                String confirmPassword=input.next();
                    System.out.println("Enter Ticket number");
                    Scanner sc3 = new Scanner(System.in);
                    int PRN = sc3.nextInt();
                    cancelTicket(PRN);
            }
        } else {
            System.out.println("Invalid login credentials.");
        }
    }
    private static void reserveTicket(String basicDetails, String trainNumber,int Adharnum,String classType, String dateOfJourney, String from, String to) {
        System.out.println("Ticket is reserved successfully"+"\nName :"+ basicDetails +"\nTrain Number"+ trainNumber + "\nClass" +classType+"\nDate :"+dateOfJourney+"\nFrom:"+from+"\nTo:"+to); }
    private static void cancelTicket(int pnrNumber) {
        System.out.println("Ticket is cancelled");
    }
    }