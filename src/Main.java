import java.util.Scanner;
class Time {
    java.util.Date date =new java.util.Date();
    private long elapseTime;
    private long hour;
    private long minute;
    private double second;

    public Time(){
        this.elapseTime = date.getTime();
        this.hour = elapseTime/3600000;
        this.minute = (elapseTime%3600000)/60000;
        this.second =  (elapseTime % 60000)/1000.0;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public double getSecond() {
        return second;
    }

    public Time(long elapseTime){
        setTime(elapseTime);
    }

    public void setTime(long elapseTime){
        this.hour = elapseTime/3600000;
        this.minute = (elapseTime%3600000)/60000;
        this.second =  (elapseTime % 60000)/1000.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());
        System.out.println("请输入一个毫秒数");
        time2.setTime(scan.nextLong());
        System.out.println("Hour: " + time2.getHour());
        System.out.println("Minute: " + time2.getMinute());
        System.out.println("Second: " + time2.getSecond());

    }
}
