package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;


	@Test
	void contextLoads() {

	}

	@Test
	public void findWhiskiesByYear(){
		List<Whisky> found = whiskyRepository.findWhiskiesByYear(1991);
		assertEquals(1, found.size());
	}

	@Test
	public void findDistilleryByRegion(){
		List<Distillery> foundDistillery = distilleryRepository.findDistilleryByRegion("Islay");
		assertEquals("Islay", foundDistillery.get(0).getRegion());
	}

	@Test
	public void findWhiskyFromDistilleryByAge(){
		Distillery foundDistillery = distilleryRepository.getOne(3L);
		List<Whisky> foundWhisky = whiskyRepository.findByDistilleryNameAndAge("Lagavulin", 16);
		assertEquals(1, foundWhisky.size());
	}



}
