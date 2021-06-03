public class Time {
    private int hour, min, sec;

    //parameterised constructor
    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    Time add(Time t){
        Time time = new Time(0,0,0);
        time.sec = this.sec + t.sec;  

        if(time.sec >= 60) {   
            time.min ++;
            time.sec%= 60;
        }

        time.min += this.min + t.min;
        if(time.min >=60) {   
            time.hour++;
            time.min%=60;
        }

        time.hour += this.hour + t.hour;
        if(time.hour > 24) {   
            time.hour%= 24;
        }

        return time;
    }

    //For displaying the values.
    void display(String str) {
        System.out.println(str + "" +hour + ":" +min + ":" +sec);
    }

    public static void main(String[] args) {
        Time t= new Time(10,2,36);
        Time t2 = new Time(1,22,33);
        Time t3 = t.add(t2);

        t.display("Time A: ");
        t2.display("Time B: ");
        t3.display("After addition: ");
    }
}