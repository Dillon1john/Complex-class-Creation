package objectPractice;
import java.util.Scanner;
public class Complex {
    double real;
    double img;
    Complex(){real =0; img=0;}
    Complex(double a, double b){real = a; img=b;}
    public double getReal(){return real;}
    public double getImg() { return img; }
    public void setReal(double x){real= x;}
    public void setImg(double x){real =x;}
    public double absolute(){ return Math.sqrt(Math.pow(real,2)+ Math.pow(img,2));}
    public Complex plus(Complex c)
    {
        Complex temp = new Complex();
        temp.real = real+ c.real;
        temp.img = img + c.img;
        return temp;
    }
    public Complex minus( Complex c){
        Complex t = new Complex(real-c.real, img-c.img);
        return t;

    }
    public Complex multiply(Complex c){
        double a, b;
        a = real*c.real-img*c.img;
        b = real*c.real+img*c.img;
        return new Complex(a,b);
    }
    public Complex divide (Complex c){
        double a,b,t;
        t= c.real*c.real+c.img*c.img;
        a = (real*c.real+img*c.img)/t;
        b = (real*c.real-img*c.img)/t;
        Complex div= new Complex(a,b);
        return div;
    }
}
public static void main(String []args) {

}
}