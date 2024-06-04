package com.infosys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int msgId;
	private String fromUsername;
	private String toUsername;
	private String message;
	public Message() {
		super();
	}
	public Message(int msgId, Registration registration, String fromUsername, String toUsername, String message) {
		super();
		this.msgId = msgId;
		this.fromUsername = fromUsername;
		this.toUsername = toUsername;
		this.message = message;
	}
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public String getFromUsername() {
		return fromUsername;
	}
	public void setFromUsername(String fromUsername) {
		this.fromUsername = fromUsername;
	}
	public String getToUsername() {
		return toUsername;
	}
	public void setToUsername(String toUsername) {
		this.toUsername = toUsername;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [msgId=" + msgId + ", fromUsername=" + fromUsername
				+ ", toUsername=" + toUsername + ", message=" + message + "]";
	}
	
	
	
}
