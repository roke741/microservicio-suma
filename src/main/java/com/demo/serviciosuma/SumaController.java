package com.demo.serviciosuma;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SumaController {
    private SumaService sumaServiceContralador;

    //Inyecta una instancia de SumaService en el controlador
    public SumaController(SumaService sumaService) {
        this.sumaServiceContralador = sumaService;
    }
    //Mapea la petición POST a la ruta "/sum" y llama al método sum en SumService
    @PostMapping("/sum")
    public int suma(@RequestParam int firstNumber, @RequestParam int secondNumber){
        return sumaServiceContralador.sum(firstNumber, secondNumber);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleException(Exception exception) {
        return "Datos incorrectos";
    }
}
