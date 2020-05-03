package Daneshjo;

public class Score {
    public int zaribT;
    public int zaribO;
    public int scoreT;
    public int scoreO;
    //public String moadel1;
    public String moadel;

    public Score(int zaribT, int zaribO,String moadel){
        this.zaribT=zaribT;
        this.zaribO=zaribO;
        this.moadel=moadel;
    }

    public int takhasosi()
    {
        return this.scoreT*this.zaribT;
    }
    public int omomi()
    {
        return this.scoreO*this.zaribO;
    }
    public void moadel()
    {
        System.out.println((omomi()+takhasosi()/zaribO+zaribT));
        if ((omomi()+takhasosi()/zaribO+zaribT)>=12)
            System.out.println("pass");
        else
            System.out.println("faile");

    }

}
