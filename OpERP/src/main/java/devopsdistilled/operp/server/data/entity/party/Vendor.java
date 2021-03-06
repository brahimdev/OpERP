package devopsdistilled.operp.server.data.entity.party;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import devopsdistilled.operp.server.data.entity.account.Payable;
import devopsdistilled.operp.server.data.entity.account.PayableAccount;
import devopsdistilled.operp.server.data.entity.business.Purchase;

@Entity
public class Vendor extends Party<PayableAccount> implements Payable {

	private static final long serialVersionUID = 1438740246885453097L;

	@OneToMany(mappedBy = "party")
	private List<Purchase> purchases;

	public List<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<Purchase> purchases) {
		this.purchases = purchases;
	}

}
