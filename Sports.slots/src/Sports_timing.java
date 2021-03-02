
import java.util.*;

import org.junit.Test;
public class Sports_timing {
	static String name;
	static int slotchoice;
	static int n;
	Scanner sc = new Scanner(System.in);
	@Test
	public void sport_choice() throws Exception{
		System.out.println("@@--SunRise sports club--@@");
		System.out.println("Enter your name");
		name = sc.nextLine();
		sc.nextLine();
		System.out.print("1.Badminton Court  ");
		System.out.print("2.Foodball  ");
		System.out.print("3.Box Cricket  ");
		int sport_choice = sc.nextInt();
		System.out.println("Select your sport serial number to continue booking");
		switch (sport_choice) {
		case 1:

			Badminton();
			break;
		case 2:

			Foodball();
			break;
		case 3:

			Boxcricket();
			break;
		default :
			System.out.println("Please select displayed serial numbers only");
		}

	}

	static Map<Integer, String> badmintonslots = new HashMap<Integer, String>();
	//@Test
	public void Badminton() throws Exception{
		System.out.println("Available slots");
		badmintonslots.forEach((k,v)-> System.out.println(k+" "+v));
		System.out.println("Please select the Corresponding slot number to Book");
		slotchoice= sc.nextInt();
		if(badmintonslots.get(slotchoice)!= null)
		{
			System.out.println("Your slot is "+badmintonslots.get(slotchoice));
			System.out.println("Booking sucessfull, Thank you for booking "+name);
			badmintonslots.remove(slotchoice);
			System.out.println(" Press 1 for new booking");
			System.out.println(" Press 0 for exit");
			n = sc.nextInt();
			if(n==1){ sport_choice();}
			else{System.exit(0);}
		}
		else {System.out.println("Slot is already booked");}
	}

	static Map<Integer, String> foodballslots = new HashMap<Integer, String>();
	//@Test
	public void Foodball() throws Exception{
		System.out.println("Available slots");
		foodballslots.forEach((k,v)-> System.out.println(k+" "+v));
		System.out.println("Please select the Corresponding slot number to Book");
		slotchoice = sc.nextInt();
		if(foodballslots.get(slotchoice)!= null)
		{
			System.out.println("Your slot is "+foodballslots.get(slotchoice));
			System.out.println("Booking sucessfull, Thank you for booking"+name);


			foodballslots.remove(slotchoice);
			System.out.println(" Press 1 for new booking");
			System.out.println(" Press 0 for exit");
			n = sc.nextInt();
			if(n==1){ sport_choice();}
			else{System.exit(0);}

		}
		else {System.out.println("Slot is already booked");}
	}
	static Map<Integer, String> boxcricketslots = new HashMap<Integer, String>();
	//@Test
	public void Boxcricket() throws Exception{
		System.out.println("Available slots");
		boxcricketslots.forEach((k,v)-> System.out.println(k+" "+v));
		System.out.println("Please select the Corresponding slot number to Book");
		slotchoice = sc.nextInt();
		if(boxcricketslots.get(slotchoice)!= null)
		{
			System.out.println("Your slot is  "+boxcricketslots.get(slotchoice));
			System.out.println("Booking sucessfull, Thank you for booking"+name);


			boxcricketslots.remove(slotchoice);
			System.out.println(" Press 1 for new booking");
			System.out.println(" Press 0 for exit");
			n = sc.nextInt();
			if(n==1){ sport_choice();}
			else{System.exit(0);}


		}
		else {System.out.println("Slot is already booked");}
	}
	public static void main(String[] args) throws Exception {


		//badminton slot data
		badmintonslots.put(1, "8:00Am - 9:00Am");
		badmintonslots.put(2, "9:00Am - 10:00Am");
		badmintonslots.put(3, "10:00Am - 11:00Am");
		badmintonslots.put(4, "11:00Am - 12:00Pm ");
		badmintonslots.put(5, "12:00Pm - 1:00Pm");
		badmintonslots.put(6, "1:00Pm - 2:00Pm");
		badmintonslots.put(7, "2:00Pm - 3:00Pm");
		badmintonslots.put(8, "3:00Pm - 4:00Pm");
		badmintonslots.put(9, "4:00Pm - 5:00Pm");
		badmintonslots.put(10, "5:00Pm - 6:00Pm");

		// food ball slots data
		foodballslots.put(1, "7:30Am - 8:00Am");
		foodballslots.put(2, "8:00Am - 8:30Am");
		foodballslots.put(3, "8:30Am - 9:00Am");
		foodballslots.put(4, "9:00Am - 9:30Am");
		foodballslots.put(5, "9:30Am - 10:00Am");
		foodballslots.put(6, "10:00Am - 10:30Am");
		foodballslots.put(7, "10:30Am - 11:00Am");
		foodballslots.put(8, "11:00Am - 11:30Am");
		foodballslots.put(9, "11:30Am - 12:00Pm");
		foodballslots.put(10, "12:00Pm - 12:30Pm");
		foodballslots.put(11, "12:30Pm - 1:00Pm");
		foodballslots.put(12, "1:00Pm - 1:30Pm");
		foodballslots.put(13, "1:30Pm - 2:00Pm");
		foodballslots.put(14, "2:00Pm - 2:30Pm");
		foodballslots.put(15, "2:30Pm - 3:00Pm");
		foodballslots.put(16, "3:30Pm - 4:00Pm");
		foodballslots.put(17, "4:00Pm - 4:30Pm");
		foodballslots.put(18, "4:30Pm - 5:00Pm");
		foodballslots.put(19, "5:00Pm - 5:30Pm");
		foodballslots.put(20, "5:30Pm - 6:00Pm");
		//Box cricket data

		boxcricketslots.put(1, "7Am - 9Am");
		boxcricketslots.put(1, "9Am - 11Am");
		boxcricketslots.put(1, "11Am - 1pm");
		boxcricketslots.put(1, "1Pm - 3Pm");
		boxcricketslots.put(1, "3Pm - 5Pm");

		Sports_timing st = new Sports_timing();
		st.sport_choice();



	}

}


