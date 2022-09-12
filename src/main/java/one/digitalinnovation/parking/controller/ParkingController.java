package one.digitalinnovation.parking.controller;

import one.digitalinnovation.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll(){
        var parking = new Parking();
        parking.setColor("PRETO");
        parking.setLicense("MS-2032");
        parking.setModel("VW Gol");
        parking.setState("PB");
        return Arrays.asList(parking);
    }
}
