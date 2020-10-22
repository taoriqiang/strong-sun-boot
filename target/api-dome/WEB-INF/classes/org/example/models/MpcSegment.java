package org.example.models;

 
 
//@Table(name = "mpc_segment")
//@NamedNativeQueries({ @NamedNativeQuery(name = "findSegmentByUserSSO", query = "select * from mpc_segment a where 's'||segment_id in( select product from TTA_EMPTITLE a,"
//        + "tta_emptitleproduct b where a.EMPSSOTITLEID = b.EMPSSOTITLEID and a.EMPSSO=:sso and titleid=:role)", resultClass = MpcSegment.class) })
public class MpcSegment   {
	private String empssoTitleid;
    private Integer segmentId;
    private String segmentName;
    private Integer modalityId;
    private Integer plId;
    private Boolean state;

    
    public String getEmpssoTitleid() {
		return empssoTitleid;
	}

	public void setEmpssoTitleid(String empssoTitleid) {
		this.empssoTitleid = empssoTitleid;
	}

	public Integer getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
    }
 
    public Integer getModalityId() {
        return modalityId;
    }

    public void setModalityId(Integer modalityId) {
        this.modalityId = modalityId;
    }

    
    public Integer getPlId() {
        return plId;
    }

    public void setPlId(Integer plId) {
        this.plId = plId;
    }

    
    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public int compareTo(Object arg0) {
        int flag;
        if (arg0 != null && arg0 instanceof MpcSegment) {
            final MpcSegment mpcSegment = (MpcSegment) arg0;
            flag = this.getSegmentName().compareToIgnoreCase(mpcSegment.getSegmentName());
        } else {
            throw new RuntimeException();
        }
        return flag;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

}
