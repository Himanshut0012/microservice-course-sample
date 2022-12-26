package com.limits.configration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("limit-service")
public class PropertiesVariable {
	private int minLimit;
	private int maxLimit;
	
	
	
	public int getMinLimit() {
		return minLimit;
	}
	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}
	public int getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

}
