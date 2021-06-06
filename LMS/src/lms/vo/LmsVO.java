package lms.vo;

public class LmsVO {
	private String id;
	private String pwd;
	private String name;
	
	public LmsVO() {}
	public LmsVO(String tId, String tPwd) {
		this.id = tId;
		this.pwd = tPwd;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public void setId(String tId)
	{
		this.id = tId;
	}

	
	public String getPwd() {
		// TODO Auto-generated method stub
		return pwd;
	}
	public void setPwd(String tPwd)
	{
		this.pwd = tPwd;
	}
	
	public void setName(String tName) {
		// TODO Auto-generated method stub
		this.name = tName;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
