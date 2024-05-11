import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.Month;
import java.net.InetAddress;
import java.util.Scanner;

public class Main {


    public static void selller1()  {
        String name ="Martin Vazovsky";
        LocalDate birthday = LocalDate.of(1998, Month.FEBRUARY, 15);
        int contracts = 250;
        int selledCarrots = 2000;
        String town = "pardubice";
        String SPZ = "2P4 2589";
        double fuelCar = 8.6;



        System.out.println("his name is " + name);
        System.out.println("his birtday is " + birthday);
        System.out.println("he did more that " + contracts + " constracts");
        System.out.println("over all he did sell " + selledCarrots + " carrots");
        System.out.println("you can find him in " + town);
        System.out.println("sellers SPZ is " + SPZ);
        System.out.println("seller car is consuming " + fuelCar + " litrs of fuel on 100 km");

    }

    public static void seller2(){
        String name ="Dan Horký";
        LocalDate birthday = LocalDate.of(2001, Month.JULY, 25);
        int contracts = 4;
        int selledCarrots = 100;
        String town = "Hradec Králové";
        String SPZ = "4h9 8512";
        double fuelCar = 6.2;


        System.out.println("Seller name is " + name);
        System.out.println("Seller birthday is " + birthday);
        System.out.println("He has over " + contracts + " contracts");
        System.out.println("He did sell over " + selledCarrots + " carrots");
        System.out.println("Seller is working in " + town);
        System.out.println("he has Skoda and his spz is " + SPZ);
        System.out.println("His car is consuming " + fuelCar + " litrs of fuel on 100 km");
    }

    public static void seller3(){
        String name ="Šárka Hofmanová";
        LocalDate birthday = LocalDate.of(1999, Month.DECEMBER, 2);
        int contracts = 73;
        int selledCarrots = 890;
        String town = "Brno";
        String SPZ = "4B7 3520";
        double fuelCar = 7.5;



        System.out.println("Seller name is " + name);
        System.out.println("Seller birthday is " + birthday);
        System.out.println("She has over " + contracts + " contracts");
        System.out.println("She did sell over " + selledCarrots + " carrots");
        System.out.println("Seller is working in " + town);
        System.out.println("Sher spz is " + SPZ);
        System.out.println("Her car is consuming " + fuelCar + " litrs of fuel on 100 km");
    }

    public static void main(String[] args) throws UnknownHostException {
        InetAddress notebook1 = InetAddress.getByName("172.67.196.82");
        InetAddress notebook2 = InetAddress.getByName("182.45.190.12");
        InetAddress notebook3 = InetAddress.getByName("210.12.205.10");
        InetAddress notebook4 = InetAddress.getByName("103.25.109.90");

        Scanner chose = new Scanner(System.in);

        System.out.println("do you need to know corporatets notebook ip write: notebook, if seller with experience write: seller1, if without experience write" +
                " seller2, if you need female seller write: selller3");

        String desition = chose.nextLine();

        switch (desition){
            case "notebook":
                System.out.println(notebook1);
                System.out.println(notebook2);
                System.out.println(notebook3);
                System.out.println(notebook4);
            break;
            case "seller1":
                selller1();
            break;
            case "seller2":
                seller2();
            break;
            case "seller3":
                seller3();
            default:
                System.out.println("you did write that wrong");
        }
    }
}

