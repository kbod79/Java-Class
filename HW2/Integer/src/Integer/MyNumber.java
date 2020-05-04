package Integer;

public class MyNumber implements MyInteger {
    int x=0;
    @Override
    public int isEven() {
        if (x%2==0)
            System.out.println("the number is Even");
        else
            System.out.println("the number is Odd");
        return 0;
    }

    @Override
    public int isOdd() {
        return 0;
    }

    @Override
    public int isPosetive() {
        if (x>0)
            System.out.println("the number is posetive");
        return 0;
    }

    @Override
    public int isNegative() {
        if (x<0)
            System.out.println("the number is negative");
        return 0;
    }

    @Override
    public int isZero() {
        if (x==0)
            System.out.println("the number is zero");
        return 0;
    }
}
