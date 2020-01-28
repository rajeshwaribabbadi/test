import java.util.Scanner;

public class OnlineTraining {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CorporateWeekendBatchStudent cwbs =new CorporateWeekendBatchStudent();
    WeekenBatchStudent wbs = new WeekenBatchStudent();
    CorporateBatchStudent cbs = new CorporateBatchStudent();
    FastTrackBatchStudent fbs = new FastTrackBatchStudent();
    while(true){
    System.out.println("-----------------------------------");
    System.out.println("      online training school       ");
    System.out.println("-----------------------------------");
    System.out.println("|          1.fast track batch        /");
    System.out.println("|          2.corporate batch         /");
    System.out.println("|         3.weekend track batch      /");
    System.out.println("| 4.corporate weekend track batch    /");
    System.out.println("|          5.exit                    /");
    System.out.println("enter your choice?");
     int choice=sc.nextInt();

     switch(choice){
     case 1:
    	 System.out.println("enter course name");
    	 System.out.println("selected course amouunt:"+fbs.calculatefee(sc.next()));
    	 break;
     case 2:
    	 System.out.println("enter course name");
    	 System.out.println("selected course amouunt:"+cbs.calculatefee(sc.next()));
    	 break;
     case 3:
    	 System.out.println("enter course name");
    	 System.out.println("selected course amouunt:"+wbs.calculatefee(sc.next()));
    	 break;
     case 4:
    	 System.out.println("enter course name");
    	 System.out.println("selected course amouunt:"+cwbs.calculatefee(sc.next()));
    	 break;
     case 5:System.exit(0);
     break;
     default:
    	 System.out.println("please select choice range 1-5 only");
    
    	 
     }

	}

}
}