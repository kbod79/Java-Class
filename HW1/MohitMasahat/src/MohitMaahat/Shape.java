package MohitMaahat;

public class Shape {
    private int wR,hR,hS;
    public Shape(int wR, int hR, int hS)
    {
        this.wR=wR;
        this.hR=hR;
        this.hS=hS;
    }
    public int areaR()
    {
        return this.wR*this.hR;
    }
    public int perimeterR()
    {
        return 2*(this.wR+this.hR);
    }
    public int areaS()
    {
        return this.hS*this.hS;
    }
    public int perimeterS()
    {
        return 4*hS;
    }

}
