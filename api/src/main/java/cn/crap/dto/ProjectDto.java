package cn.crap.dto;

/**
 * Automatic generation by tools
 * dto: exchange data with view
 */
public class ProjectDto {
	private String id;
	private String name;
	private Byte status;
	private Long sequence;
	private String remark;
	private String userId;
	private String userName;
	private Byte type;
	private String typeName;
	private String password;
	private String cover;
	private Byte luceneSearch;
	private String luceneSearchName;
	private String statusName;
	private String createTimeStr;
	/**
	 * 访问方式
	 */
	private String visitWay;
    /**
     * 邀请链接
     */
    private String inviteUrl;
    private String projectPermission;

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setStatus(Byte status){
		this.status=status;
	}
	public Byte getStatus(){
		return status;
	}

	public void setSequence(Long sequence){
		this.sequence=sequence;
	}
	public Long getSequence(){
		return sequence;
	}

	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return userId;
	}

	public void setType(Byte type){
		this.type=type;
	}
	public Byte getType(){
		return type;
	}

	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}

	public void setCover(String cover){
		this.cover=cover;
	}
	public String getCover(){
		return cover;
	}

	public void setLuceneSearch(Byte luceneSearch){
		this.luceneSearch=luceneSearch;
	}
	public Byte getLuceneSearch(){
		return luceneSearch;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getLuceneSearchName() {
		return luceneSearchName;
	}

	public void setLuceneSearchName(String luceneSearchName) {
		this.luceneSearchName = luceneSearchName;
	}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getVisitWay() {
		return visitWay;
	}

	public void setVisitWay(String visitWay) {
		this.visitWay = visitWay;
	}

    public String getInviteUrl() {
        return inviteUrl;
    }

    public void setInviteUrl(String inviteUrl) {
        this.inviteUrl = inviteUrl;
    }

	public String getProjectPermission() {
		return projectPermission;
	}

	public void setProjectPermission(String projectPermission) {
		this.projectPermission = projectPermission;
	}
}
