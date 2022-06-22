package com.objectoriented.concept.polymorphism;

/**
 *
 * Polymorphism
 * Polymorphism makes it possible to use the same code structure in different forms.
 * In Java, this means that you can declare several methods with the same name as long as they are different
 * in certain characteristics.
 *
 * As mentioned above, Java provides two ways to implement polymorphism: method overloading and method overriding.
 *
 * Static polymorphism (method overloading)
 * Method overloading means that you can have several methods with the same name within a class. However,
 * the number, names, or types of their parameters need to be different.
 */

/**
 *the Bird() class below has three fly() methods. The first one doesn’t have any parameters,
 * the second one has one parameter (height), and the third one has two parameters (name and height).
 */
class  Bird  {
    public  void  fly()  {
        System.out.println("The bird is flying.");
    }
    public  void  fly(int height)  {
        System.out.println("The bird is flying "  + height +  " feet high.");
    }
    public  void  fly(String name,  int height)  {
        System.out.println("The "  + name +  " is flying "  + height +  " feet high.");
    }
}

/**
 * The PolymorphismMethodOverloading class instantiates a new Bird object and calls the fly() method three times: first, without parameters,
 * second, with one integer parameter for height, and third, with two parameters for name and height.
 */

public class PolymorphismMethodOverloading {

    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);

    }

}


