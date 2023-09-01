class alaram1{
public String alarmClock(int day, boolean vacation) {
 if((day>=1 && day<=5) && vacation==false)
 {
 return "7:00";
 }
 else if((day==0 || day==6) && vacation==false)
 {
 return "10:00";
 }
 else if(day>=1 && day<=5 && vacation==true)
 {
 return "10:00";
 }
 else
 {
 return "off";
 }
 }
public static void main(String[] args) {
	clock(1,false);
	clock(5,false);
	clock(0,false);
}
}