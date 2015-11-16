package com.company;

class Main extends Animal {
    int age;

    public Main(int dogsAge) {
        age = dogsAge;

    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void run(int feet) {
        System.out.println("Your dog ran " + feet + " feet!");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Main spike = new Main(5);
        spike.bark();
        spike.run(7);
        int spikeAge = spike.getAge();
        System.out.println(spikeAge);
        spike.checkStatus();
    }

}





