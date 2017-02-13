package date;

public class Date {
    private int year;
    private int month;
    private int day;
    private int total;
    
    public Date(){
       year = 0;
       month = 0;
       day = 0;
       total = 0;
    }
    
   public Date(int year, int month, int day){
       this.year = year;
       this.month = month;
       this.day = day;
       total = day + ((month-1) * 30) + ((year - 1) * 365); 
    }
   
   public int daysTo(Date d){
     int days = Math.abs(this.total - d.total);
     return days;
   }
}
