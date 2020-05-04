package Karbar;

public class Clone implements Cloneable{
    public String name;
    public String password;

    @Override
    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }
}
