package org.example.models;

  
public class Modality extends EmpTitle{
 
	private String empssoTitleid;
	private Integer modalityId;
	private String modalityName;
	private Integer plId;
	private String plName;
	private String globalModalityName;
	
	public Integer getModalityId() {
		return modalityId;
	}
	public void setModalityId(Integer modalityId) {
		this.modalityId = modalityId;
	}
	public String getModalityName() {
		return modalityName;
	}
	public void setModalityName(String modalityName) {
		this.modalityName = modalityName;
	}
	public Integer getPlId() {
		return plId;
	}
	public void setPlId(Integer plId) {
		this.plId = plId;
	}
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	public String getEmpssoTitleid() {
		return empssoTitleid;
	}
	public void setEmpssoTitleid(String empssoTitleid) {
		this.empssoTitleid = empssoTitleid;
	}
	public String getGlobalModalityName() {
		return globalModalityName;
	}
	public void setGlobalModalityName(String globalModalityName) {
		this.globalModalityName = globalModalityName;
	}
	
   

}
