package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity <List<Whisky>> findWhiskiesByYear(
            @RequestParam (name = "year") int year
    ){

    return new ResponseEntity<List<Whisky>>(whiskyRepository.findWhiskiesByYear(year), HttpStatus.OK);

    @GetMapping(value = "/whiskies")
    public ResponseEntity <List<Whisky>> findWhiskyByDistilleryNameAndAge(
            @RequestParam (name = "name") String name
            @RequestParam(name = "age") int age)

        return new ResponseEntity<List<Whisky>>(whiskyRepository.findByDistilleryNameAndAge(distName, age))

        {

            }
        }
}}

        if (name != null && age != null){
        List<Whisky> foundWhisky = whiskyRepository.findByDistilleryNameAndAge(name, age);
        return new ResponseEntity(foundWhisky, HttpStatus.OK);



