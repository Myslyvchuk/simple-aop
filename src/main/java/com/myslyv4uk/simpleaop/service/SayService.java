package com.myslyv4uk.simpleaop.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;


@Component
public class SayService {

  public void sayHi(){
    System.out.println("Hi");
  }

  public void sayBye(){
    System.out.println("Bye");
  }

  public String retrunSmthn(LocalDateTime localDateTime){
    return "Hi Bye" +  localDateTime;
  }
}
