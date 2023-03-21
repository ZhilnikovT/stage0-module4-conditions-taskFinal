package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void main(String[] args) {
        DaysInMonth d = new DaysInMonth();
        d.printDays(400,2);
    }
    
    public void printDays(int year, int month) {
        DaysInMonth d2 = new DaysInMonth();
        if(d2.isLeapYear(year) && month == 2){
            System.out.println(29);
        }else{
            d2.amountOfDays(month);
        }
    }
    
    public void amountOfDays(int month) {
        switch (month) { 
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:    
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("invalid date");
                break; 
        }        
    }
    
    public boolean isLeapYear(int year) {
        int leap = ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) ? 1 : 0;
        //System.out.println(leap);
        switch (leap) { 
            case 1:
                //System.out.println("leap");
                return true;
                //break;
            case 0:
                return false;
                //System.out.println("not leap");
                //break;   
        }
        return true;
    }
}
