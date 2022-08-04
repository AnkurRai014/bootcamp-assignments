package org.npci.rtorestapi.config.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Challan")
public class Challan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "challan_date")
	private Date challanDate;

	@Column(name = "challan_time")
	private Time challanTime;

	@Column(name = "challan_location")
	private long pincode;

	@Column(name = "image_proof")
	private String imageProof;

	@Column(name = "police_personel_id")
	private long policePersonelId;

	@Column(name = "vehicle_plate_number")
	private String vehiclePlateNumber;

	@Column(name = "violations")
	private String violations;

	@Column(name = "total_fine")
	private int totalFine;

	@Column(name = "due_date")
	private Date dueDate;

	@Column(name = "is_due_date_valid")
	private boolean isDueDateValid;

	@Column(name = "is_challan_closed")
	private boolean isChallanClosed;

	@Column(name = "is_challan_disputed")
	private boolean isChallanDisputed;

	@Column(name = "dispute_message")
	private String disputeMessage;

	public Challan() {

	}

	public Challan(long id, Date challanDate, Time challanTime, long pincode, String imageProof, long policePersonelId,
			String vehiclePlateNumber, String violations, int totalFine, Date dueDate, boolean isDueDateValid,
			boolean isChallanClosed, boolean isChallanDisputed, String disputeMessage) {
		super();
		this.id = id;
		this.challanDate = challanDate;
		this.challanTime = challanTime;
		this.pincode = pincode;
		this.imageProof = imageProof;
		this.policePersonelId = policePersonelId;
		this.vehiclePlateNumber = vehiclePlateNumber;
		this.violations = violations;
		this.totalFine = totalFine;
		this.dueDate = dueDate;
		this.isDueDateValid = isDueDateValid;
		this.isChallanClosed = isChallanClosed;
		this.isChallanDisputed = isChallanDisputed;
		this.disputeMessage = disputeMessage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(Date challanDate) {
		this.challanDate = challanDate;
	}

	public Time getChallanTime() {
		return challanTime;
	}

	public void setChallanTime(Time challanTime) {
		this.challanTime = challanTime;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getImageProof() {
		return imageProof;
	}

	public void setImageProof(String imageProof) {
		this.imageProof = imageProof;
	}

	public long getPolicePersonelId() {
		return policePersonelId;
	}

	public void setPolicePersonelId(long policePersonelId) {
		this.policePersonelId = policePersonelId;
	}

	public String getVehiclePlateNumber() {
		return vehiclePlateNumber;
	}

	public void setVehiclePlateNumber(String vehiclePlateNumber) {
		this.vehiclePlateNumber = vehiclePlateNumber;
	}

	public String getViolations() {
		return violations;
	}

	public void setViolations(String violations) {
		this.violations = violations;
	}

	public int getTotalFine() {
		return totalFine;
	}

	public void setTotalFine(int totalFine) {
		this.totalFine = totalFine;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isDueDateValid() {
		return isDueDateValid;
	}

	public void setDueDateValid(boolean isDueDateValid) {
		this.isDueDateValid = isDueDateValid;
	}

	public boolean isChallanClosed() {
		return isChallanClosed;
	}

	public void setChallanClosed(boolean isChallanClosed) {
		this.isChallanClosed = isChallanClosed;
	}

	public boolean isChallanDisputed() {
		return isChallanDisputed;
	}

	public void setChallanDisputed(boolean isChallanDisputed) {
		this.isChallanDisputed = isChallanDisputed;
	}

	public String getDisputeMessage() {
		return disputeMessage;
	}

	public void setDisputeMessage(String disputeMessage) {
		this.disputeMessage = disputeMessage;
	}

	@Override
	public String toString() {
		return "Challan [id=" + id + ", challanDate=" + challanDate + ", challanTime=" + challanTime + ", pincode="
				+ pincode + ", imageProof=" + imageProof + ", policePersonalId=" + policePersonelId
				+ ", vehiclePlateNumber=" + vehiclePlateNumber + ", violations=" + violations + ", totalFine="
				+ totalFine + ", dueDate=" + dueDate + ", isDueDateValid=" + isDueDateValid + ", isChallanClosed="
				+ isChallanClosed + ", isChallanDisputed=" + isChallanDisputed + ", disputeMessage=" + disputeMessage
				+ "]";
	}

}
