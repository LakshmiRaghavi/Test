package com.example.demo;
import org.springframework.stereotype.Service;

import  java.lang.*;

@Service
public class Test1 {
    public boolean Testing(String str) {

        String reverseString = new StringBuilder(str).reverse().toString();

        if (str.equals(reverseString)) {
            return true;
        } else {
            return false;

        }
    }
}
