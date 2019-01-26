package com.slg.costsplitter.trip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {
	
	@RequestMapping("/trip")
	public String getTrip() {
		return "Vegas2019";
	}

}
