package com.sadie;
import com.util.MySumOfSquares;

public class JudgeTrangle {
//    输入三条边判断三角形形状
  /*  public static void main(String[] args){
    double length_a=2.0;
    double length_b=2.0;
    double length_c=3.46;
    function(length_a,length_b,length_c);

    }

   */
    public   int  function(double lengthA, double lengthB, double lengthC)
    {
        if(lengthA+lengthB<lengthC||lengthA+lengthC<lengthB||lengthB+lengthC<lengthA)
        {
            System.out.println("输入非法！不构成三角形");
        }
        if(lengthA==lengthB&&lengthB==lengthC&&lengthA==lengthC)
        {
            System.out.println("等边三角形");
            return 1;
        }
        else if(lengthA==lengthB||lengthB==lengthC||lengthA==lengthC)
        {
            int flag=0;
            flag=AngleFunc(lengthA,lengthB,lengthC);
            switch (flag){
                case 1:
                    System.out.println("等腰直角三角形");
                    break;
                case 2:
                    System.out.println("等腰钝角三角形");
                    break;
                case 3:
                    System.out.println("等腰锐角三角形");
                    break;

            }
            return 2;
        }
        int flag2=0;
        flag2=AngleFunc(lengthA,lengthB,lengthC);
    switch(flag2){
        case 1://注入错误
            System.out.println("普通直角三角形");
            break;
        case 2://注入错误
            System.out.println("普通钝角三角形");
            break;
        case 3:
            System.out.println("普通锐角三角形");
            break;

    }
return 3;
    }
    public   int AngleFunc(double a,double b,double c){
        MySumOfSquares sumOfSquares=new MySumOfSquares();
        double values1[]=new double[2];
        values1[0]=a;values1[1]=b;
        double values2[]=new double[2];
        values2[0]=b;values2[1]=c;
        double values3[]=new double[2];
        values3[0]=a;values3[1]=c;
        double value_a[]=new double[1];
        double value_b[]=new double[1];
        double value_c[]=new double[1];
        value_a[0]=a;
        value_b[0]=b;
        value_c[0]=c;
        double squareABC[]=new double[3];
        squareABC[0]=sumOfSquares.evaluate(values1);//a^2+b^2
        squareABC[1]=sumOfSquares.evaluate(values2);//b^2+c^2
        squareABC[2]=sumOfSquares.evaluate(values3);//a^2+c^2
        double x2[]=new double[3];
        x2[0]=sumOfSquares.evaluate(value_c);//c^2
        x2[1]=sumOfSquares.evaluate(value_b);//b^2
        x2[2]=sumOfSquares.evaluate(value_a);//a^2
        int result=0;
        for(int i=0;i<3;i++)
        {
            if(squareABC[i]==x2[i])
            {
                result=1;
                break;
            }//直角三角形
            else if(squareABC[i]<x2[i])
            {
                result=2;//钝角三角形
               // break;
            }
            else if(squareABC[i]>x2[i]){
                if(result!=2)
                result=3;//锐角三角形
            }

        }
     //   System.out.println("HHHHHH");
        return result;
    }


}
