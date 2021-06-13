package com.company;


public class Main
{
    public static void main(String[] args)
    {
        Human human1 = new Human("Stefan", "Czarnecki", "Lekarz", 28, 73 );
        Car car1 = new Car("Mustang", "Ford", "GD008FB", 2, 5000);

        human1.Rejestracja_Samochodu(car1);
    }
}