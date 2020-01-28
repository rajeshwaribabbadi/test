
public class WeekenBatchStudent extends Student {
	public double calculatefee(String course){
		double fee=0;
		double weekendbatchfee=8000;
		if(course.equals("java")){
			fee=20000;
					}else if(course.equals("oracle")){
						fee=15000;
						
					}else if(course.equals("salesforce")){
						fee=25000;
					}
		return fee+weekendbatchfee;
		
	}

}
