package com.objectoriented.concept.polymorphism;

/**
 * Dynamic polymorphism (method overriding)
 * Using the method overriding feature of Java, you can override the methods of a parent class from its child class.
 */

/**
 *  In the code example below, the Bird class extends the Animal class. Both have an eat() method. By default,
 *  Bird inherits its parent’s eat() method. However, as it also defines its own eat() method,
 *  Java will override the original method and call eat() from the child class.
 */

class  Animal  {
    public  void  eat()  {
        System.out.println("This animal eats insects.");
    }
}

class  Fish  extends Animal {
    public  void  eat()  {
        System.out.println("This fish eats worms.");
    }
}

/**
 * The PolymorphsimMethodOverriding class first instantiates a new Animal object and calls its eat() method.
 * Then, it also creates a Bird object and calls the polymorphic eat() method again.
 */
public class PolymorphsimMethodOverriding {

    public  static  void  main(String[] args)  {
        Animal myAnimal =  new Animal();
        myAnimal.eat();
        Fish myFish =  new Fish();
        myFish.eat();
    }
}
