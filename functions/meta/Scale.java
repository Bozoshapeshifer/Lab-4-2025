package functions.meta;
import functions.Function;

public class Scale implements Function {
    Function a;
    double kx,ky;

    public Scale(Function a, double kx,double ky)
    {
        this.a=a;
        this.kx=kx;
        this.ky=ky;
    }

    @Override 
    public double getLeftDomainBorder()
    {
        return a.getLeftDomainBorder();
    }

    @Override
    public double getRightDomainBorder()
    {
        return a.getRightDomainBorder();
    }

    @Override

    public double getFunctionValue(double x)
    {
        return a.getFunctionValue(x*kx)*ky;
    }
}

