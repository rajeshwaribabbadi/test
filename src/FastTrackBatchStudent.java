
public class FastTrackBatchStudent extends Student {
	public double calculatefee(String course){
		double fee=0;
		double fasttrackfee=5000;
		if(course.equals("java")){
			fee=20000;
					}else if(course.equals("oracle")){
						fee=15000;
						
					}else if(course.equals("salesforce")){
						fee=25000;
					}
		return fee+fasttrackfee;
		
	}


}
