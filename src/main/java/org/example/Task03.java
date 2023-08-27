package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task03 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }
    @Data
    @AllArgsConstructor
    public static class Cat{
        int age;
        String name;
    }
    @Data
    @AllArgsConstructor
    public static class Dog{
        int age;
        String name;
    }
    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<>();

        Cat cat1 = new Cat(2, "Alisa");
        Cat cat2 = new Cat(3, "Fedya");
        Cat cat3 = new Cat(6, "Cotofei");
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);

        return result;
    }
    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<>();
        for (int i = 0; i < 3; i++)
        {
            Dog dog1 = new Dog(6,"Gav1");
            Dog dog2 = new Dog(12,"Gav2");
            Dog dog3 = new Dog(7,"Gav2");
            result.add(dog1);
            result.add(dog2);
            result.add(dog3);
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //В группу животных собираются коты и собаки
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //Все коты удаляются
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        //Печатется группа животных с помощью итератора
        for (Iterator iterator = pets.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

}