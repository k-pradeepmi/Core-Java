package com.practice.java8;

public class Test {
	public static void main(String[] args) {
      FunInterface fun=()-> System.out.println("Sum method");
      fun.sum();
      
        Test_01FunInterface t=(int a)-> {
        	int num = 29;
            boolean flag = false;
            for(int i = 2; i <= num/2; ++i)
            {
                // condition for nonprime number
                if(num % i == 0)
                {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        };
        t.prime(2);
	}
}
