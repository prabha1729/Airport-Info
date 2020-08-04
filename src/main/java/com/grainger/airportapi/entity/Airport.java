package com.grainger.airportapi.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airport")
public class Airport implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long airportID;
	private String name;
	private String city;
	private String country;
	private String IATACode;
	private String ICAOCode;
	private double lattitude;
	private double longitude;
	private double altitude;
	private String timezone;

	public Airport() {
		super();
	}

	public Airport(String name, String city, String country, String iATACode, String iCAOCode, double lattitude,
			double longitude, double altitude, String string) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
		IATACode = iATACode;
		ICAOCode = iCAOCode;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.timezone = string;
	}

	public Long getAirportID() {
		return airportID;
	}

	public void setAirportID(Long airportID) {
		this.airportID = airportID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIATACode() {
		return IATACode;
	}

	public void setIATACode(String iATACode) {
		IATACode = iATACode;
	}

	public String getICAOCode() {
		return ICAOCode;
	}

	public void setICAOCode(String iCAOCode) {
		ICAOCode = iCAOCode;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	@Override
	public String toString() {
		return "Airport {airportID=" + airportID + ", name=" + name + ", city=" + city + ", country=" + country
				+ ", IATACode=" + IATACode + ", ICAOCode=" + ICAOCode + ", lattitude=" + lattitude + ", longitude="
				+ longitude + ", altitude=" + altitude + ", timezone=" + timezone + "}";
	}
}
