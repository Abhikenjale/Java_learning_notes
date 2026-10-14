package JavaBasics.Oops.Abstraction;

import javax.naming.Name;

public class Runner {
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.age = 10;
        dog.voice();
        System.out.print(dog.Name("Tuffy"));

    }


}

