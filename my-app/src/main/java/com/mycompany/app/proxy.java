package com.mycompany.app;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

 interface singer{
     public void sing();
     public void dance();
 }

class zhaoliying implements singer{
    public void sing(){
        System.out.println("sing");
    }

    public void dance(){
        System.out.println("dance");
    }
}

public class proxy
{
    static void test(singer z){
        z.dance();
        z.sing();
    }

    static singer getZhaoliyingProxy(){
        return (singer) Proxy.newProxyInstance(proxy.class.getClassLoader(), zhaoliying.class.getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("sing"))
                        {
                            System.out.println("need money");
                            return method.invoke(new zhaoliying(), args);
                        }

                        if (method.getName().equals("dance"))
                        {
                            System.out.println("need money");
                            return method.invoke(new zhaoliying(), args);
                        }

                        return null;
                    }
                });
    }


    public static void main(String[] args) {
        zhaoliying zhao = new zhaoliying();
        System.out.println(zhao.getClass());
        test(zhao);
        System.out.println(getZhaoliyingProxy().getClass());
        test(getZhaoliyingProxy());

        Class c = getZhaoliyingProxy().getClass();
        while (c != Object.class) {
            System.out.println(c);
            c = c.getSuperclass();
        }
        System.out.println(c);

    }
}
