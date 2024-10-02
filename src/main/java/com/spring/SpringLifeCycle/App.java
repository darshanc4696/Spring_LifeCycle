package com.spring.SpringLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.classes.Student;

public class App {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("beans.xml");
    Student s = (Student)cx.getBean("student");
    
    s.print();
    cx.close();
  }
}
