
public class Student {
	//encapuslating student
private int studentid;
private String name;
private double mobile;
private String address;
private String course;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMobile() {
	return mobile;
}
public void setMobile(double mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public double calculatefee(String course){
	double fee=0;
	if(course.equals("java")){
		fee=20000;
				}else if(course.equals("oracle")){
					fee=15000;
					
				}else if(course.equals("salesforce")){
					fee=25000;
				}
	return fee;
	
}
}
