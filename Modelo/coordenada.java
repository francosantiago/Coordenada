package Modelo;

public class coordenada
{
    
    private double x;
    private double y;

    public coordenada()
    {
        this.x = 0;
        this.y = 0;
    }

    public coordenada( double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getY()
    {
        return y;
    
    }
    public void setY(double y)
    {
        this.y = y;
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    public boolean equals(Object obj)
    {
        coordenada otra = (coordenada)obj;
        return (x==otra.x) && (y==otra.y);
    }
    
    
    public double Distancia(double x, double y, double x2, double y2)
    {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
         if(x<x2 & y<y2)
        {
            double d = Math.sqrt(((x2-x)(x2-x))+((y2-y)(y2-y)));
        }
        else if(x>x2 & y<y2)
        {
            double d = Math.sqrt(((x-x2)(x-x2))+((y2-y)(y2-y)));
        }
        else if(x>x2 & y>y2)
        {
            double d = Math.sqrt(((x-x2)(x-x2))+((y-y2)(y-y2)));
        }
        else
        {
            double d = Math.sqrt(((x2-x)(x2-x))+((y-y2)(y-y2)));
        }
        return d;
    }


}