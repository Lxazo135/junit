package pham_junit_lab;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import date.Date;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Pham_junit_lab {
    public static void main(String args[]){
        Result result = JUnitCore.runClasses(Pham_junit_lab.class);
		
        for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
        }
    }    
    
    Date d1 = new Date(2009, 12, 25);
    Date d2 = new Date(2010, 12, 25);
    Date d3 = new Date(2011, 5, 10);
    
    @Test
    public void test1(){
        assertEquals(0, d1.daysTo(d1));
        assertEquals(365, d1.daysTo(d2));
    }
    
    @Test
    public void test2(){
        assertEquals(50, d1.daysTo(d1));
    }
    
    @Test
    public void test3(){
        assertEquals(365, d1.daysTo(d2));
        assertEquals(200, d1.daysTo(d3));
    }
}
