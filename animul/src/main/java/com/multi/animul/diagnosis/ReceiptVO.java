package com.multi.animul.diagnosis;

import java.util.Date;

public class ReceiptVO {
	private String receipt_id;
	private String receipt_myid;
	private String receipt_hospitalname;
	private String receipt_address;
	private Date receipt_date;
	private int receipt_price;
	
	public String getReceipt_id() {
		return receipt_id;
	}
	public void setReceipt_id(String receipt_id) {
		this.receipt_id = receipt_id;
	}
	public String getReceipt_myid() {
		return receipt_myid;
	}
	public void setReceipt_myid(String receipt_myid) {
		this.receipt_myid = receipt_myid;
	}
	public String getReceipt_hospitalname() {
		return receipt_hospitalname;
	}
	public void setReceipt_hospitalname(String receipt_hospitalname) {
		this.receipt_hospitalname = receipt_hospitalname;
	}
	public String getReceipt_address() {
		return receipt_address;
	}
	public void setReceipt_address(String receipt_address) {
		this.receipt_address = receipt_address;
	}
	public Date getReceipt_date() {
		return receipt_date;
	}
	public void setReceipt_date(Date receipt_date) {
		this.receipt_date = receipt_date;
	}
	public int getReceipt_price() {
		return receipt_price;
	}
	public void setReceipt_price(int receipt_price) {
		this.receipt_price = receipt_price;
	}

	
	@Override
	public String toString() {
		return "Receipt_itemVO [receipt_id=" + receipt_id + ", receipt_myid=" + receipt_myid + ", receipt_hospitalname="
				+ receipt_hospitalname + ", receipt_address=" + receipt_address + ", receipt_date=" + receipt_date
				+ ", receipt_price=" + receipt_price + "]";
	}
}
