package com.lifl.testautoconfiguration;

public class HelloService {

    HelloPorperties helloPorperties;

    public String sayHello() {
        return helloPorperties.toString();
    }


    public HelloPorperties getHelloPorperties() {
        return helloPorperties;
    }

    public void setHelloPorperties(HelloPorperties helloPorperties) {
        this.helloPorperties = helloPorperties;
    }

  
}
