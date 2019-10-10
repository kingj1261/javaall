package org.kingj.learn.java.lang.basictypes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 基础数据类型相关测试用例
 *
 * 虚拟机规范定义文档参考 ： https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 *
 */
public class PrimitiveDataTypes {

    /**
     * 自动装箱测试
     */
    @Test
    public void autoBoxing(){
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.stream().forEach(i->System.out.println(i));
    }

    @Test
    public void autoBoxingManual(){
        List<Integer> list=new ArrayList<>();
        list.add(Integer.valueOf(0));
        list.stream().forEach(i->System.out.println(i));
    }

    @Test
    public void autoBoxingManualWithNew(){
        List<Integer> list=new ArrayList<>();
        list.add(new Integer(0));
        list.stream().forEach(i->System.out.println(i));
    }

    @Test
    public void autoUnboxing(){
        Integer base=Integer.valueOf(10);
        int sum=0;
        sum+=base;
        System.out.println(sum);
    }


    @Test
    public void questionOne(){
        int x=100;
        Integer y=100;
        Integer z=new Integer(100);
        Integer w=Integer.valueOf(100);

        Integer a=Integer.valueOf(128);
        Integer b=128;
        Integer c=new Integer(128);


        System.out.println("x==y?"+ (x==y));
        System.out.println("x==z?"+(x==z));
        System.out.println("z==x?"+(z==x));
        System.out.println("z==y"+(z==y));

        System.out.println("y==z?"+(y==z));
        System.out.println("y==w?"+(y==w));

        System.out.println("x==w?"+(x==w));
        System.out.println("w==x?"+(w==x));
        System.out.println("a==b?"+(a==b));
        System.out.println("a.equals(b)?"+(a.equals(b)));
        System.out.println("b==c?"+(b==c));
        System.out.println("b.equals(c)?"+(b.equals(c)));
    }

    @Test
    public void questionTwo(){
        short a=100;
        int b=200;
        a+=b;
        a=(short)(a+b);
    }

    @Test
    public void questionThree(){
        Integer x=200;
        Integer y=200;
        System.out.println(y==x);
    }
}
