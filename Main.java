import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        while(true) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");

            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    hotel.displayRooms();
                    break;

                case 2:

                    System.out.print("Enter Room Number: ");

                    int roomNo = sc.nextInt();

                    hotel.bookRoom(roomNo);

                    break;

                case 3:

                    System.out.print("Enter Room Number: ");

                    int cancelNo = sc.nextInt();

                    hotel.cancelBooking(cancelNo);

                    break;

                case 4:

                    System.out.println("Thank You!");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}