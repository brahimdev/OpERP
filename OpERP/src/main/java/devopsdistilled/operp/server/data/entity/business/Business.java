package devopsdistilled.operp.server.data.entity.business;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import devopsdistilled.operp.server.data.entity.Entiti;

@MappedSuperclass
public abstract class Business extends Entiti<Long> {

	private static final long serialVersionUID = -7075903053081563240L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long businessId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private Double amount = 0.0;

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public Long id() {
		return getBusinessId();
	}

	@Override
	public String toString() {

		return new String(getBusinessId() + ": " + getDate() + ": "
				+ getAmount().toString());
	}

}
