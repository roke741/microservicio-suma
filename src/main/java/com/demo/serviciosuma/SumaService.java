package com.demo.serviciosuma;

import org.springframework.stereotype.Service;

@Service
public class SumaService {
    // Realiza la suma de dos números y devuelve el resultado
    public int sum(int firtsNumber, int secondNumber){
        return firtsNumber+ secondNumber;
    }
}
