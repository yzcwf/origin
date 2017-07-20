package com.mycompany.app;

class Candy{
    static {System.out.println("Candy");}
    Candy(){
        System.out.println("Candy cons");
    }
}


public class TypeInfo{
    public TypeInfo(){}

    public static void main(String[] args) {
  //      Class c = new Candy().getClass();
  //      System.out.println(c.getName());
        try
        {
            Object obj = Class.forName("com.mycompany.app.Candy");
//            System.out.println("yzc");
//            System.out.println(obj.getClass());

        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }


    }
}