package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean one = firstSide + secondSide > thirdSide;
        boolean two = thirdSide + secondSide > firstSide;
        boolean three = firstSide + thirdSide > secondSide;
        if (one && two && three){
            System.out.println("this is a valid triangle");
        }else{
            System.out.println("it's not a triangle");
        }
    }
}
