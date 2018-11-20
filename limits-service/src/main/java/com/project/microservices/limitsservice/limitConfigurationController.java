package com.project.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.microservices.limitsservice.bean.limitConfig;
import com.project.microservices.limitsservice.config.ConfigurationProps;

@RestController
public class limitConfigurationController {

	@Autowired
	ConfigurationProps configuratioProps;
	
	@GetMapping("/limits")
	public limitConfig getLimits() {
		return new limitConfig(configuratioProps.getMinimum(),configuratioProps.getMaximum());
	}
}
