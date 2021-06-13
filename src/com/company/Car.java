package com.company;

public class Car
{
    public final String model, producer;
    public String rejestracja;
    public int ilosc_drzwi, pojemnosc;

    public static int counter=0;

    public Car(String model, String producer,String rejestracja, int ilosc_drzwi, int pojemnosc)
    {
        this.model = model;
        this.producer = producer;
        this.rejestracja = rejestracja;
        this.ilosc_drzwi = ilosc_drzwi;
        this.pojemnosc = pojemnosc;

        System.out.println("Utworzono obiekt CAR numer: " + counter);
        counter++;
    }
}
