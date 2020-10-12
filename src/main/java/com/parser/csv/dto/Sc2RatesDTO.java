/**
 * 
 */
package com.parser.csv.dto;

import java.time.LocalDate;

/**
 * @author pujan
 *
 * Oct 13, 2020
 */
public class Sc2RatesDTO {

	
	private String siretEntity;
	private String people1;
	private String people2;
	private String riskCode;
	private Integer riskValue;
	private String wagesN4;
	private String wagesN3;
	private String wagesN2;
	private float rate;
	private String effectDate;
	private String notificationDate;
	
	
	/*
	 * public Sc2RatesDTO() { super(); }
	 */


	public String getSiretEntity() {
		return siretEntity;
	}


	public void setSiretEntity(String siretEntity) {
		this.siretEntity = siretEntity;
	}


	public String getPeople1() {
		return people1;
	}


	public void setPeople1(String people1) {
		this.people1 = people1;
	}


	public String getPeople2() {
		return people2;
	}


	public void setPeople2(String people2) {
		this.people2 = people2;
	}


	public String getRiskCode() {
		return riskCode;
	}


	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}


	public Integer getRiskValue() {
		return riskValue;
	}


	public void setRiskValue(Integer riskValue) {
		this.riskValue = riskValue;
	}


	public String getWagesN4() {
		return wagesN4;
	}


	public void setWagesN4(String wagesN4) {
		this.wagesN4 = wagesN4;
	}


	public String getWagesN3() {
		return wagesN3;
	}


	public void setWagesN3(String wagesN3) {
		this.wagesN3 = wagesN3;
	}


	public String getWagesN2() {
		return wagesN2;
	}


	public void setWagesN2(String wagesN2) {
		this.wagesN2 = wagesN2;
	}


	public float getRate() {
		return rate;
	}


	public void setRate(float rate) {
		this.rate = rate;
	}


	public String getEffectDate() {
		return effectDate;
	}


	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}


	public String getNotificationDate() {
		return notificationDate;
	}


	public void setNotificationDate(String notificationDate) {
		this.notificationDate = notificationDate;
	}


	@Override
	public String toString() {
		return "Sc2RatesDTO [siretEntity=" + siretEntity + ", people1=" + people1 + ", people2=" + people2
				+ ", riskCode=" + riskCode + ", riskValue=" + riskValue + ", wagesN4=" + wagesN4 + ", wagesN3="
				+ wagesN3 + ", wagesN2=" + wagesN2 + ", rate=" + rate + ", effectDate=" + effectDate
				+ ", notificationDate=" + notificationDate + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
