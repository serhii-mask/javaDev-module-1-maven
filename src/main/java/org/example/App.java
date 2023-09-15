package org.example;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {

    Person person = new Person("Serhii", "Mykalo");

    Gson gson = new Gson();
    System.out.println(gson.toJson(person));
    }
}
