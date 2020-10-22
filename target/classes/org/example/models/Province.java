package org.example.models;


// 
// 
//@Table(name = "ttg_province")
//@NamedNativeQueries( { @NamedNativeQuery(name = "findProvinceByUserSSO", query = "select * from(select * from ttg_province a where provinceid in(select territory from TTA_EMPTITLE a,"
//		+ " tta_emptitleterritory b where a.EMPSSOTITLEID = b.EMPSSOTITLEID and a.EMPSSO=:sso and titleid=:role) union all" +
//				" (select * from ttg_province where regionid in (select regionid from ttg_region a where regionid in (select territory from TTA_EMPTITLE a,tta_emptitleterritory b"
//		+ " where a.EMPSSOTITLEID = b.EMPSSOTITLEID and a.EMPSSO=:sso and titleid=:role))))", resultClass = Province.class) })
public class Province extends EmpTitle {
    private String empSsoTitleId;
    private String provinceId;
    private String provinceName;
    private String provinceCode;
    private String regionId;
    private String note;

    public String getEmpSsoTitleId() {
        return empSsoTitleId;
    }

    public void setEmpSsoTitleId(String empSsoTitleId) {
        this.empSsoTitleId = empSsoTitleId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
