package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public void checkNull() {
        String str = null;

        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("str은 null입니다.");
        }
    }
}
