package eva.workshop2spring.domain;


public class Account {
	
	
	public enum AccountType {ADMIN, EMPLOYEE, CUSTOMER }
	
	private int id;
	private String email;
	private String password;
	private AccountType accountType;
	
	
	public Account(){
		
	}
	
	
	public Account(String email, String password, AccountType accountType){
		this.email = email;
		this.password = password;
		this.accountType = accountType;
	}
	

	public int getAccountId() {
		return id;
	}
	
	
	public void setAccountId(int id) {
		this.id = id;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	public AccountType getAccountType() {
		return accountType;
	}
	
	
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", password=" + password + ", accountType=" + accountType
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountType != other.accountType)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	



	

	
}
