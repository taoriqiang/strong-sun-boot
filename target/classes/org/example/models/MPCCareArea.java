package org.example.models;
 

//
//@Table(name = "MPC_CAREAREA")
//@NamedNativeQueries( { @NamedNativeQuery(name = "findCareAreaByUserSSO", query = "select * from mpc_carearea f where exists(select 1 from TTA_EMPTITLE a,tta_emptitlecarearea b "
//        + "where a.EMPSSOTITLEID = b.EMPSSOTITLEID and a.EMPSSO=:sso and a.titleid=:role and f.carearea_id=b.careareaid)", resultClass = MPCCareArea.class)
//
//})
public class MPCCareArea  {

	 
	 
	private String careAreaId;

	 
	private String careArea;

	 
	private int showNumber;

	 
	private String state;

	public String getCareArea() {
		return careArea;
	}

	public void setCareArea(String careArea) {
		this.careArea = careArea;
	}

	public String getCareAreaId() {
		return careAreaId;
	}

	public void setCareAreaId(String careAreaId) {
		this.careAreaId = careAreaId;
	}

	public int getShowNumber() {
		return showNumber;
	}

	public void setShowNumber(int showNumber) {
		this.showNumber = showNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
