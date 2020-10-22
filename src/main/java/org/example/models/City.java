/**
 * ClassName:City.java
 * 
 * Author Ailian Zeng
 * @version 1.0
 * @Date Jan 12, 2010
 */

package org.example.models;


//select * from ttg_city where cityid in(select territory from TTA_EMPTITLE a," +
//					"tta_emptitleterritory b where a.EMPSSOTITLEID = b.EMPSSOTITLEID and a.EMPSSO=:sso and titleid=:role)",

public class City  {
 
	 
	private String cityId;
	private String cityName;
	private String provinceId;
	
    private String note;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
 
  
	
}
