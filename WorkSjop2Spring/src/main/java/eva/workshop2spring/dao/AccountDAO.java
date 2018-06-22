
package eva.workshop2spring.dao;

import java.util.List;

import eva.workshop2spring.domain.Account;

public interface AccountDAO {

	public List<Account> getAllAccounts();

	public int createAccount(Account account);

	public void updateAccount(Account account);

	public void deleteAccount(Account account);

	public Account getAccountByEmail(String email);
	
	public Account getAccountById(int accountId);


}
