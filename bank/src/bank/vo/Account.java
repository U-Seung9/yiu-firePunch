package bank.vo;

public class Account {
	private String id;
	private String pwd;
	private int money;
	
	public Account() {}
	public Account(String tId, String tPwd) {
		this.id = tId;
		this.pwd = tPwd;
		this.money = 0;
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
	public int getMoney() {
		// TODO Auto-generated method stub
		return money;
	}
	public void setPwd(int tMoney)
	{
		this.money = tMoney;
	}


}
