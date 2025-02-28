package com.multi.animul.cs;

public class NoticeVO {

	private int notice_id;
	private String notice_title;
	private String notice_content;
	private String notice_date;
	private String member_id;
	private String notice_category;
	private String notice_status;
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public String getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getNotice_category() {
		return notice_category;
	}
	public void setNotice_category(String notice_category) {
		this.notice_category = notice_category;
	}
	public String getNotice_status() {
		return notice_status;
	}
	public void setNotice_status(String notice_status) {
		this.notice_status = notice_status;
	}
	@Override
	public String toString() {
		return "NoticeVO [notice_id=" + notice_id + ", notice_title=" + notice_title + ", notice_content="
				+ notice_content + ", notice_date=" + notice_date + ", member_id=" + member_id + ", notice_category="
				+ notice_category + ", notice_status=" + notice_status + "]";
	}
	
	
	
}
