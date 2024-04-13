package com.shilpa.chatserver.model;


public class Message {
	private String senderName;
    private String receiverName;		
    private String message;
    private String date;
    private Status status;
    
    
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String senderName, String receiverName, String message, String date, Status status) {
		super();
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.message = message;
		this.date = date;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Message [senderName=" + senderName + ", receiverName=" + receiverName + ", message=" + message
				+ ", date=" + date + ", status=" + status + "]";
	}
}
