package JavaBasics.Oops.Abstraction;


import javax.naming.Name;

abstract class Animal {

    private String name;

    abstract void voice();

    public String Name(String name){
        this.name = name;
        return name;
    }
}

class Dog extends Animal {
    int age;

    @Override
    void voice() {
        System.out.println("Woff Woff");
    }

}
