package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        //"can be divided completely", otherwise "cannot be divided completely" or "division by zero".
        if(divider == 0){System.out.println("division by zero");}
        else {
            if(divider*(int)(dividend/divider) == dividend) {System.out.println("can be divided completely");}
            else{System.out.println("cannot be divided completely");}
        }
    }
}
