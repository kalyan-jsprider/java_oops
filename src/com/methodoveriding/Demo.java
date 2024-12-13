package com.methodoveriding;


class Animal {
 void sound() {
     System.out.println("Animals make sound");
 }
}


class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

class Cat extends Animal {
 
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}


public class Demo {
 public static void main(String[] args) {
   
     Animal genericAnimal = new Animal();
     genericAnimal.sound(); 
     
     Animal dog = new Dog();
     dog.sound();

     
     Animal cat = new Cat();
     cat.sound(); 
 }
}
