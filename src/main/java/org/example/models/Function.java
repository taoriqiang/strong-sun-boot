package org.example.models;

 

/**
 * ClassName:Product.java Author Blair Chen
 * 
 * @version 1.0
 * @Date June 12, 2010
 */
 
public class Function  extends EmpTitle{
 
  
    private Integer functionId;
    private String functionName;
    private Integer functionType;
    private String description;
    private Integer autocal;
    private String status="F";
    private String empssoTitleid; 
   
    
	public String getEmpssoTitleid() {
		return empssoTitleid;
	}
	public void setEmpssoTitleid(String empssoTitleid) {
		this.empssoTitleid = empssoTitleid;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getFunctionId() {
		return functionId;
	}
	public void setFunctionId(Integer functionId) {
		this.functionId = functionId;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public Integer getFunctionType() {
		return functionType;
	}
	public void setFunctionType(Integer functionType) {
		this.functionType = functionType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAutocal() {
		return autocal;
	}
	public void setAutocal(Integer autocal) {
		this.autocal = autocal;
	}
    
    
    
   

  

}
