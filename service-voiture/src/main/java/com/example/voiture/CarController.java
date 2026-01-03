package com.tp.voiture.web;

import com.tp.voiture.model.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Value("${voiture.delay-ms:20}")
    private long delayMs;

    @GetMapping("/byClient/{clientId}")
    public Car getCarByClient(@PathVariable Long clientId) throws InterruptedException {
        if (delayMs > 0) Thread.sleep(delayMs); 
        return new Car(
                10L + clientId,
                "Toyota",
                "Yaris",
                clientId
        );
    }

    @GetMapping("/healthz")
    public String healthz() {
        return "OK";
    }
}
