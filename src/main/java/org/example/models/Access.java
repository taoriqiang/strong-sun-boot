package org.example.models;

import java.util.List;


public class Access {

	private String empssoTitleid;
	private String role;
	private String roleName;

	private List<Function> functionList;
	private List<Modality> modalityList;
	private List<MpcSegment> segmentList;
	private List<Province> provinceList;
	private List<MPCCareArea> careAreaList;
	private List<City> cityList;

	private String functionIdList;
	private String modalityIdList;
	private String segmentIdList;
	private String provinceIdList;
	private String cityIdList;

	public String getEmpssoTitleid() {
		return empssoTitleid;
	}

	public void setEmpssoTitleid(String empssoTitleid) {
		this.empssoTitleid = empssoTitleid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Function> getFunctionList() {
		return functionList;
	}

	public void setFunctionList(List<Function> functionList) {
		this.functionList = functionList;
	}

	public List<Modality> getModalityList() {
		return modalityList;
	}

	public void setModalityList(List<Modality> modalityList) {
		this.modalityList = modalityList;
	}

	public List<MpcSegment> getSegmentList() {
		return segmentList;
	}

	public void setSegmentList(List<MpcSegment> segmentList) {
		this.segmentList = segmentList;
	}

	public List<Province> getProvinceList() {
		return provinceList;
	}

	public void setProvinceList(List<Province> provinceList) {
		this.provinceList = provinceList;
	}

	public List<MPCCareArea> getCareAreaList() {
		return careAreaList;
	}

	public void setCareAreaList(List<MPCCareArea> careAreaList) {
		this.careAreaList = careAreaList;
	}

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	public String getFunctionIdList() {
		return functionIdList;
	}

	public void setFunctionIdList(String functionIdList) {
		this.functionIdList = functionIdList;
	}

	public String getModalityIdList() {
		return modalityIdList;
	}

	public void setModalityIdList(String modalityIdList) {
		this.modalityIdList = modalityIdList;
	}

	public String getSegmentIdList() {
		return segmentIdList;
	}

	public void setSegmentIdList(String segmentIdList) {
		this.segmentIdList = segmentIdList;
	}

	public String getProvinceIdList() {
		return provinceIdList;
	}

	public void setProvinceIdList(String provinceIdList) {
		this.provinceIdList = provinceIdList;
	}

	public String getCityIdList() {
		return cityIdList;
	}

	public void setCityIdList(String cityIdList) {
		this.cityIdList = cityIdList;
	}
}
